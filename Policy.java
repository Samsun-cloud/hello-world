/**
 * The Policy class models an insurance policy for one person.
 * It includes personal information, BMI calculation, and policy price calculation.
 */
public class Policy {
    // Instance variables
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokingStatus; // "smoker" or "non-smoker"
    private double height; // in inches
    private double weight; // in pounds

    // No-arg constructor
    public Policy() {
        policyNumber = 0;
        providerName = "";
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        smokingStatus = "non-smoker";
        height = 0.0;
        weight = 0.0;
    }

    // Full constructor
    public Policy(int policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = firstName;
        this.policyholderLastName = lastName;
        this.policyholderAge = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getters
    public int getPolicyNumber() {
        return policyNumber;
    }
/*
    public String getProviderName() {
        return providerName;
    }

    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    public int getPolicyholderAge() {
        return policyholderAge;
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

    // Setters
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public void setPolicyholderFirstName(String firstName) {
        this.policyholderFirstName = firstName;
    }

    public void setPolicyholderLastName(String lastName) {
        this.policyholderLastName = lastName;
    }

    public void setPolicyholderAge(int age) {
        this.policyholderAge = age;
    }

    public void setSmokingStatus(String status) {
        this.smokingStatus = status;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Calculate BMI
    public double calculateBMI() {
        if (height == 0) return 0;
        return (weight * 703) / (height * height);
    }

    // Calculate policy price
    public double calculatePolicyPrice() {
        double price = 600.0;

        if (policyholderAge > 50) {
            price += 75.0;
        }

        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price += 100.0;
        }

        double bmi = calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20.0;
        }

        return price;
    }*/
}
