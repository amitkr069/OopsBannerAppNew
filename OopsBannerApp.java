/**
@Author Amit
@Version 7.0
This is Use Case 6.
Here we are printing the OOPS Banner using methods and using the concept of inner class.
we are making seperate methods for each pattern inside the inner class and making the object of the inner class to call the methods.
*/
class Banner{ //outer class
    static class GetBanners{ //inner class
        public static String[] getOPattern(){
    		return new String[]{
    			"    **    ",
    			"  **  **  ",
    			" **    ** ",
    			" **    ** ",
    			" **    ** ",
    			"  **  **  ",
    			"    **    "
    		};
		
	    }
	    
	    public static String[] getPPattern(){
		return new String[]{
			" ******* ",
			" **    * ",
			" **    * ",
			" ******* ",
			" **      ",
			" **      ",
			" **      "
		};
	
	}
	
	public static String[] getSPattern(){
		return new String[]{
			"   ****  ",
			" **      ",
			"**       ",
			"  *****   ",
			"      **  ",
			" **   **  ",
			"   ****   "
		};
	}
    }
    
}

class OopsBanerApp {
    public static void main(String[] args) {
        Banner.GetBanners banner = new Banner.GetBanners(); // directly creating the object of inner class as we need to access its properties. 
        
        String[] OPattern = banner.getOPattern(); // storing the string array by calling the method of the inner class.
		String[] PPattern = banner.getPPattern();
		String[] SPattern = banner.getSPattern();
		
		for(int i = 0; i<OPattern.length; i++){
			// printing the pattern from the arrays row by row.
			System.out.println(OPattern[i] + " " + OPattern[i] + " " + PPattern[i] + " " + SPattern[i]);
		}
    }
}
