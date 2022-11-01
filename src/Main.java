import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("New age cafe VVelcoms you!!!");
        Scanner scanner = new Scanner(System.in);
        String stopLine="";
        ArrayList<ArrayList<Integer>> availableTables = new ArrayList<>();


        while (!Objects.equals(stopLine, "stop")) {
            ArrayList<Integer> rows = new ArrayList<>();

            System.out.println("Available rows of tables lol lmao funny even");


            rows.add(scanner.nextInt());
            rows.add(scanner.nextInt());
            rows.add(scanner.nextInt());
            availableTables.add(rows);

            Human human = new Human(availableTables);

            System.out.println("this fucker is " + human.fullName);
            System.out.println("he wants to book for this time" + human.bookingTime);

            //Random random = new Random();
            //int customers = random.nextInt(0,4);



           //System.out.println(customers);

            stopLine = scanner.nextLine();
        }

    }
}




