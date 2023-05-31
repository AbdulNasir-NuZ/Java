package constructors;

class Test1{
 String s1 = "parent";
}

 class C extends Test1{
	 String s1 = "child";
	 public void disp() {
		 
		 System.out.println(s1);
		 System.out.println(this.s1);
		 System.out.println(super.s1);
	 }
 }




public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      C c1 = new C();
      c1.disp();
	}

}
