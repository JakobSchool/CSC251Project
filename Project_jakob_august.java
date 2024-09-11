import java.util.Scanner;

public class Project_jakob_august {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      //get input from the user
      System.out.print("Please enter the Policy Number: ");
      String policyNumber = input.nextLine();
      System.out.print("\nPlease enter the Provider Name: ");
      String providerName = input.nextLine();
      System.out.print("\nPlease enter the Policyholder's First Name: ");
      String firstName = input.nextLine();
      System.out.print("\nPlease enter the Policyholder's Last Name: ");
      String lastName = input.nextLine();
      System.out.print("\nPlease enter the Policyholder's Age: ");
      int age = input.nextInt();
      input.nextLine();
      System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = input.nextLine();
      System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
      double height = input.nextDouble();
      System.out.print("\nPlease enter the Policyholder's Weight (in pounds): ");
      double weight = input.nextDouble();
      
      //create policy object using the data collected
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      //print policy data to the console
      System.out.println("\n-----------------------------------------------------------");
      System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
      System.out.println("\nProvider Name: " + policy.getProviderName());
      System.out.println("\nPolicyholder's First Name: " + policy.getFirstName());
      System.out.println("\nPolicyholder's Last Name: " + policy.getLastName());
      System.out.println("\nPolicyholder's Age: " + policy.getAge());
      System.out.println("\nPolicyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.printf("\nPolicyholder's Height: %.1f inches", policy.getHeight());
      System.out.printf("\n\nPolicyholder's Weight: %.1f pounds", policy.getWeight());
      System.out.printf("\n\nPolicyholder's BMI: %.2f", policy.calculateBMI());
      System.out.printf("\n\nPolicy Price: $%.2f", policy.calculatePrice());
   }
}