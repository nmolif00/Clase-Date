package es.unileon.prg1.date;




public class MainDate {


public static void main (String [] args) {

	try {
		Date date1=new Date (17,10,1996);
		Date date2=new Date (1,1,2016);



		System.out.println("El mes que ha introducido es" + date1.monthName(date1));
		System.out.println("El mes que ha introducido es" + date2.monthName(date2));

		System.out.println("La estación que ha introducido es" + date1.getSeason(date1));
		System.out.println("La estación que ha introducido es" + date2.getSeason(date2));

		System.out.println("El día del mes es" +date1.monthRight(date1));
		System.out.println("El día del mes es" +date2.monthRight(date2));


	}catch (DateException Exception) {
		System.err.println(Exception.toString());
	}

   }


}
