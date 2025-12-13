package lesson07.homework;

public class SmsService implements NotificationService {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}
