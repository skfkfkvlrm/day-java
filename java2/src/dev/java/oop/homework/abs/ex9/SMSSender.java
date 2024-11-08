package dev.java.oop.homework.abs.ex9;

// SMS 전송 클래스
public class SMSSender extends MessageSender {
    public SMSSender(String sender, String receiver) {
        super(sender, receiver);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS 전송");
        System.out.println("보낸 사람: " + sender);
        System.out.println("받는 사람: " + receiver);
        System.out.println("메시지: " + message);
    }
}
