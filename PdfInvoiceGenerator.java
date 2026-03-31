public class PdfInvoiceGenerator implements InvoiceGenerator {
    @Override
    public void generateInvoice(String fileName, double total) {
        System.out.println("PDF invoice generated: " + fileName
                + " | Amount: $" + total);
    }
}