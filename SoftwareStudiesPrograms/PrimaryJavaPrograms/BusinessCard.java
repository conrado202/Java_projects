import java.util.Scanner;

public class BusinessCard {
    public static void main(String[] args) {

/*Definition of inputs to business card*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me your name: ");
        String name = scanner.next();

        System.out.println("Give me your surname: ");
        String surname = scanner.next();

        System.out.println("Give me your phone number: ");
        int tel = scanner.nextInt();

        System.out.println("Give me your city: ");
        String city = scanner.next();

        String nameSurname = "* " + name + " " + surname + " *";
        String telCity = "* tel. " + tel + " adres: " + city + " *";
        int telCityLength = telCity.length();
        int nameSurnameLength = nameSurname.length();
        int spaceNumber = 0;

/*Check which description length is longer*/
        int overallLength = 0;
            if (nameSurnameLength > telCityLength){
                overallLength = nameSurnameLength;
                spaceNumber = nameSurnameLength - telCityLength;
            } else {
                overallLength = telCityLength;
                spaceNumber = telCityLength - nameSurnameLength;
            }

/*Stars generation*/
        String stars = "";
            for (int i=0; i<overallLength; i++){
                stars = stars  + "*";
            }
        //stars = "*".repeat(overallLength);

/*Spaces and proper name and address shape generation*/
        String space = "";
        for (int i=0; i<spaceNumber; i++){
            space = space  + " ";
        }

        if (nameSurnameLength > telCityLength){
            nameSurname = "* " + name + " " + surname + " *";
            telCity = "* tel. " + tel + " adres: " + city + space + " *";
        } else {
            nameSurname = "* " + name + " " + surname + space + " *";
            telCity = "* tel. " + tel + " adres: " + city + " *";
        }



/*Show business card on window*/
        System.out.println(stars);
        System.out.println(nameSurname);
        System.out.println(telCity);
        System.out.println(stars);

    }
}