import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int b = 0;
        Realize realize=new Realize();
        while (b!=5) {

            Realize.enteringProgram("What do you want to do?\n"+
                    "1. Registr student\n"+
                    "2. Show all students\n"+
                    "3. Find students\n"+
                    "4. Update students\n"+
                    "5. Exit\n"); 
            int number = realize.scanner.nextInt();
            switch (number) {
                case 1:
                    realize.registerStudent();
                    realize.ShowStudents();
                    System.out.println("\n");
                    break;
                case 2:
                    realize.ShowStudents();
                    break;
                case 3:
                    //System.out.println("Salam");
                    realize.findStudents();
                    break;
                case 4:
                    Realize.updateStudents();
                    break;
                case 5:
                    b = 5;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + realize.scanner.nextInt());
            }

        }

    }


}
