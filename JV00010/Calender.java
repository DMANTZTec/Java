package JV00010;


public class Calender
{
   private int monthNumber;
   public void setMonthNumber(int monthNumber) 
    {
	    if (monthNumber>=1&& monthNumber<=12) 
	    {
			this.monthNumber=monthNumber;
		}
	    else 
		{
              System.err.println("invalid month number");
		}
    }
   public void getDisplay()
   { 
	   switch (monthNumber) 
	   {
		case 1:System.out.println("JANUARY");
			break;
		case 2:System.out.println("FEBUARY");
		break;
		case 3:System.out.println("MARCH");
		break;
		case 4:System.out.println("APRIL");
		break;
		case 5:System.out.println("MAY");
		break;
		case 6:System.out.println("JUNE");
		break;
		case 7:System.out.println("JULY");
		break;
		case 8:System.out.println("AUGUST");
		break;
		case 9:System.out.println("SEPETMBER");
		break;
		case 10:System.out.println("OCTOBER");
		break;
		case 11:System.out.println("NOVMBER");
		break;
		case 12:System.out.println("DECEMBER");
		break;
		
	  }
	   
   }
}
