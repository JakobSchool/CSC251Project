public class Policy {

   private static int policyObjects = 0;
   private PolicyHolder policyHolder;
   
    /**
      no args constructor, sets default values
   */
   public Policy() {
      policyHolder = new PolicyHolder();
      policyObjects++;
   }
   
   /**
      args constructor
      @param PolicyHolder contains all information regarding the policyHolder
    */
   public Policy(PolicyHolder policyHolder) {
      this.policyHolder = new PolicyHolder(policyHolder);
      policyObjects++;
   }
   
   
   /**
      calculates BMI (body mass index) using the formula ((Policyholder’s Weight * 703 ) / (Policyholder’s Height^2))
      @return BMI Policyholder's Body Mass Index
   */
   public double calculateBMI() {
      double BMI = (policyHolder.getWeight() * 703) / (Math.pow(policyHolder.getHeight(), 2));
      return BMI;
   }
   
   /**
      calculates price | base fee is 600, if over 50 years old additional 75, if smoker additional 100, if BMI is over 35 use this formula Additional Fee = ( BMI – 35 ) * 20
      @return price price for policy
   */
   public double calculatePrice() {
      double price = 600;
      if (policyHolder.getAge() > 50) price += 75;
      if (policyHolder.getSmokingStatus() == "smoker") price += 100;
      if (calculateBMI() > 35) price += (calculateBMI() -35) * 20;
      return price;
   }
     
   /**
      @return number of policy objects created
   */
   public static int getPolicyObjects() {
      return policyObjects;
   }
   
   /**
      @return policyHolder object containing information regarding policyholder
   */
   public PolicyHolder getPolicyHolder() {
      return new PolicyHolder(policyHolder);
   }
   
   /**
      @return fomrated string displaying information regarding the policy
   */
   public String toString() {
      return  policyHolder +
              String.format("\n\nPolicyholder's BMI: %.2f", calculateBMI()) +
              String.format("\n\nPolicy Price: $%.2f", calculatePrice());
   }
}