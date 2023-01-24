import java.util.ArrayList;
import java.util.Scanner;

public class Realize {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> listt=new ArrayList();

    public static void enteringProgram(String wantedMenuText) {
        System.out.println(wantedMenuText);
    }


    //Bu metod istifadeci terefinden daxil edilen melumatlarla klasi doldurur ve qaytarir.
    public void registerStudent() {

        System.out.println("Nece telebe daxil edeceksiniz");
        int studentQuantity = scanner.nextInt();
        for (int i = 0; i < studentQuantity; i++) {
        Student student = new Student();
            System.out.println("Adi daxil edin: ");
            student.setName(scanner.next());
            System.out.println("Soyadi daxil edin");
            student.setSurname(scanner.next());
            System.out.println("Sinifi daxil edin");
            student.setClassName(scanner.next());
            System.out.println("Yashi daxil edin");
            student.setAge(scanner.nextInt());
            listt.add(student);
        }

    }

    public void ShowStudents() {


        for (int i = 0; i < listt.size(); i++) {
            System.out.println(listt.get(i).getSurname() + " " + listt.get(i).getName() + " - " +
                    listt.get(i).getAge() + " yash" + " : " + listt.get(i).getClassName() + " sinifi");
        }
    }

    public void findStudents() {
        System.out.println("Axtarilan adi ve ya hisseni daxil edin");
        String searching = scanner.next();
        int a=0;
        for (int i=0;i<listt.size();i++){
            if(listt.get(i).getName().contains(searching)){
                System.out.println(listt.get(i).getSurname() + " " + listt.get(i).getName() + " - " +
                        listt.get(i).getAge() + " yash" + " : " + listt.get(i).getClassName() + " sinifi");
                a++;
            }
            else if(a==0){
                System.out.println("Bu adda telebe movcud deyil");
                a=0;
            }


        }
    }

    public static void updateStudents() {
    }
}
