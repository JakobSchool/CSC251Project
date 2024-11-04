public class Policy {
   
   /**
      calculates BMI (body mass index) using the formula ((Policyholder’s Weight * 703 ) / (Policyholder’s Height^2))
      @return BMI Policyholder's Body Mass Index
   */
   public double calculateBMI() {
      double BMI = (weight * 703) / (Math.pow(height, 2));
      return BMI;
   }
   
   /**
      calculates price | base fee is 600, if over 50 years old additional 75, if smoker additional 100, if BMI is over 35 use this formula Additional Fee = ( BMI – 35 ) * 20
      @return price price for policy
   */
   public double calculatePrice() {
      double price = 600;
      if (age > 50) price += 75;
      if (smokingStatus == "smoker") price += 100;
      if (calculateBMI() > 35) price += (calculateBMI() -35) * 20;
      return price;
   }
   
   /**
      @return fomrated string displaying information regarding the policy
   */
   public String toString() {
      return "\n-----------------------------------------------------------" +
              "\nPolicy Number: " + getPolicyNumber() +
              "\n\nProvider Name: " + getProviderName() +
              "\n\nPolicyholder's First Name: " + getFirstName() +
              "\n\nPolicyholder's Last Name: " + getLastName() +
              "\n\nPolicyholder's Age: " + getAge() +
              "\n\nPolicyholder's Smoking Status: " + getSmokingStatus() +
              String.format("\n\nPolicyholder's Height: %.1f inches", getHeight()) +
              String.format("\n\nPolicyholder's Weight: %.1f pounds", getWeight()) +
              String.format("\n\nPolicyholder's BMI: %.2f", calculateBMI()) +
              String.format("\n\nPolicy Price: $%.2f", calculatePrice()) +
              "\n-----------------------------------------------------------";
   }
}