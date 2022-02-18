
public class OracleArrayList {
	
	private String[] mItems;
	private int mFilledSpots;
	
	public OracleArrayList() {
		
		String[] mItems = new String[10];
	}
	public void add(String item) {
	  if(mFilledSpots<mItems.length) {
		  mItems[mFilledSpots]=item;
		  mFilledSpots++;
	  }
	
		
	}

	public static void main(String[] args) {
		

	}

}
