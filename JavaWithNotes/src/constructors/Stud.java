package constructors;

public class Stud {

	int id;
	String name;
	
	Stud(int i, String n){
		id=i;
		name=n;
		System.out.println("Name is: "+n+" and id is :"+i);
	}
	Stud(String n){
		name=n;
		System.out.println("Name is :"+name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                     Stud s = new Stud(1,"abc");
                     Stud s1 = new Stud("def");
                     
	}

}
