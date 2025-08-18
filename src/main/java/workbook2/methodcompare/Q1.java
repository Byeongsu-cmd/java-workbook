package main.java.workbook2.methodcompare;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
    static int add(int a, int b) { // 클래스 메서드
        // TODO: 덧셈 결과 반환
        return a + b;
    }

    int multiply(int a, int b) { // 인스턴스 메서드
        // TODO: 곱셈 결과 반환
        return a * b;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int x = sc.nextInt();
            int y = sc.nextInt();

            int sum = Calculator.add(x, y); // 클래스 메서드 호출

            Calculator calc = new Calculator(); // 객체 생성

            int prod = calc.multiply(x, y); // 인스턴스 메서드 호출
            // TODO: sum과 prod 출력
            // 클래스 메서드 결과 + 인스턴스 메서드 결과
            System.out.print(sum+ " " + prod);
        } catch (InputMismatchException e){ // 숫자 이외의 값을 입력 시
            System.out.println("숫자만 입력해 주세요!"); // 예외 처리
        } finally{ // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}
