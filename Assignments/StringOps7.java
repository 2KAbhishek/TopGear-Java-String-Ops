import java.util.Scanner;

public class StringOps7 {
    // Merge to strings into one with alternate characters
    static void mergeString(String s1, String s2) {
        StringBuilder mergedString = new StringBuilder();
        int firstLength = s1.length();
        int secondLength = s2.length();
        for (int i = 0, j = 0; i < firstLength || j < secondLength; i++, j++) {
            if (i < firstLength)
                mergedString.append(s1.charAt(i));
            if (j < secondLength)
                mergedString.append(s2.charAt(j));
        }
        System.out.println("Merged String : " + mergedString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        sc.close();
        mergeString(s1, s2);
    }
}
