package sDET;

public class FindSubString2 {

	public static void main(String[] args) 
	{
        System.out.println(isSubStringPresent("onkar bagaje", "or"));
	}
	
	public static boolean isSubStringPresent(String main, String search)
	{
		return main.matches(".*" + search +  ".*");
	}

}
