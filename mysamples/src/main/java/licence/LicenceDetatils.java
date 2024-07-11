package licence;

public class LicenceDetatils {
	 protected String name;
	    protected int age;

	    public LicenceDetatils(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}



