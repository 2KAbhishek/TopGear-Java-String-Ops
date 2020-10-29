import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StringOps9 {

    // Sort and extract odd position characters in string
    static void sortOddString(String s, CaseSensitive cs) {
        StringBuilder strOddValue = new StringBuilder();
        char charStr[] = s.toCharArray();
        Character[] charString = new Character[charStr.length];

        for (int i = 0; i < charStr.length; i++)
            charString[i] = charStr[i];

        // Sort using custom case insensitive comparator
        Arrays.sort(charString, cs);
        System.out.println(Arrays.toString(charString));

        // Add odd positioned characters to new string (Note: not odd indexed)
        for (int i = 0; i < charString.length; i += 2)
            strOddValue.append(charString[i]);

        System.out.println(strOddValue);
    }

    public static void main(String[] args) {
        CaseSensitive caseSensitive = new CaseSensitive();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close();
        sortOddString(s, caseSensitive);
    }
}

class CaseSensitive implements Comparator<Character> {
    // comparator to sort characters case insensitively
    @Override
    public int compare(Character o1, Character o2) {
        if (Character.isUpperCase(o1))
            o1 = Character.toLowerCase(o1);

        if (Character.isUpperCase(o2))
            o2 = Character.toLowerCase(o2);

        return o1.compareTo(o2);
    }
}
