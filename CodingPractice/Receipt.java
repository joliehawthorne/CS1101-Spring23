public class Receipt {
    public static void main(String[] args) {
        // Calculate total owed, assuming 7% tax and 18% tip.
        System.out.println("Subtotal: " + (38.0 + 40.0 + 30.0));
        System.out.println("Tax: " + ((38.0 + 40.0 + 30.0) * 0.07));
        System.out.println("Tip: " + ((38.0 + 40.0 + 30.0) * 0.18));
        System.out.println("Total: " + ((38.0 + 40.0 + 30.0) +
                                        (38.0 + 40.0 + 30.0) * 0.07 +
                                        (38.0 + 40.0 + 30.0) * 0.18));
    }
}
