public class Policy {
   
   //variable declaration
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   //smoker or non-smoker
   private String smokingStatus;
   //height-inches|weight-pounds
   private double height;
   private double weight;
   
   
   /**
      no args constructor, sets default values
   */
   public Policy() {
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   /**
      args constructor
      @param policyNumber number associated with policyholder
      @param providerName name of provider
      @param firstName first name of policyholder
      @param lastName last name of policyholder
      @param age age of policyholder
      @param smokingStatus whether or not policyholder smokes
      @param height height of policyholder
      @param weight weight of policyholder
    */
   public Policy(String policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.age = age;
      this.height = height;
      this.weight = weight;
      this.firstName = firstName;
      this.lastName = lastName;
      this.smokingStatus = smokingStatus;
   }
   
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
      @return policyNumber number associated with policyholder
   */
   public String getPolicyNumber() {
      return policyNumber;
   }
   /**
      @return providerName name of provider
   */
   public String getProviderName() {
      return providerName;
   }
   /**
      @return firstName first name of policyholder
   */
   public String getFirstName() {
      return firstName;
   }
   /**
      @return lastName last name of policyholder
   */
   public String getLastName() {
      return lastName;
   }
   /**
      @return age age of policyholder
   */
   public int getAge() {
      return age;
   }
   /**
      @return smokingStatus whether or not policyholder smokes
   */
   public String getSmokingStatus() {
      return smokingStatus;
   }
   /**
      @return height height of policyholde
   */
   public double getHeight() {
      return height;
   }
   /**
      @return weight weight of policyholder
   */
   public double getWeight() {
      return weight;
   }
   
   /**
      @param policyNumber number associated with policyholder
   */
   public void setPolicyNumber(String policyNumber) {
      this.policyNumber = policyNumber;
   }
   /**
      @param providerName name of provider
   */
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }
   /**
       @param firstName first name of policyholder
   */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   /**
      @param lastName last name of policyholder
   */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   /**
       @param age age of policyholder
   */
   public void setAge(int age) {
      this.age = age;
   }
   /**
      @param smokingStatus whether or not policyholder smokes
   */
   public void setSmokingStatus(String smokingStatus) {
      this.smokingStatus = smokingStatus;
   }
   /**
      @param height height of policyholder
   */
   public void setHeight(int height) {
      this.height = height;
   }
   /**
       @param weight weight of policyholder
   */
   public void setWeight(int weight) {
      this.weight = weight;
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