class Banner{
    static class GetBanners{
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
        Banner.GetBanners banner = new Banner.GetBanners();
        
        String[] OPattern = banner.getOPattern();
		String[] PPattern = banner.getPPattern();
		String[] SPattern = banner.getSPattern();
		
		for(int i = 0; i<OPattern.length; i++){
			System.out.println(OPattern[i] + " " + OPattern[i] + " " + PPattern[i] + " " + SPattern[i]);
		}
    }
}