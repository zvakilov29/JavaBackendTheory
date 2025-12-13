package lesson07.homework;

public class Main {
    public static void main(String[] args) {
        // 1. Create a user
        User myUser = new User("Zakariyya");

        // 2. Create the specific services
        NotificationService email = new EmailService();
        NotificationService sms = new SmsService();

        // 3. Send via Email
        myUser.sendNotification(email, "Hello via Email!");

        System.out.println("-------------------------------------------------");

        // 4. Send via SMS
        myUser.sendNotification(sms, "Hello via SMS!");
    }
}
