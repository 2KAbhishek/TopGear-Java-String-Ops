import java.util.Scanner;

public class StringOps3 {
    // Find the smallest string in a whitespace-separated string
    static void smallestString(String s) {
        String temp = "";
        String[] words = s.split("\\s");
        temp = words[0];
        for (String str : words) {
            if (str.length() < temp.length()) {
                temp = str;
            }
        }
        System.out.println("Smallest String: " + temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close();
        smallestString(s);
    }

}
