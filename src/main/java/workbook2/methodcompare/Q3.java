package main.java.workbook2.methodcompare;

import java.util.InputMismatchException;
import java.util.Scanner;

class Converter {
    static double toCelsius(double f) {
        // TODO: 섭씨로 변환
        // 화씨→섭씨: (F - 32) * 5/9
        return (f - 32) * 5 / 9;
    }

    double toFahrenheit(double c) {
        // TODO: 화씨로 변환
        // 섭씨→화씨: C * 9/5 + 32
        return c * 9/5 + 32;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double f = sc.nextDouble();
            double c = sc.nextDouble();

            double cRes = Converter.toCelsius(f); // 클래스 메서드 호출

            Converter conv = new Converter(); // 객체 생성

            double fRes = conv.toFahrenheit(c); // 인스턴스 메서드 호출

            // TODO: cRes와 fRes 출력
            System.out.println(cRes + " " + fRes);
        } catch (InputMismatchException e) { // 숫자 이외의 값을 입력 시
            System.out.println("숫자만 입력해 주세요!"); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}
