package main.java.workbook2.methodcompare;

import java.util.Scanner;

class StringUtil {
    static boolean isPalindrome(String s) {
        // TODO: 회문 여부 판단
        if (s == null){ // 입력 값이 없을 때 예외 처리
            return false;
        }

        int left = 0;
        int right = s.length()-1;

        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String str = sc.next();
            // TODO: StringUtil.isPalindrome 호출 후 출력
            boolean result = StringUtil.isPalindrome(str);
            System.out.println(result);
        } finally {
            sc.close();
        }
    }
}
