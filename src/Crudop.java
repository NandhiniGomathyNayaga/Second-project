import java.util.*;
 class Employee {
      
	private int empno;
	private String ename;
	private int salary;
	
	 Employee(int empno,String ename, int salary){
		 this.empno = empno;
		 this.ename = ename;
		 this.salary = salary;
		 
	 }
	
	 public int getEmpno() {
		 return empno;
	 }
	 public int getSalary() {
		 return salary;
	 }
	 public String getEname() {
		 return ename;
		
	 }
	 public String toString() {
		 return empno+" "+ename+" "+salary;
	 }
	 
	 class Crudop{
	public static void main(String[] args) {
		List<Employee> c = new ArrayList<Employee>(); //CREATE INSTANCE OF COLLECTION
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Delete");
			System.out.println("5.Update");
			System.out.println("Enter Your Choice");
			ch= s.nextInt();
		
			switch(ch) {
			case 1:
				System.out.println("Enter Empno : ");
			    int eno = s.nextInt();           //DECLARE THE VARIABLE
			    System.out.println("Enter EmpName : ");
			    String ename = s1.nextLine();
			    System.out.println("Enter Salary : ");
			    int salary = s.nextInt();
			    
			    c.add(new Employee(eno,ename,salary));  //CALLED CONSTRUCTOR
			   
			break;
			case 2:
				System.out.println("-------------------------------");
			    Iterator<Employee> i=c.iterator();    //create a instance of iterator 
			    while(i.hasNext()) {
				Employee e= i.next();
				System.out.println(e);
			}
			    System.out.println("--------------------------");
			break;
			case 3:
				boolean found = false;
			    System.out.println("Enter Empno to Search :");
			    int empno = s.nextInt();
				System.out.println("-------------------------------");
			    i = c.iterator();
			    while(i.hasNext()) {
				     Employee e= i.next();
				     if(e.getEmpno() == empno)
				     {
			    System.out.println(e);
				found = true;
				}
			}
			    if(!found) {
			    System.out.println("Record Not Found");
			}   
			
			    System.out.println("-------------------------------");
			break;
		    case 4:
			    found = false;
		        System.out.println("Enter Empno to Delete :");
	            empno = s.nextInt();
		    	System.out.println("-------------------------------");
	         	i = c.iterator();
		        while(i.hasNext()) {
		     	Employee e= i.next();
		    	if(e.getEmpno() == empno) {
		
		     	i.remove();
			    found = true;
			}
		}
		        if(!found) {
		        System.out.println("Record Not Found");
		}       else {
			    System.out.println("Record is Deleted Successfully");
		}
		
		        System.out.println("-------------------------------");
		break;
	    case 5:
			    found = false;
		        System.out.println("Enter Empno to Update :");
	         	empno = s.nextInt();
		    	System.out.println("-------------------------------");
	         	ListIterator<Employee>li = c.listIterator();
		        while(li.hasNext()) {
		     	Employee e= li.next();
		    	if(e.getEmpno() == empno) {
		
		     	System.out.print("Enter New Name :");
		     	ename = s1.nextLine();
		     	System.out.print("Enter New Salary :");
		     	salary = s.nextInt();
		     	li.set(new Employee(empno,ename,salary));
			    found = true;
			}
		}
		        if(!found) {
		        System.out.println("Record Not Found");
		}       else {
			    System.out.println("Record is Updated Successfully");
		}
		
		        System.out.println("-------------------------------");
		break;
		
		}
		}while(ch!=0);

	}

 }
}