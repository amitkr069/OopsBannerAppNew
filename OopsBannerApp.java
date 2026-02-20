/**
@Author Amit
@Version 4.0
This is Use Case 4.
In this we Print OOPS banner in star pattern using String.join and Array;
*/

class OopsBannerApp{
	public static void main(String[] args) {
        
        String line[] = new String[7]; //initializing string array of size 7;
        
        line[0] = String.join(" ","    **    ","    **    "," ******* ","   ****  "); .// insertring the pattern row by row using string.join
        
        line[1] = String.join(" ","  **  **  ","  **  **  "," **    * "," **      ");
        
        line[2] = String.join(" "," **    ** "," **    ** "," **    * ","**       ");
        
        line[3] = String.join(" "," **    ** "," **    ** "," ******* ","  *****   ");
        
        line[4] = String.join(" "," **    ** "," **    ** "," **      ","      **  ");
        
        line[5] = String.join(" ","  **  **  ","  **  **  "," **      "," **   **  ");
        
        line[6] = String.join(" ","    **    ","    **    "," **      ","   ****   ");
        
        
        for(String s: line){
            System.out.println(s);
			//iterating each row an printing the row.
        }
        
        // System.out.println(line[0]);
        
        
    }
}
