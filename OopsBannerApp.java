/**
@Author Amit
@Version 6.0
This is Use Case 6.
Here we are printing the OOPS Banner using methods.
we are making seperate methods for each pattern and calling it in the main class.
*/

// this is for printing O pattern using method
class OopsBannerApp{ // the main class
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
	
	// this is for printing P pattern using method
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

	// this is for printing S pattern using method
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
	public static void main(String[] args) {
        
        String[] OPattern = getOPattern(); // calling the method and storing it in string array.
		String[] PPattern = getPPattern();
		String[] SPattern = getSPattern();
		
		for(int i = 0; i<OPattern.length; i++){
			System.out.println(OPattern[i] + " " + OPattern[i] + " " + PPattern[i] + " " + SPattern[i]);
			//calling each arrays indexes and printing the pattern row by row
		}
        
    }
}
