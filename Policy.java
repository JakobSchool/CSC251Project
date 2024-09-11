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
   
   
   //no args constructor, sets default values
   public Policy() {
      firstName = "John";
      lastName = "Doe";
      age = 18;
      smokingStatus = "non-smoker";
      height = 60;
      weight = 120;
   }
   
   //args constructor
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
   
   //calculates BMI (body mass index) using the formula ((Policyholder’s Weight * 703 ) / (Policyholder’s Height^2))
   public double calculateBMI() {
      double BMI = (weight * 703) / (Math.pow(height, 2));
      return BMI;
   }
   
   //calculates price | base fee is 600, if over 50 years old additional 75, if smoker additional 100, if BMI is over 35 use this formula Additional Fee = ( BMI – 35 ) * 20
   public double calculatePrice() {
      double price = 600;
      if (age > 50) price += 75;
      if (smokingStatus == "smoker") price += 100;
      if (calculateBMI() > 35) price += (calculateBMI() -35) * 20;
      return price;
   }
   
   //getters
   public String getPolicyNumber() {
      return policyNumber;
   }
   public String getProviderName() {
      return providerName;
   }
   public String getFirstName() {
      return firstName;
   }
   public String getLastName() {
      return lastName;
   }
   public int getAge() {
      return age;
   }
   public String getSmokingStatus() {
      return smokingStatus;
   }
   public double getHeight() {
      return height;
   }
   public double getWeight() {
      return weight;
   }
   
   //setters
   public void setPolicyNumber(String policyNumber) {
      this.policyNumber = policyNumber;
   }
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public void setSmokingStatus(String smokingStatus) {
      this.smokingStatus = smokingStatus;
   }
   public void setHeight(int height) {
      this.height = height;
   }
   public void setWeight(int weight) {
      this.weight = weight;
   }
}