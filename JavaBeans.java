public class Employee {
	
	//let assume firstName and  lastName are required
	
    private String  firstName ;
    private String lastName ;
    
    //These are optional 
    private int age ;
    private String phone ;
    private String address;
	
	public Employee() {
		
	}
	
	public Employee(String firstNme ,String lastName) {
		this.firstName= firstNme;
		this.lastName = lastName;
		
	}
	
	public Employee(String firstNme ,String lastName,int age) {
		this(firstNme, lastName);
		this.age = age;
		
	}
	 
	public Employee(String firstNme ,String lastName,int age,String phone) {
		this(firstNme, lastName,age);
		this.phone = phone;
		
	}
	public Employee(String firstNme ,String lastName,int age,String phone,String address) {
		this(firstNme, lastName,age,phone);
		this.address = address;
		
	}
	 
	public static void main(String[] args) {
		Employee emp1 = new Employee("ab" ,"bc" ,0,null,"SriLanka");  //when age and phone number are optional
		Employee emp2 = new Employee("ab" ,"bc" ,0,null,null); //constructor with all parameters
				


	}

}