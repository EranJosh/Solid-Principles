public class SmsNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("SMS sent to " + recipient + ": " + message);
    }
}