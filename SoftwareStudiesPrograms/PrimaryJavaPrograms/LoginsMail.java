import java.util.Scanner;

public class LoginsMail {
    public static void main(String[] args) {

//        insertName();


            String[] studentNames = { "Budynek Piotr",
                                    "Chalupa Krystyna",
                                    "Wiezowiec Jan",
                                    "Szkieletor Andrzej",
                                    "Domek Marianna" };


            String[] lowerCase = new String[studentNames.length];

            for (int i = 0; i < studentNames.length; i++) {
                lowerCase[i] = studentNames[i].toLowerCase();
                String splitted = lowerCase[i].split("( )");
//                mailAddress = studentNames[i].split("( )",2);
                System.out.println(lowerCase[i] + "@student.agh.edu.pl");
                System.out.println(splitted + "@student.agh.edu.pl");
            }
                }


   /* public static void insertName(){

//        String[] names = new String[500];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your name and surname: ");
        String nameInserted = scanner.nextLine();
        *//*for(int i = 0; i<names.length; i++){
            names[i] = nameInserted;
        }*//*
        System.out.println("Your name and surname is: " + nameInserted);
    }*/

}
