package constructors;


// Parameterized Constructors

public class Employee {
	
	int id;
	String Name;
	
	Employee(int id, String Name){
		System.out.println(id+" "+Name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee e = new Employee(20, "Nasir");
          
	}

}
