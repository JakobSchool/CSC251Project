public class PolicyHolder {
   
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
}