import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MaximumNumberofParticipants extends Stations{

    private int number_of_participants;
    private int max_participants = 100;
    private double price = 2.25;
    private int prizes_awareded;


    //getters:

    public int getNumber_of_participants() {
        return number_of_participants;
    }

    public int getMax_participants() {
        return max_participants;
    }

    public double getPrice() {
        return price;
    }

    public int getPrizes_awareded() {
        return prizes_awareded;
    }

    //setters:


    public void setNumber_of_participants(int number_of_participants) {
        this.number_of_participants = number_of_participants;
    }

    public void setMax_participants(int max_participants) {
        this.max_participants = max_participants;
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
            System.out.print("Enter Number of Participants : ");
            setNumber_of_participants(Integer.parseInt(bufferedReader.readLine()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void generateReport(String name, int id) {
        System.out.println("Station: " + name + "\n Station ID: " + id + "\n Total Participants: " + number_of_participants + "\n Max Participants Allowed: " + max_participants + "\n Price per game: $" + price);
    }


    /*
    public void calculateProfit() {
        double revenue = number_of_participants * price;
        this.profit = revenue;
    }
    */


}
