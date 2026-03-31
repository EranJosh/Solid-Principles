public class OrderTest {

    public static void main(String[] args) {
        OrderCalculator calc = new SimpleOrderCalculator();
        OrderPlacer placer = new DatabaseOrderPlacer();
        InvoiceGenerator invoice = new PdfInvoiceGenerator();
        NotificationSender notif = new EmailNotificationSender();

        OrderService service = new OrderService(calc, placer, invoice, notif);
        service.processOrder("John Doe", "123 Main St",
                "johndoe@example.com", 10.0, 2);

        NotificationSender smsNotif = new SmsNotificationSender();
        OrderService smsService = new OrderService(calc, placer, invoice, smsNotif);
        smsService.processOrder("Jane Smith", "456 Oak Ave",
                "09171234567", 25.0, 3);
    }
}