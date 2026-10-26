import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stations {

    private String name;
    private int id;
    private double profit;




    //getters:


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    //setters:
    public void setName(String name) {
        if (name.equals("") || name == null) {                          // have to use .equals()   NOT == when dealing with  refrence types (strs)
            System.out.println("Must have a name");
        } else {
            this.name = name;
        }
    }

    public void setId(int id) {
        if (name.equals("") || name == null) {
            System.out.println("Must have a valid ID");
        } else  {
            this.id = id;
        }
    }


    public void stationInput() {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            System.out.print("Enter Station Name: ");
            setName(bufferedReader.readLine());
            System.out.print("Enter Station ID: ");
            setId(Integer.parseInt(bufferedReader.readLine()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void generateReport(String name, int id) {
        System.out.println("Station: " + name + "\n Station ID: " + id + "\n participated in the event today");
    }

    /*
    public abstract double calculateProfit();

    public void generateProfit() {
        double calculated = calculateProfit();

        this.profit = calculated;
    }
    */
}
