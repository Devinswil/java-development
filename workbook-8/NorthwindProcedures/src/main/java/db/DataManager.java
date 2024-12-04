package db;

import models.CustomerOrderHistory;
import models.SalesByYear;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataManager {
private BasicDataSource dataSource;

    public DataManager(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }
    public List<CustomerOrderHistory> searchOrderHistory(String customerId){
        List<CustomerOrderHistory>orderHistoryList = new ArrayList<>();

        try(Connection connection=dataSource.getConnection();
            CallableStatement statement = connection.prepareCall("{CALL CustOrderHist(?)}")) {
            statement.setString(1,customerId);

            try(ResultSet results = statement.executeQuery()){
                while(results.next()){
                    String productName = results.getString("ProductName");
                    int totalQuantity=results.getInt("Total");

                    CustomerOrderHistory history= new CustomerOrderHistory(productName,totalQuantity);
                    orderHistoryList.add(history);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return orderHistoryList;
    }
public List<SalesByYear> SoldPerYear(String beginningDate, String endingDate ){
        List<SalesByYear> perYear = new ArrayList<>();

    try(Connection connection=dataSource.getConnection();
        CallableStatement statement = connection.prepareCall("{CALL `Sales by Year`(?, ?)}")) {


        statement.setDate(1, java.sql.Date.valueOf(beginningDate));
        statement.setDate(2, java.sql.Date.valueOf(endingDate));

        try(ResultSet results = statement.executeQuery()){
            while(results.next()){
                Date shipDate = results.getDate("ShippedDate");
                int orderId=results.getInt("OrderID");
                double subTotal=results.getDouble("`Order Subtotals`");
                int year = results.getInt("Year");

SalesByYear salesByYear = new SalesByYear(shipDate,orderId,subTotal,year);
                perYear.add(salesByYear);
            }
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }


    return perYear;
}


}

