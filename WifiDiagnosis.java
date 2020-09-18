import java.util.Scanner;
public class WifiDiagnosis {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.println("If you have a problem with internet connectivity, "
	    		+ "this WiFi Diagnosis might work.");
	    System.out.println("Are you able to connect with the internet? "
	    		+ "(yes or no)");
	    String answer1 = in.nextLine();
	    if(answer1.equals("no"))
	    {
	    	System.out.println("Second step: reboot your router");
	    	System.out.println("Now are you able to connect with the internet? (yes or no)");
	    	String answer2 = in.nextLine();
	    	if(answer2.equals("no"))
	    	{
	    		System.out.println("Third step: make sure the cables to your router are plugged "
	    				+ "in firmly and your router is getting power");
	    		System.out.println("Now are you able to connect with the internet?"
	    				+ "(yes or no)");
	    		String answer3 = in.nextLine();
	    		if(answer3.equals("no"))
	    		{
	    			System.out.println("Move the computer closer to the router and try to "
	    					+ "connect");
	    			System.out.println("Now are you able to connect with the internet?");
	    			String answer4 = in.nextLine();
	    			if(answer4.equals("no"))
	    			{
	    				System.out.println("Contact you ISP");
	    				System.out.println("Make sure your ISP is hooked up to your router.");
	    			}
	    		}
	    	}

	    }
	    	System.out.println("Done");	
	    	System.out.println("Programmer's name: Fatima Mancia");
	    
	  }
}
