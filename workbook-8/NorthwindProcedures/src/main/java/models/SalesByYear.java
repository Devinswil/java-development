package models;

import java.util.Date;

public class SalesByYear {
    private Date shippedDate;
    private int orderId;
    private double subTotal;
    private int year;

    public SalesByYear(Date shippedDate, int orderId, double subTotal, int year) {
        this.shippedDate = shippedDate;
        this.orderId = orderId;
        this.subTotal = subTotal;
        this.year = year;
    }

}
