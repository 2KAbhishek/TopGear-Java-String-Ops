import java.util.Scanner;

public class StringOps10 {
    // Get string age, Age = length of string + alphabetical index of last letter.
    static void ageString(String s) {
        s = s.trim();
        int len = s.length();
        int firstValue = 0;
        if (Character.isLowerCase((s.charAt(len - 1)))) {
            firstValue = 'a';
        } else if (Character.isUpperCase((s.charAt(len - 1)))) {
            firstValue = 'A';
        }
        int lastChar = s.charAt(len - 1);
        int age = len + (lastChar - firstValue + 1);
        System.out.println("Age of string : " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close();
        ageString(s);
    }
}
