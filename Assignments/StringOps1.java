import java.util.Scanner;

public class StringOps1 {

    // Reverse the string if s and s1 are same
    static void showReverse(String s, String s1) {

        if (s.equals(s1)) {
            String reversedString = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                reversedString += s.charAt(i); // Adding character in reverse order
            }
            System.out.println("Reversed String: " + reversedString);
        } else
            System.out.println("Reverse Not Supported");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s = sc.nextLine();
        System.out.print("Enter second string: ");
        String s1 = sc.nextLine();
        sc.close();
        showReverse(s, s1);
    }

}
