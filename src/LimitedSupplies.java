import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LimitedSupplies extends Stations{

    private int  total_supplies;
    private int total_sold;
    private double price = 8.00;


    //getters

    public int getTotal_supplies() {
        return total_supplies;
    }

    public int getTotal_sold() {
        return total_sold;
    }

    public double getPrice() {
        return price;
    }

    //setters


    public void setTotal_supplies(int totalSupplies) {
        this.total_supplies = total_supplies;
    }

    public void setTotal_sold(int total_sold) {
        this.total_sold = total_sold;
    }

    @Override
    public void stationInput() {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            System.out.print("Enter Station Name: ");
            setName(bufferedReader.readLine());
            System.out.print("Enter Station ID: ");
            setId(Integer.parseInt(bufferedReader.readLine()));
            System.out.print("Enter Number of Supplies at begining of day: ");
            setTotal_supplies(Integer.parseInt(bufferedReader.readLine()));
            System.out.print("Enter Number of items sold: ");
            setTotal_sold(Integer.parseInt(bufferedReader.readLine()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void generateReport(String name, int id) {
        System.out.println("Station: " + name + "\n Station ID: " + id + "\n Total Supplies: " + total_supplies + "\n Total Sold: " + total_sold + "\n Price per item: $" + price);
    }

    /*
    public void calculateProfit() {
        double revenue = total_sold * price;
        this.profit = revenue;
    }
    */
}
