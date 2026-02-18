/**
@Author Amit

@Version 5.0

*/

class OopsBannerApp{
	public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        
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
        
        // System.out.println(line[0]);
        
        
    }
}