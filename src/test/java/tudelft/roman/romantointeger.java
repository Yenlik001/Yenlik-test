package tudelft.roman;

import java.util.HashMap;

public class romantointeger  {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);

        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i <= s.length() - 2 &&
                    hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i + 1))) {
                num -= hashMap.get(s.charAt(i));
            } else {
                num += hashMap.get(s.charAt(i));
            }
        }
        return num;
    }
}
