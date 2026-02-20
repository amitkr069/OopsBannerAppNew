/**
@Author Amit
@Version 2.0
This is Use Case 8.
this code is to print OOPS banner in star pattern HashMap and String builder.
*/

import java.util.HashMap;
class OopsBannerApp {
    public static HashMap<Character, String[]> createMap(){
        HashMap<Character, String[]> banner = new HashMap<>(); //Making the HashMap object. It contains character as key and String array as value;
        
        banner.put('O', new String[]{
                "    **    ",
    			"  **  **  ",
    			" **    ** ",
    			" **    ** ",
    			" **    ** ",
    			"  **  **  ",
    			"    **    "
        }); // in this we are putting O pattern string in map
		
        
        banner.put('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });
		// in this we are putting P pattern string in map
        
        banner.put('S', new String[]{
            "   ****  ",
			" **      ",
			"**       ",
			"  *****   ",
			"      **  ",
			" **   **  ",
			"   ****   "
        });
		
		//// in this we are putting S pattern string in map
        
        return banner;
		// returning the map(banner)
    }
    
    public static void printBanner(String message, HashMap<Character, String[]> banner){
        for(int i = 0; i<7; i++){ // iterating for 7 times
			StringBuilder sb = new StringBuilder(); // Creating the String Builder App
            for(char c: message.toCharArray()){ //iterating through each message(oops) character by character. this will act as key
                //System.out.print(banner.get(c)[i] + " ");
				String[] pattern = banner.get(c); // getting the value of the key and storing it in String array "Pattern"
				sb.append(pattern[i]).append(" "); //appending the pattern of each row line by line with space
            }
            
            System.out.println(sb.toString()); //print the row and converting the string builder to string
        }
    }
    public static void main(String[] args) {
        HashMap<Character, String[]> banner = createMap(); // calling the function and stroing it in HashMap;
        String message = "OOPS";
        printBanner(message, banner); // calling the printBanner funciton.
    }
}
