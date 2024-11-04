import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Project_jakob_august {

   public static void main(String[] args)  throws IOException {
      
      final String fileName = "PolicyInformation.txt";
      ArrayList<Policy> policies = new ArrayList<Policy>();
      File file = new File(fileName);
      Scanner input = new Scanner(new File(fileName));
      int smoker = 0;
      int nonSmoker = 0;
      
      do {
        String policyNumber = input.nextLine();
        String providerName = input.nextLine();
        String firstName = input.nextLine();
        String lastName = input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        String smokingStatus = input.nextLine();
        double height = Integer.parseInt(input.nextLine());
        double weight = Integer.parseInt(input.nextLine());
        
        PolicyHolder policyHolder = new PolicyHolder(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
        Policy policy = new Policy(policyHolder);
        policies.add(policy);
        
        if (smokingStatus.equals("smoker")) smoker++;
        else nonSmoker++;
        //goes through line between names
        if (input.hasNext()) input.nextLine();
        } while(input.hasNext());
        
        for (Policy policy : policies) {
         System.out.println("\n" + policy + "\n");
        }
        
        System.out.printf("\nThere were %d Policy objects created. ", Policy.getPolicyObjects());
        System.out.printf("\n\nThe number of policies with a smoker is: %d", smoker);
        System.out.printf("\nThe number of policies with a non-smoker is: %d", nonSmoker);
   }
}