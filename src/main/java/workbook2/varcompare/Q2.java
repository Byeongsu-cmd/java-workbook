package main.java.workbook2.varcompare;

import java.util.Scanner;

class Car {
    static int totalCars = 0;
    String name;

    Car(String name) { // 생성자
        this.name = name;
        // TODO: totalCars 증가
        totalCars++; // 생성자 생성할 때마다 +1
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 브랜드 명 입력
        String n1 = sc.next();
        String n2 = sc.next();
        String n3 = sc.next();

        // 객체 생성
        Car c1 = new Car(n1);
        Car c2 = new Car(n2);
        Car c3 = new Car(n3);

        // 객체를 통해 name과 totalCars 출력
        System.out.println(c1.name + " " + Car.totalCars);
        System.out.println(c2.name + " " + Car.totalCars);
        System.out.println(c3.name + " " + Car.totalCars);
    }
}
