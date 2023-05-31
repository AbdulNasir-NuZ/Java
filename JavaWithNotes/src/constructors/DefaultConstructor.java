package constructors;

/*
 *  Default constructor rule:
 *      - it is no-arg constructor 
 *      -  access modifier is same as that of class
 *      - default constructor contain super();
 *      - first line inside every constructor should be super or this , by default super is written 
 * */

public class DefaultConstructor {
	 int roll_no;
     String name;
     
     void display() {
    	 System.out.println(roll_no+" "+name);
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor dc = new DefaultConstructor();  
		DefaultConstructor dc1 = new DefaultConstructor();
		dc.display();
		dc1.display();
	}

}
