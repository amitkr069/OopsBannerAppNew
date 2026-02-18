/**
@Author Amit

@Version 6.0

*/

// this is for printing O pattern using method
class OopsBannerApp{
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
	public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        
        
        
        
        String[] OPattern = getOPattern();
		String[] PPattern = getPPattern();
		String[] SPattern = getSPattern();
		
		for(int i = 0; i<OPattern.length; i++){
			System.out.println(OPattern[i] + " " + OPattern[i] + " " + PPattern[i] + " " + SPattern[i]);
		}
        
        // System.out.println(line[0]);
        
        
    }
}