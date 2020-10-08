import java.util.Scanner;

public class Main {

    private static final Scanner keyboard = new Scanner(System.in);

    private static void readSomeValidValue() {
        boolean isValid = false;
        while (!isValid) {
            System.out.print("\nWhat is half of " + 100 + "? ");
            String userInput = keyboard.nextLine();
            try {
                int ans = Integer.parseInt(userInput);
                if (ans <= 0) {
                    throw new Exception();
                }
                isValid = true;
            } catch (Exception e) {
                isValid = false;
                System.out.println("You answered: " + userInput);
                System.out.println("You must enter a positive number with no decimals");
            }
        }
    }


    public static void main(String[] args) {
        // readSomeValidValue();
        //String ans;
        for (int i = 50; i >= -50; i--) {
            if (i == 0) {
                System.out.printf("360 / %d = %s%n", i, "Infinity");
            } else {
                System.out.printf("360 / %d = %3d%n", i, 360 / i);
            }
        }
/*
        String answer;
        for (int i = 50; i >= -50; i--) {
            if (i == 0) {
                answer = "Infinity";
            } else {
                System.out.printf("360 / %d = %3d%n", i, 360 / i);
            }
            System.out.printf("360 / %d = %s%n", i, answer);
        }

 */


    }
}
