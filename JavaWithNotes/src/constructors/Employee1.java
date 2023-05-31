package constructors;

class Employee2 {
	
	int id;
	String name;
	
	Employee2(int i, String n){
		id = i;
		name = n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class Employee1{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e = new Employee2(10,"nasir"); 
		e.display();
	}

}
