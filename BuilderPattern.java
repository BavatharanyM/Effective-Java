package com.chapter02;

public class Employee_BuilderPattern {
	
	//let assume firstName and  lastName are required
    private final String  firstName ;
    private final String lastName ;
    
    //These are optional 
    private final int age ;
    private final String phone ;
    private final String address;
    
    
    public Employee_BuilderPattern(Builder builder) {
		this.firstName = builder.firstName ;
		this.lastName = builder.lastName ;
		this.age = builder.age;
		this.phone = builder.phone ;
		this.address = builder.address;
	}
    
    
    
    
    //Build a Builder class with same parameters
    public static class Builder{
    	private String  firstName ;
        private String lastName ;
        private int age ;
        private String phone ;
        private String address;
        
       //enforce the required parameters with constructor
        public Builder(String  firstName , String lastName ) {
        	this.firstName = firstName;
        	this.lastName = lastName;
        }
        
       
    
        //declare methods for setting and getting for other optional parameters
        
        public Builder age(int age) {
        	this.age = age ;
        	return this;
        }
        
        public Builder phone(String phone) {
        	this.phone = phone ;
        	return this;
        }
        
        public Builder address(String address) {
        	this.address = address ;
        	return this;
        }
        
        
        //declare a build method that will return Employee Object
        public Employee_BuilderPattern build() {
        	return new Employee_BuilderPattern(this);
        }
        
        
       
    }
   
    public static void main(String args[]) {
   	 Employee_BuilderPattern.Builder builder  = new  Employee_BuilderPattern.Builder("bava", "maha");
   	 Employee_BuilderPattern emp = builder.address("srilanka").build();
   	 System.out.println(emp);
   	
   }
}
