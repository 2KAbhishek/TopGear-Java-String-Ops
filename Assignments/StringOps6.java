import java.util.Scanner;

public class StringOps6 {
    // Rotates string depending on length
    static void rotateString(String s) {
        int strLen = s.length();
        StringBuilder rotatedString = new StringBuilder();
        if (strLen % 2 == 0) { // string rotated clockwise
            rotatedString.insert(0, s.charAt(strLen - 1));
            rotatedString.insert(1, s.substring(0, strLen - 1));
        } else { // string rotated anti-clockwise
            rotatedString.insert(0, s.substring(1, strLen));
            rotatedString.insert(strLen - 1, s.charAt(0));
        }
        System.out.println(rotatedString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close();
        rotateString(s);
    }
}
