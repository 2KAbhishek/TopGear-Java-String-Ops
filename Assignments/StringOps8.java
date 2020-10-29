import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringOps8 {

    static void countCharacters(String s) {
        int maxCount = 0, minCount = s.length();
        char maxChar = ' ', minChar = ' ';

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toUpperCase().toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                minChar = entry.getKey();
            }
        }

        System.out.println("Most Occurred: " + maxChar);
        System.out.println("Least Occurred: " + minChar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close();
        countCharacters(s);
    }

}
