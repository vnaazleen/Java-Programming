import java.lang.String;

public class ElectricityBill {

    // Instance varaibles
    private String consumerNo;
    private String consumerName;
    private int prevMonthReading;
    private int currMonthReading;
    private String typeConnection;

    // Constructor
    public ElectricityBill (String cNo, String cName, String typeCon, int prvMonthReading, int curMonthReading) {
        consumerNo = cNo;
        consumerName = cName;
        typeConnection = typeCon;
        prevMonthReading = prvMonthReading;
        currMonthReading = curMonthReading;
    }

    // Setters
    public void setConsumerNo(String cNo) {
        consumerNo = cNo;
    }

    public void setConsumerName(String cName) {
        consumerName = cName;
    }

    public void setTypeConnection(String typeCon) {
        typeConnection = typeCon;
    }

    public void setPrevMonthReading(int prvMonthReading) {
        prevMonthReading = prvMonthReading;
    }

    public void setCurrMonthReading(int curMonthReading) {
        currMonthReading = curMonthReading;
    }

    // Getters
    public String getConsumerNo() {
        return consumerNo;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public String getTypeConnection() {
        return typeConnection;
    }

    public int getPrevMonthReading() {
        return prevMonthReading;
    }

    public int getCurrMonthReading() {
        return currMonthReading;
    }

    // Calculating Electricity bill based on type of EB typeConnection
    public double getBillAmount() {
        int units = currMonthReading - prevMonthReading;
        double amount = 0;
        if (typeConnection.toLowerCase().equals("domestic")) {
            if (units <= 100) {
                amount = units;
            }
            else if (units <= 200) {
                amount = units * 2.50;
            }
            else if (units <= 500) {
                amount = units * 4;
            }
            else {
                amount = units * 6;
            }
        }
        else {
            if (units <= 100) {
                amount = units * 2;
            }
            else if (units <= 200) {
                amount = units * 2.50;
            }
            else if (units <= 500) {
                amount = units * 6;
            }
            else {
                amount = units * 7;
            }
        }

        return amount;
    }

    // Driver Code
    public static void main (String[] args) {
        ElectricityBill eb = new ElectricityBill("19BQ1A05L1", "Vaseem Naazleen", "Commercial", 5000, 5600);

        // Printing Details
        System.out.println("Customer ID: " + eb.getConsumerNo());
        System.out.println("Customer Name: " + eb.getConsumerName());
        System.out.println("Type of EB Connection: " + eb.getTypeConnection());
        System.out.println("Previous Month Reading: " + eb.getPrevMonthReading());
        System.out.println("Current Month Reading " + eb.getCurrMonthReading());

        // Calculating bill
        double bill = eb.getBillAmount();
        System.out.println("Your Bill: " + bill);

        // Chaging the type of account
        System.out.println("\nChanging the type of EB account...\n");
        eb.setTypeConnection("Domestic");

        bill = eb.getBillAmount();
        System.out.println("Your Bill: " + bill);
        
        /*
        output:

        Customer ID: 19BQ1A05L1
        Customer Name: Vaseem Naazleen
        Type of EB Connection: Commercial
        Previous Month Reading: 5000
        Current Month Reading 5600
        Your Bill: 2550.0

        Changing the type of EB account...

        Your Bill: 2150.0
        */

    }

}
