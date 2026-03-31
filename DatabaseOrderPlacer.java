public class DatabaseOrderPlacer implements OrderPlacer {
    @Override
    public void placeOrder(String customerName, String address, double total) {
        System.out.println("Order placed for " + customerName
                + " at " + address + " | Total: $" + total);
    }
}