package Excerise.Blocks;

public class DemoNonStaticBlocks {
	
	{
		System.out.println("This is non staic block called ");
	}

	public static void main(String[] args) {
		DemoNonStaticBlocks d = new DemoNonStaticBlocks();   // important for non static blocks
		
		//called by the help of class object 
		// if class object is not present ; it prints nothing 
	}
}
