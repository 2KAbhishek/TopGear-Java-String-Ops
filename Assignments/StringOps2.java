import java.util.Scanner;

public class StringOps2 {

    // Count upper case and lower case character in given string
    static void displayCount(String s) {
        int upperCount = 0, lowerCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                upperCount++;
            if (Character.isLowerCase(s.charAt(i)))
                lowerCount++;
        }

        if (lowerCount != upperCount) {
            System.out.println("Uppercase Count: " + upperCount);
            System.out.println("Lowercase Count: " + lowerCount);
        } else
            System.out.println("Equally Distributed");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close();
        displayCount(s);
    }

}
