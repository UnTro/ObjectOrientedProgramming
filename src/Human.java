import java.util.ArrayList;
import java.util.Random;

public class Human {
    String fullName;
    int bookingTime;

    ArrayList<ArrayList<Integer>> wantedTable = new ArrayList<>();


    // Now that's where i want to mix all possible name configurations using ArrayList
    // it will just make an arraylist from which i will get random names .

    public static ArrayList<ArrayList<String>> naming(/*ArrayList<String> firstName, ArrayList<String> secondName*/) {

        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("John ");
        firstName.add("Garry ");
        firstName.add("Larry ");
        firstName.add("Robert ");
        ArrayList<String> secondName = new ArrayList<>();
        secondName.add("Smith");
        secondName.add("Hyde");
        secondName.add("Herrington");
        secondName.add("Albanski");


        ArrayList<ArrayList<String>> fullName = new ArrayList<>();
        for (String i : firstName) {
            ArrayList<String> line = new ArrayList<>();
            for (String j : secondName) {
                String full = i + j;
                line.add(full);

            }

            fullName.add(line);
        }
        return fullName;
    }
    Human( ArrayList<ArrayList<Integer>> availableTables) {
        Random random = new Random();



        fullName = naming().get(random.nextInt(0,4)).get(random.nextInt(0,4));
        bookingTime = random.nextInt(1,3);
        System.out.println("Hi, we have available table  № %n" +  availableTables.toString());





    }
    /*

    int hours;
    ArrayList<ArrayList<Integer>> wantedTable = new ArrayList<ArrayList<Integer>>();

    ArrayList<String> firstName = new ArrayList();




    ArrayList<String> secondName = new ArrayList<String>();
     ArrayList<ArrayList<String>> fullName = new ArrayList<ArrayList<String>>();




    Human(String name, int hours,ArrayList<ArrayList<Integer>> wantedTable) {
        Random random = new Random();
        this.hours = random.nextInt(0,2);
        this.name =
        */
    }


