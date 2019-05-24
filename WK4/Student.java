package WK4;

public class Student {
    
	private String name;
	private int age;
	private boolean engineerMajor;
	private char gender;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Snappy", 17, true, 'M');
		System.out.println("\nStudent 1: custom args\n");
		System.out.println("Name: " + s2.getName());
		System.out.println("Age: " + s2.getAge());
		System.out.println("IsEngineerMajor: " + s2.getMajor());
		System.out.println("Gender: " + s2.getGender());
		System.out.println("\nStudent 2: default args (second constructor)\n");
		System.out.println("Name: " + s1.getName());
		System.out.println("Age: " + s1.getAge());
		System.out.println("IsEngineerMajor: " + s1.getMajor());
		System.out.println("Gender: " + s1.getGender());
		s1.setName("Hello");
		s1.setAge(15);
		s1.setMajor(true);
		s1.setGender('M');
		System.out.println("\nStudent 3: data altered used set methods\n");
		System.out.println("Name: " + s1.getName());
		System.out.println("Age: " + s1.getAge());
		System.out.println("IsEngineerMajor: " + s1.getMajor());
		System.out.println("Gender: " + s1.getGender());
		
		
		
		
	}
	
	public Student(String name, int age, boolean engineerMajor, char gender) {
		this.name = name;
		this.age = age;
		this.engineerMajor = engineerMajor;
		this.gender = gender;
	}
	public Student() {
	    this.name = "Student";
	    this.age = 13;
	    this.engineerMajor = false;
	    this.gender = 'F';
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMajor(boolean engineerMajor) {
		this.engineerMajor = engineerMajor;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public boolean getMajor() {
		return this.engineerMajor;
	}
	public char getGender() {
		return this.gender;
	}
	
	
	
}
	
	

