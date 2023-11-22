public class Choosebank {

    public static String getSelectedBank(String choice) {

        if ("SBI".equals(choice)) {
            System.out.println("Processing payment with SBI.");
            return "SBI";
        }
        else if ("Kotak".equals(choice)) {
            System.out.println("Processing payment with Kotak.");
            return "Kotak";
        }
        else if ("Union".equals(choice)) {
            System.out.println("Processing payment with Union.");
            return "Union";
        }
        else {
            System.out.println("No Selected Bank.");
            return "Invalid choice";
        }

    }

}
