import java.util.Random;

public class AsciiChars {

    public static void magicBallNo() {
        Random rand = new Random();
        // int[] magicNo = new int[65];
        // int[] magicNoArray = new int[5];
        int magicNumber = (rand.nextInt(65));
        System.out.println(magicNumber);
        int randomNumber = (rand.nextInt(75));
        System.out.println(randomNumber);

        // for (int i = 0; i < magicNo.length; i++) {
        // magicNo[i] = i;
        // }

        // for (int index = 0; index < magicNoArray.length; index++) {
        // randomNumber = (int) (rand.nextInt(magicNo.length) + 1);
        // // System.out.println(randomNumber);
        // magicNoArray[index] = randomNumber;
        // System.out.println(magicNoArray[index]);
        // }
    }

    public static void printNumbers() {

        for (int i = 48; i <= 57; i++) {
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
        }
    }

    public static void printLowerCase() {
        for (int i = 97; i <= 122; i++) {
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
        }
    }

    public static void printUpperCase() {
        for (int i = 65; i <= 90; i++) {
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
        }
    }
}