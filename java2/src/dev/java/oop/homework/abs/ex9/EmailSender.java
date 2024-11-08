package dev.java.oop.homework.abs.ex9;

// 이메일 전송 클래스
public class EmailSender extends MessageSender {
    public EmailSender(String sender, String receiver) {
        super(sender, receiver);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("이메일 전송");
        System.out.println("보낸 사람: " + sender);
        System.out.println("받는 사람: " + receiver);
        System.out.println("메시지: " + message);
    }
}
