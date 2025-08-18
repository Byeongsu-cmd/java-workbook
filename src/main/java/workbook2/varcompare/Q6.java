package main.java.workbook2.varcompare;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
클래스 변수 - 클래스가 여러번 생성 되어도 처음 한 번만 실행
           동일한 클래스의 모든 객체들에 의해서 공유된다.

인스턴스 변수 - 객체 생성마다 새로운 변수 생성
            클래스 변수와 달리 공유되지 않는다.
 */
class ChatRoom {
    static int totalUsers = 0; // 클래스 변수
    String name; // 인스턴스 변수
    int messagesSent = 0; // 인스턴스 변수

    ChatRoom(String name) {
        this.name = name;
    }

    void sendMessages(int n) {
        // TODO: messagesSent와 ChatRoom.totalUsers 증가
        messagesSent += n;
        totalUsers++;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String name1 = sc.next();
            int m1 = sc.nextInt();

            String name2 = sc.next();
            int m2 = sc.nextInt();

            // 객체 생성
            ChatRoom u1 = new ChatRoom(name1);
            ChatRoom u2 = new ChatRoom(name2);

            // 메서드 호출
            u1.sendMessages(m1);
            u2.sendMessages(m2);

            // TODO: 각 사용자 이름과 messagesSent, ChatRoom.totalUsers 출력
            System.out.println(u1.name + " " + u1.messagesSent + " " + ChatRoom.totalUsers);
            System.out.println(u2.name + " " + u2.messagesSent + " " + ChatRoom.totalUsers);
        } catch (InputMismatchException e) { // 숫자 이외의 입력 시
            System.out.println("숫자만 입력해 주세요"); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}
