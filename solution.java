package JavaTest.main;

import java.util.*;

public class solution {
    public int s(int N) {
        // write your code in Java SE 8
        String s = convertBinary(N);
        List<Integer> lstLen = new ArrayList<Integer>();
        int len = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                lstLen.add(len);
                if (len > maxLen) {
                    maxLen = len;
                }
                len = 0;
            } else {
                len ++;
            } 
        }
        return maxLen;
    }
    
    private String convertBinary(int sum) {
        StringBuffer binary = new StringBuffer();
        while (sum != 0 && sum != 1) {
            binary.insert(0, sum % 2);
            sum = sum / 2;
            if (sum == 0 || sum == 1) {
                binary.insert(0, sum % 2);
            }
        }
        return binary.toString();
    }
}
