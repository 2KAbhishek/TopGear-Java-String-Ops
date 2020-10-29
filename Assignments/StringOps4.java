import java.util.Arrays;
import java.util.Scanner;

public class StringOps4 {

    // Sort the string after spliting
    static void sortString(String s) {
        String[] words = s.split("\\s");
        Arrays.sort(words);

        System.out.println("Elements in dictionary order :");
        Arrays.stream(words).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close();
        sortString(s);
    }

}
