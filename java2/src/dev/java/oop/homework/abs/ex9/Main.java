package dev.java.oop.homework.abs.ex9;

// 사용 예시
public class Main {
    public static void main(String[] args) {
        MessageSender email = new EmailSender("admin@example.com", "user@example.com");
        email.sendMessage("안녕하세요, 이메일입니다.");

        MessageSender sms = new SMSSender("010-1234-5678", "010-8765-4321");
        sms.sendMessage("안녕하세요, SMS입니다.");
    }
}
