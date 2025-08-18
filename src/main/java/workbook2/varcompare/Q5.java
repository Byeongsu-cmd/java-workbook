package main.java.workbook2.varcompare;

import java.util.Scanner;

/*
클래스 변수 - 클래스가 여러번 생성 되어도 처음 한 번만 실행
           동일한 클래스의 모든 객체들에 의해서 공유된다.

인스턴스 변수 - 객체 생성마다 새로운 변수 생성
            클래스 변수와 달리 공유되지 않는다.
 */
class Library {
    static int totalBooks = 0; // 클래스 변수
    int borrowed = 0; // 인스턴스 변수

    void borrow(int n) {
        // TODO: borrowed와 totalBooks 증가
        borrowed += n;
        totalBooks += n;
    }

    void returnBooks(int n) {
        // TODO: borrowed와 totalBooks 감소
        borrowed -= n;
        totalBooks -= n;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library user = new Library(); // 객체 생성

        int commands = sc.nextInt();

        for (int i = 0; i < commands; i++) {
            String cmd = sc.next();
            int n = sc.nextInt();

            if (cmd.equals("borrow")) user.borrow(n); // 만약 입력 값이 borrow와 같다면 borrow 메서드 호출
            else user.returnBooks(n); // 그 이외의 값이라면 returnBooks 메서드 호출
        }

        // TODO: user.borrowed와 Library.totalBooks 출력
        System.out.println(user.borrowed+" "+user.totalBooks);
    }
}
