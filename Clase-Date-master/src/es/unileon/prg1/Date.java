package es.unileon.prg1.date;


//Creo la clase
public class Date {

	private int day;   // 1 a 31
	private int month; // 1 a 12
	private int year;  // Números positivos	





// Creo el constructor	
	public Date (int day, int month, int year) throws DateException{

		StringBuffer message = new StringBuffer();


		if ( day <=0 ){
			message.append("No se admiten valores negativos para los dias - error dato: " + day + "\n");
		}
		if ( month <=0 ) {
			message.append("No se admiten valores negativos para los meses - error dato: " + month + "\n");
		}
		
		if (year <=0 ) {
			message.append("No se admiten valores negativos para los años - error dato: " + year + "\n");
		}

		if ( month >12 ){
			message.append("No se admiten valores mayores que 12 para los meses - error dato: " + month + "\n");
		}

		if (monthRight(day, month)== -1 ) {
			message.append("No se admite ese dia para determinado mes - error dato: " + day + "/" + month + "\n");
		}

		if (message.length() != 0){
			// Lanzo excepcion
			throw new DateException(message.toString());
		} else {
			this.day=day;
			this.month=month;
			this.year=year;
		}
	}






	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}






	public void setDay (int day) {
		day=day;
	}

	public void setMonth (int month) {
		month=month;
	}

	public void setYear (int year) {
		year=year;
	}






	
	public void isSameDay (int day) {
		this.day = day;
	}
		
	public void isSameMonth (int month){
		this.month = month;
	}

	}

	public void isSameYear(int year){
		this.year = year;
	}





// Metodo que imprime el nombre del mes
	public void getMonthName () {

		String monthName = new String (" ");

		switch (month) {
		
			case 1:
				monthName="Enero";
				break;
	
			case 2:
				monthName="Febrero";
				break;

			case 3:
				monthName="Marzo";
				break;

			case 4:
				monthName="Abril";
				break;

			case 5:
				monthName="Mayo";
				break;

			case 6:
				monthName="Junio";
				break;

			case 7:
				monthName="Julio";
				break;

			case 8:
				monthName="Agosto";
				break;

			case 9:
				monthName="Septiembre";
				break;

			case 10:
				monthName="Octubre";
				break;

			case 11:
				monthName="Noviembre";
				break;

			case 12:
				monthName="Diciembre";
				break;
		}




// Metodo que comprueba que el dia del mes es correcto	
	private int monthRight (int day, int month) {
	
		switch (month) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day<=31 || day>=1) return 0;

			else return -1;


			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day<=30 || day>=1) return 0;

			else return -1;


			break;

		case 2:
			if (day<=28 || day>=1) return 0;

			else return -1;

			break;

		}


	}




// Metodo que imprime la estacion de ese mes
	public void getSeason () {

		String season = new String (" ");

		switch (season) {
	
			case 3:
			case 4:
			case 5:
				return 0;
				break;

			case 6:
			case 7:
			case 8:
				return 0;
				break;

			case 9:
			case 10:
			case 11:
				return 0;
				break;
		
			case 12:
			case 1:
			case 2:
				return 0;
				break;		

}






	public int isSame () {
		
		if (this.day>0 && this.day>31 && this.month>0 && this.month<12 && this.year>0) return 0;

		else return -1;
	}




	boolean isSameYear (int fecha) {
		if (this.year==fecha.get.year())
			isSameYear= true;
	}

	boolean isSameDay (int fecha) {
		if (this.day==fecha.get.year())
			isSameDay= true;
	}
	
	boolean isSameMonth (int fecha) {
		if (this.month==fecha.get.year())
			isSameMonth= true;
	}


