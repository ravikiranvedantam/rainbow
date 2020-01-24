package myEMployee;

public class Employee {

	private String name;
	private int age;
	private String designation;
	private double salary;

	public Employee(String nm) {
		this.name=nm;
	}

	public void setName(String nm) {
		this.name=nm;
	}
	public String getName() {
		return this.name;
	}
	
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	
	
	public void setDesignation(String desig) {
		this.designation=desig;
	}
	public String getDesignation() {
		return this.designation;
	}
	
	
	public void setSalary(double sal) {
		this.salary=sal;
	}
	public Double getSalary() {
		return this.salary;
	}
	public Double getBonus(Double salary) {
		return salary*0.1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empObj1=new Employee("Ravi");
		Employee empObj2=new Employee("Mahi");
		
		empObj1.setName("Ravi");
		empObj1.setAge(65);
		empObj1.setDesignation("Programmer");
		empObj1.setSalary(5000);
		
		empObj2.setName("Mahi");
	  	
		System.out.println(empObj1.getName());
		System.out.println(empObj1.getAge());
		System.out.println(empObj1.getDesignation());
		System.out.println(empObj1.getSalary());
		System.out.println(empObj1.getBonus(empObj1.getSalary()));
	}

}
