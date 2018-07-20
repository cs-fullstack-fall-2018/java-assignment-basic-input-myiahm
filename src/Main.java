import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("It’s a great day today");
        System.out.println("What is your name?: ");

        Scanner scanIn = new Scanner(System.in);


        String name = scanIn.nextLine();
        System.out.println("Hello " + name );



        System.out.print("Enter a number:  ");
        int number = scanIn.nextInt();
        System.out.println("Enter another number please: ");


        int number2 = scanIn.nextInt();

        System.out.println( number+ number2 );

        System.out.println("Enter your balance: ");
        System.out.println("I've Granted you $2 more. Your new balance is" + );






    }
}
