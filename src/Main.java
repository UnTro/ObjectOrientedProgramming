import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/*

        we have created class human, object creates with a cringe ass CONSTRUCTOR , for some reason ,whenever an instance of an object is created ,
        it saves in memory every memory element that initialises in the class , i.e. 2D arraylist of names from which the programm randomly generates names
        for customers is created (allegedly by an untrustworthy source (R)) every time i call an object

        Now i need to work around tables . Functionality of









 */
public class Main {
                                         /*                            JUST INITIALISATION               */
    public static void main(String[] args) {
        System.out.println("New age cafe VVelcoms you!!!");
        Scanner scanner = new Scanner(System.in);

        String stopLine="";
        ArrayList<ArrayList<Integer>> availableTables = new ArrayList<>();

        int posRow=1;
        int posCollumn=1;
                                          /*                            CREATING ARRAY OF OBJECTS               */
        ArrayList<ArrayList<Tables>> tabela = new ArrayList<>();

        for (int i=0; i<=3; i++) {
            ArrayList<Tables> row = new ArrayList<>();

            for (int j=0; j<=3; j++) {
                row.add(new Tables(posRow, posCollumn));
                posCollumn++;
            }
            tabela.add(row);
            posRow++;
            posCollumn=1;
        }
        tabela.add(new ArrayList<Tables>());
        tabela.get(4).add(new Tables(5,5));


        System.out.println(tabela.toString());  // printing out for testing purposes
                                        /*                     ENTER AREA, ACCESSING INITIAL DATA                 */




        while (!Objects.equals(stopLine, "stop")) {


            Human human = new Human(tabela);

            System.out.println("this fucker is " + human.fullName);

            System.out.println("what table do you want to check");

            if (tabela.get(scanner.nextInt()).get(scanner.nextInt()).checkTable(human.parser()))
            {System.out.println("It's clean");}
            else  {System.out.println("it's not clean");}






            //Random random = new Random();
            //int customers = random.nextInt(0,4);



           //System.out.println(customers);

            stopLine = scanner.nextLine();
        }

    }
}




