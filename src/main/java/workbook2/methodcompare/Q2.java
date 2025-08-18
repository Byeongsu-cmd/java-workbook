package main.java.workbook2.methodcompare;

import java.util.InputMismatchException;
import java.util.Scanner;

class MathUtil {
    static int square(int n) { // 클래스 메서드
        // TODO: n의 제곱 반환
        return n * n;
    }

    int cube(int n) { // 인스턴스 메서드
        // TODO: n의 세제곱 반환
        return n * n * n;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt(); // 계산하길 바라는 정수 입력

            int sq = MathUtil.square(n); // 클래스 메서드 호출

            MathUtil util = new MathUtil(); // 객체 생성

            int cu = util.cube(n); // 인스턴스 변수 호출

            // TODO: sq와 cu 출력
            System.out.println(sq + " " + cu);
        } catch (InputMismatchException e) { // 숫자 이외의 값을 입력 시
            System.out.println("숫자만 입력해 주세요!"); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}
