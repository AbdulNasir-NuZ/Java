package constructor_chaining;


// constructor chaining 


public class Stud2 {
	
	int id;
	String name;
	
	public Stud2(){
		this("nasir");
	}
	
	public Stud2(String name) {
		this(9,"nasir");
	}
	public Stud2(int i, String n) {
		this.id = i;
		this.name = n;
	}
    void disp() {
    	System.out.println("Student name :"+name);
    	System.out.println("Student id: "+id);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Stud2 s = new Stud2();
         s.disp();
	}

}
