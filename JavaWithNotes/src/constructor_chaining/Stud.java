package constructor_chaining;


 //  Keyword " This " demo

public class Stud {
	int x = 10;
	void display() {
		int x= 20;
		System.out.println("Member value of x is :"+this.x);
		System.out.println("The value of x is :"+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stud s = new Stud();   //calling default constructor
     s.display();
	}

}
