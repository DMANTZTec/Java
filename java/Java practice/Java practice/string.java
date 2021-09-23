public class string {
	
	public static void main(String[] args)
	{
		String lowercaseString="hi i am swapna" ;
		if(lowercaseString.length()>0)
		{
			lowercaseString=Character.toUpperCase(lowercaseString.charAt(1))
		+
		lowercaseString.substring(2,lowercaseString.length());
					
		}
			System.out.println(lowercaseString);
	}
	

}
