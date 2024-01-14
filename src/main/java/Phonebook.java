import java.util.Map;

public class Phonebook {

    public static void main(String[] args) {

        // Hashmap of college departments and phone numbers
        Map<String, String> collegePhoneNumbers = Map.of(
                "Academic Success Center", "612-659-6140",
                "Accessibility Resource Center", "612-659-6730",
                "Career Services", "612-659-6723"
        );

        for (String department : collegePhoneNumbers.keySet()) {
            String phoneNumber = collegePhoneNumbers.get(department);
            System.out.printf("%-35s Telephone %s\n", department, phoneNumber);
        }

    }
}
