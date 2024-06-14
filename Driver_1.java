package driver_1;

public class Driver_1 {
	 
	 public static void main(String [] args) {   
	   Employee emp[] = new Employee [100];
	   Employee hold;
	   
	   int count=5;

	   emp[0]=new Employee("Smith",53,56000);  
	   emp[1]=new Employee("Jones",20,34000);
	   emp[2]=new Employee("Adams",30,55000);
	   emp[3]=new Employee("Simms",45,50000);
	   emp[4]=new Employee("Travis",60,60000);                                         


	   for ( int pass = 1; pass < count; pass++ ) { 
	         // loop to control number of comparisons
	         for ( int e = 0; e < count - 1; e++ ) {
	             if ( emp[e].getSalary()>emp[e+1].getSalary()) {
	               hold = emp[e];         
	               emp[e] = emp[e+1];  
	               emp[e+1] = hold;
	             }  
	         }  
	      } 

	   for (int i=0; i<count ; i++)   // display array with ascending salaries 
	      System.out.println(emp[i]);

	   System.out.println("Employees with salaries between 40K and 60K");
	   for (int i=0; i<count ; i++){
	    if (emp[i].getSalary()>40000 && emp[i].getSalary()<60000  ) 
	     System.out.println(emp[i].getName());   // display search results
	   }
	 }
	 
	} 
	     
	class Employee {
	  private String name;
	  private int age;
	  private double salary;

	 public Employee(String n, int a, double s){
	   name=n;
	   age=a;
	   salary=s;
	 }

	 public String getName(){
	   return name;
	 }

	 public double getSalary(){
	   return salary;
	 }
	 
	 public String toString(){
	        return "The Employee " + name + " has " + age + " years of age and his/her salary is approximately $" + salary;
	 }
	} 
