
public class MainDate {


public static void main (String [] args) {

	try {
		Date firstDate=new Date (17,10,1996);
		

		System.out.println("El mes que ha introducido es" + firstDate.monthName(firstDate));
		System.out.println("La estación que ha introducido es" + firstDate.getSeason(firstDate));
		System.out.println("El día del mes es" +firstDate.monthRight(firstDate));


	}catch (DateException exception) {
		System.err.println(exception.toString());
	}

   }


}
