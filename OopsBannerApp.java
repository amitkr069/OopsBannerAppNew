/**
@Author Amit
@Version 5.0

This is Use Case 5.
In this we print OOPS banner in star pattern using string.join, array.
*/

class OopsBannerApp{
	public static void main(String[] args) {
        
        // Here we are inserting the pattern using Inline operation and also using string.join
		
        String line[] = {
			String.join(" ","    **    ","    **    "," ******* ","   ****  "),
			String.join(" ","  **  **  ","  **  **  "," **    * "," **      "),
			String.join(" "," **    ** "," **    ** "," **    * ","**       "),
			String.join(" "," **    ** "," **    ** "," ******* ","  *****   "),
			String.join(" "," **    ** "," **    ** "," **      ","      **  "),
			String.join(" ","  **  **  ","  **  **  "," **      "," **   **  "),
			String.join(" ","    **    ","    **    "," **      ","   ****   ")
			
		};
        
        
        for(String s: line){
            System.out.println(s);
        }
    }
}
