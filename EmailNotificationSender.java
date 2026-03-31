public class EmailNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Email sent to " + recipient + ": " + message);
    }
}