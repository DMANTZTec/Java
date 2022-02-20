
public class Main {

	public static void main(String[] args) {
		
      OracleArrayList<Integer> list=new OracleArrayList<Integer>();
      for(int i=0;i<30;i++)
      {
    	 // list.add(Integer.toString(i));
    	  list.add(i*2);
      }
      for(int i=0;i<list.size(); i++)
      {
    	  if(list.get(i) == 10)
    	  {
    		  System.out.println(i);       
    	  }
    	 
      }
		
	}

}
