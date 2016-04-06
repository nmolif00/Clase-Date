package es.unileon.prg1.date;

public class Date {

	private int day;
	private int month;
	private int year;	

	
	public Date (int day, int month, int year) throws DateException{
		StringBuffer message = new StringBuffer();

		// esta bien???
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
			message.append("No se admiten ese dia para determinado mes - error dato: " + day + "/" + month + "\n");

		}


		if (message.length() != 0){
			// lanzo excepcion
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
		this.day=day;
	}

	public void setMonth (int month) {
		this.month=month;
	}

	public void setYear (int year) {
		this.year=year;
	}




	
	public isSameDay (int day) {
		this.day = day;
	}
		
	public isSameMonth (int month){
		this.month = month;
	}

	}

	public isSameYear(int year){
		this.year = year;
	}






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


	public void getSeason () {

		String season = new String (" ");

		switch (season) {
	
		













}

	public isSame () {



	}




	boolean isSameYear (int fecha) {
		if (this year==fecha.get.year())




}
