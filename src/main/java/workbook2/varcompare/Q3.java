package main.java.workbook2.varcompare;

import java.util.Scanner;

class Student {
    static int studentCount = 0;
    int id;
    String name;

    Student(String name) { // 생성자
        // TODO: studentCount 증가 후 id에 할당
        this.name = name;

        // 생성자가 생성될 때마다 학생 수 +1, id에 +1 더하고 저장
        studentCount++;
        id += studentCount;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { // 입력 받은 n의 값 만큼 반복
            String name = sc.next(); // 이름 입력받음
            Student stu = new Student(name); // 객체 생성
            System.out.println(stu.name + " " + stu.id); // 객체를 통해 name,id 값 출력
        }
    }
}