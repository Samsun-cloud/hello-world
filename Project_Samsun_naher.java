import java.util.Scanner;
import java.text.DecimalFormat;

public class Project_Samsun_naher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        // Prompt user for input
        System.out.print("Please enter the Policy Number: ");
        int policyNumber = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("Please enter the Provider Name: ");
        String providerName = input.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = input.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = input.nextLine();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double height = input.nextDouble();

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double weight = input.nextDouble();

        // Create Policy object
        Project_Samsun_naher policy = new Project_Samsun_naher(policyNumber, providerName, firstName, lastName,
                                   age, smokingStatus, height, weight);

        // Output results
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s First Name: " + policy.getPolicyholderFirstName());
        System.out.println("Policyholder’s Last Name: " + policy.getPolicyholderLastName());
        System.out.println("Policyholder’s Age: " + policy.getPolicyholderAge());
        System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder’s Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder’s Weight: " + policy.getWeight() + " pounds");
        System.out.println("Policyholder’s BMI: " + df.format(policy.calculateBMI()));
        System.out.println("Policy Price: $" + df.format(policy.calculatePolicyPrice()));
    }
}
