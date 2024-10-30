package pluralsight;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    @Override
    public  double getValue(){
       switch (condition){
           double value = 0;
           case 1:
               System.out.println("$80.00 per square foot(Poor)");
               value = 80;
               break;
           case 2:
               System.out.println("$90.00 per square foot(Fair)");
               value=90;
               break;
           case 3:
               System.out.println("$130.00 per square foot(Good)");
               value=130;
               break;
           case 4:
               System.out.println("180.00 per square foot(Excellent)");
               value=180;
               break;
       }

        return value;
    }
}
