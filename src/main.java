public class main {

    //user stories:
    /*1 as a manager I want to see all stores names so I know which store is doing what
     2) as a manager I want a report to have all stations ID numbers so that if we have 2 of the same store I know which is which
     3)  as a manager I want a report to show daily results for each store
     4) as a store owner I want to be able to input specific guidelines like max participats so that we know how muc business im bringing it
     5) as a store owner I want to be able to input number of available supplies on my report so that I know how much I started with and sold that day


     // Inheritance:
        I chose inheritance because I believe that all of the differnet stations while related in their similar properties like
        name ID numbers and SOME "daily results" , I think stations that have different effecting factors like max participants vs limited number of supplies
        should have their report generated differently to display their contibutions correctly

        Also,  when calculating each stations revenue, Limited supplies stations will be based on supplies sold
        Where Participants stations will be based on the number of participants
     */

    public static void main(String[] args){

        LimitedSupplies ls = new LimitedSupplies();
        ls.stationInput();
        ls.generateReport(ls.getName(), ls.getId());
        //ls.calculateProfit();


        MaximumNumberofParticipants mp = new MaximumNumberofParticipants();
        mp.stationInput();
        mp.generateReport(mp.getName(), mp.getId());
    }

}
