package lesson07.homework;

public class EmailService implements NotificationService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}
