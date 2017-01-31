import java.util.Scanner;
/**
 * Created by MacUser on 1/31/17.
 */
public class Lab2 {

    public static void main(String[] args){
        System.out.println("isNumber Odd/Even?");

        //Asks for and stores users name.
        Scanner scanName = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = scanName.nextLine();


        while(true) {
            Scanner scanCont = new Scanner(System.in);

            //Asks user for input number
            Scanner scanNumber = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 100: ");
            int userNumber = scanNumber.nextInt();


            if ((userNumber % 2) != 0) {
                System.out.println(userName + ", the number you entered is: " + userNumber + " and is Odd");
            } else if (((userNumber % 2) == 0) && (userNumber <= 2 & userNumber <= 25)) {
                System.out.println(userName + ", the number you entered is:" + userNumber + " , is even and less than or equal to 25");
            } else if (((userNumber % 2) == 0) && (userNumber <= 60)) {
                System.out.println(userName + ", the number you entered is: " + userNumber + " and is Even.");
            } else if (((userNumber % 2) == 0) && (userNumber > 60)) {
                System.out.println(userName + ", the number you entered is: " + userNumber + " and is Even");
            } else if (((userNumber % 2 != 0)) && (userNumber > 60)) {
                System.out.println(userName + ", the number you entered is: " + userNumber + " and is Odd");
            }
            System.out.println();
            System.out.println("Continue: (y/n)");
            char exit = scanCont.next().charAt(0);
            if (exit == 'n') {
                break;
            }

        }


    }
}
