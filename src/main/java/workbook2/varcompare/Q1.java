package main.java.workbook2.varcompare;

class Counter {
    static int count = 0; // 클래스 변수 선언
    int id; // 인스턴스 변수 선언

    Counter() {
        // TODO: count 증가 후 id에 할당
        count++;
        id += count;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Counter c1 = new Counter(); // 객체 생성

        System.out.println(c1.id + " " + Counter.count); // 객체를 통해 id,count 값 출력

        Counter c2 = new Counter(); // 객체 생성

        System.out.println(c2.id + " " + Counter.count); // 객체를 통해 id,count 값 출력
    }
}
