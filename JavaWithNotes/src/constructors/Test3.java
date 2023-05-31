package constructors;

public class Test3 {

	public static void m1() {
		m2();
	}
	public static void m2() {
		m1();
	}
	public static void main(String[] args) {
		//m1();  // run time exception ; no complie time error and statckoverFlow Error
		System.out.println("Hello ");
	}
}
