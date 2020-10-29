import java.util.Scanner;

public class StringOps5 {
    // Swap case for all characters
    static void toggleString(String s) {
        String toggledString = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                toggledString = toggledString + Character.toLowerCase(s.charAt(i));
            } else {
                toggledString = toggledString + Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.println("The toggled string is : " + toggledString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close();
        toggleString(s);
    }
}
