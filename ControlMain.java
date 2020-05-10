import java.util.Random;
import java.util.Scanner;

public class ControlMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean repeat = true;

        System.out.println("Enter Name: ");
        String name = scan.nextLine();

        System.out.println("Do you want to continue with interactive survey? (Y or N)");
        char ans = scan.next().charAt(0);

        switch (ans) {
            case 'Y':
            case 'y':
                System.out.println("Lets continue..");
                break;
            case 'N':
            case 'n':
                System.out.println("Plz, Return back to complete the survey");
                break;
            default:
                System.out.println("Plz select proper ans");
        }
        do {
            System.out.println("Do you have a red car? (yes, no):");
            String car = scan.next();

            System.out.println("Give the name of your favourite Pet.");
            String pet = scan.next();

            System.out.println("Give the age of your favourite Pet.");
            int petAge = scan.nextInt();
            scan.nextLine();

            System.out.println("What is your Lucky No");
            int luckyNo = scan.nextInt();
            scan.nextLine();

            System.out.println("Do you have a favorite quarterback?(yes or no)");
            String qtBack = scan.next();

            System.out.println("What is your Jersey Number?");
            int jerseyNo = scan.nextInt();
            scan.nextLine();

            System.out.println("What is two-digit model year of your car?");
            int modelYr = scan.nextInt();
            scan.nextLine();

            System.out.println("What is the first name of your favorite actor or actress??");
            String firstName = scan.next();

            System.out.println("Enter a random number between 1 and 50.");
            int randNo = scan.nextInt();
            scan.nextLine();

            // magic no geneartor
            Random rand = new Random();

            int randomNo = (rand.nextInt(75));
            int magicNumber = randomNo * luckyNo;
            do {
                if (magicNumber > 75) {
                    magicNumber = magicNumber - 75;
                }
            } while (magicNumber > 75);

            // 5 lottery nos generator
            int lotteryNo1 = luckyNo + modelYr;
            int lotteryNo2;
            do {
                int randomNumber = (rand.nextInt(65));
                lotteryNo2 = randNo - randomNumber;
            } while (lotteryNo2 > 0);

            int lotteryNo3 = 42;
            int lotteryNo4 = petAge + modelYr;
            int lotteryNo5 = petAge + luckyNo + jerseyNo;

            System.out.println("lottery nos are:  " + lotteryNo1 + " ," + lotteryNo2 + " ," + lotteryNo3 + " ,"
                    + lotteryNo4 + " ," + lotteryNo5 + " magicNo :" + magicNumber);
            System.out.println("do you want to generate another set of nos?");
            String repeatAns = scan.next();
            if (repeatAns.equalsIgnoreCase("yes")) {
                repeat = true;
                System.out.println("lets play again!!");
            } else {
                repeat = false;
                System.out.println("Thanks for playing..");
            }
        } while (repeat);
        // AsciiChars.magicBallNo();
        // AsciiChars.printNumbers();
        // AsciiChars.printLowerCase();
        // AsciiChars.printUpperCase();
        scan.close();
    }
}