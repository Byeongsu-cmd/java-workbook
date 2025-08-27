package main.java.workbook2.methodcompare;

import java.util.InputMismatchException;
import java.util.Scanner;

class Statistics {
    static int count = 0;
    static int sum = 0;

    void addNumber(int n) {
        // TODO: count와 sum 갱신
        sum += n;
        count++;
    }

    static double average() {
        // TODO: 평균 반환
        if (count == 0) { // 입력이 0일 때 예외 처리
            return 0;
        }
        return (double) sum / count;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            Statistics stat = new Statistics();
            for (int i = 0; i < n; i++) {
                stat.addNumber(sc.nextInt());
            }
            // TODO: Statistics.average() 출력
            System.out.println(Statistics.average());
        } catch (InputMismatchException e) { // 숫자 이외의 값을 입력 시
            System.out.println("숫자만 입력해 주세요!"); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}