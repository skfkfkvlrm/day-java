package dev.java.oop.homework.abs.ex9;

public abstract class MessageSender {
    protected String sender;
    protected String receiver;

    public MessageSender(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    // 추상 메서드
    public abstract void sendMessage(String message);
}
