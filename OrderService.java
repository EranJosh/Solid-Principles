public class OrderService {

    private final OrderCalculator calculator;
    private final OrderPlacer placer;
    private final InvoiceGenerator invoiceGenerator;
    private final NotificationSender notificationSender;

    public OrderService(OrderCalculator calculator,
                        OrderPlacer placer,
                        InvoiceGenerator invoiceGenerator,
                        NotificationSender notificationSender) {
        this.calculator = calculator;
        this.placer = placer;
        this.invoiceGenerator = invoiceGenerator;
        this.notificationSender = notificationSender;
    }

    public void processOrder(String customer, String address,
                             String email, double price, int quantity) {
        double total = calculator.calculateTotal(price, quantity);
        placer.placeOrder(customer, address, total);
        invoiceGenerator.generateInvoice("order_" + customer + ".pdf", total);
        notificationSender.sendNotification(email,
                "Your order of $" + total + " has been placed.");
    }
}