import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the Policy Number:");
        String policyNumber = scanner.nextLine();

        System.out.println("Please enter the Provider Name:");
        String providerName = scanner.nextLine();

        System.out.println("Please enter the Policyholder’s First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Please enter the Policyholder’s Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Please enter the Policyholder’s Age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker):");
        String smokingStatus = scanner.nextLine();

        System.out.println("Please enter the Policyholder’s Height (in inches):");
        double height = scanner.nextDouble();

        System.out.println("Please enter the Policyholder’s Weight (in pounds):");
        double weight = scanner.nextDouble();

        // Create Policy object
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName,
                age, smokingStatus, height, weight);

        // Display policy information
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s First Name: " + policy.getFirstName());
        System.out.println("Policyholder’s Last Name: " + policy.getLastName());
        System.out.println("Policyholder’s Age: " + policy.getAge());
        System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder’s Height: " + policy.getHeightInches() + " inches");
        System.out.println("Policyholder’s Weight: " + policy.getWeightPounds() + " pounds");
        System.out.printf("Policyholder’s BMI: %.2f\n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
        
        scanner.close();
    }
}