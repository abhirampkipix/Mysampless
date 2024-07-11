package licence;

 class Eligibility extends LicenceDetatils {

	    public Eligibility(String name, int age) {
	        super(name, age);
	    }

	    public void checkEligibility() {
	        if (age >= 18) {
	            System.out.println(name + " is eligible for a driver's license.");
	        } else {
	            System.out.println(name + " is not eligible for a driver's license.");
	        }
	    }
	

	//public class LicenseEligibilityExample {
	    public static void main(String[] args) {
	        // Creating an instance of Driver
	    	Eligibility driver1 = new Eligibility("Abhiram", 25);
	    	Eligibility driver2 = new Eligibility("Athul", 16);

	        // Display details and check eligibility
	        System.out.println("Driver 1 Details:");
	        driver1.displayDetails();
	        driver1.checkEligibility();

	        System.out.println("\nDriver 2 Details:");
	        driver2.displayDetails();
	        driver2.checkEligibility();
	    }
	}