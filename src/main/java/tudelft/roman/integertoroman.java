package tudelft.roman;

import java.util.HashMap;
import java.util.Scanner;

public class integertoroman {
    private static int[] bases = {9, 7, 5, 3, 1};
    private static HashMap<Integer, String> map = new HashMap<Integer, String>();

    private static void setup() {
        map.put(1, "I");
        map.put(3, "III");
        map.put(5, "V");
        map.put(7, "XII");
        map.put(9, "IX");
    }

    public String intToRoman(int num) {
        setup();
        String result = new String();
        for (int i : bases) {
            while (num >= i) {
                result += map.get(i);
                num -= i;
            }
        }
        return result;
    }

    public static void main(String arg[]) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        integertoroman in = new integertoroman();
        int value = no;
        String sd = in.intToRoman(value);
        System.out.println(value + " ---> " + sd);
    }
}