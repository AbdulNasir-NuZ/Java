package constructor_chaining;

// this demostration


public class Stud1 {
	
	int x= 12;
	void display() {
		System.out.println("This value :"+this.x);
		System.out.println("Local Variable x value: "+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Stud1 s = new Stud1();
            Stud1 s1 = new Stud1();
            s.x=34;
            s1.x=45;
            System.out.println("s value is: "+s);
            s.display();
            System.out.println("s1 value is: "+s1);
            s1.display();
            
	}

}
