class student2
{

	public void add(int i,int j)
	 {
		 System.out.println(i+j);
	 }
	public void add(int i,int j,int k)
	 {
		 System.out.println(i+j+k);
	 }
	public void add(double i,int j)
	 {
		 System.out.println(i+j);
	 }
	public void add(double i,double j)
	 {
		 System.out.println(i+j);
	 }
 
}
public class methodoverloading {

	public static void main(String[] args) {
		student2 st=new student2();
		st.add(4, 7);
		st.add(4, 7,8);
		st.add(4.9, 7);
		st.add(4.5, 7.3);
	}

}
