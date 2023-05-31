package constructors;

public class Student1 {
	
	int id;
	String name;
	
	Student1(int i, String n){
		id = i;
		name = n;
		System.out.println("constructor calling");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Student1 s = new Student1(10,"nuz");
           System.out.println(s.id);
           System.out.println(s.name);
           Student1 s2 = new Student1(9,"Raj");
           System.out.println(s2.id+" "+s2.name);
           
	}

}
