public class Main 
{
	
	public static void main(String[] args)
	{
		String[] names=
			{
					"joey","willy","sam","ram"
			};
		
		      for(int i=0;i<names.length;i++)
		      {
		    	  String name=names[i];
		    	  System.out.println(names[i]);
		     }
		      System.out.println("----------");
		      for(String name:names)
		    	  System.out.println(name);  
	}
	
	
	

}
