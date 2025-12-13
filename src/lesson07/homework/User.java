package lesson07.homework;

public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public User(){
        this.username = "Unknown";
    }

    public void sendNotification(NotificationService service, String message) {
        System.out.println("User '" + this.username + "' is sending a message...");
        service.sendMessage(message);
    }
}
