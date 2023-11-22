public class Payment {
    public static void main(String[] args) {
        String userChoice = "Kotak";
        System.out.println("Selected bank: " + userChoice);
        String selectedBank = Choosebank.getSelectedBank(userChoice);
        double transferAmount = 1111.11;
        performTransfer(selectedBank, transferAmount);
    }
    private static void performTransfer(String selectedBank, double amount) {
        if ("SBI".equals(selectedBank)) {
            SBIBANK.transfer(amount);
        } else if ("Union".equals(selectedBank)) {
            UNIONBANK.transfer(amount);

        } else if ("Kotak".equals(selectedBank)) {
            KOTAKBANK.transfer(amount);

        } else {
            System.out.println("No selected bank.");
        }
    }




}
