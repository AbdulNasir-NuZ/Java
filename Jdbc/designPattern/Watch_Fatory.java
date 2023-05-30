package designPattern;

public class Watch_Fatory {
	static Watch getWatch(String type) {
		if(type.equalsIgnoreCase("Fast Track")){
		   return new Watch();
	       }
		else if(type.equalsIgnoreCase("HMT")){
		   return new Watch();
	    }
		else
		{
			System.out.println("No watch found");
		}
		return null;

	}
}
