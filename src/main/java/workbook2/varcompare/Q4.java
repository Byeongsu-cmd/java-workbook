package main.java.workbook2.varcompare;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
클래스 변수 - 클래스가 여러번 생성되어도 처음 한 번만 실행,
           동일한 클래스의 모든 객체들에 의해서 공유된다.

인스턴트 변수 - 객체 생성마다 새로운 변수 생성
            클래스 변수와 달리 공유되지 않는다.
 */
class Product {
    static int totalSold = 0; // 클래스 변수
    int stock; // 인스턴스 변수

    Product(int stock) {
        this.stock = stock;
    }

    void sell(int quantity) {
        // TODO: stock 감소, totalSold 증가
        stock -= quantity;
        totalSold += quantity;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int initialStock = sc.nextInt();

            Product p = new Product(initialStock); // 객체 생성

            for (int i = 0; i < 2; i++) { // 2번만 반복
                String cmd = sc.next();
                int q = sc.nextInt();
                p.sell(q);
            }

            // TODO: p.stock과 Product.totalSold 출력
            System.out.println(p.stock + " " + p.totalSold);
        } catch (InputMismatchException e){ // 숫자 이외의 입력 시
            System.out.println("숫자만 입력해 주세요"); // 예외 처리
        } finally{ // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}
