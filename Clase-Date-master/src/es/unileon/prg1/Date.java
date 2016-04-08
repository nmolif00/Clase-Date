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

		if (monthRight(day, month)== false ) {
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
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
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






	
	public void isSameDay (int day) {
		this.day = day;
	}
		
	public void isSameMonth (int month){
		this.month = month;
	}

	public void isSameYear(int year){
		this.year = year;
	}

	public int isSame () {
		
		if (this.day>0 && this.day>31 && this.month>0 && this.month<12 && this.year>0) return 0;

		else return -1;
	}



// Metodo que imprime el nombre del mes
	public String monthName (int month) {

		String monthNames = new String (" ");

		switch (getMonth()) {
		
			case 1:
				monthNames="Enero";
				break;
	
			case 2:
				monthNames="Febrero";
				break;

			case 3:
				monthNames="Marzo";
				break;

			case 4:
				monthNames="Abril";
				break;

			case 5:
				monthNames="Mayo";
				break;

			case 6:
				monthNames="Junio";
				break;

			case 7:
				monthNames="Julio";
				break;

			case 8:
				monthNames="Agosto";
				break;

			case 9:
				monthNames="Septiembre";
				break;

			case 10:
				monthNames="Octubre";
				break;

			case 11:
				monthNames="Noviembre";
				break;

			case 12:
				monthNames="Diciembre";
				break;
		}
		return monthNames;
	}


// Metodo que comprueba que el dia del mes es correcto	
	public boolean monthRight (int day, int month) {
		
		boolean monthRights=false;
		switch (month) {

		case 1: //next
		case 3: //next
		case 5: //next
		case 7: //next
		case 8: //next
		case 10: //next
		case 12: 
			if (day<=31 || day>=1) monthRights=true;

			break;
		case 4: //next
		case 6: //next
		case 9: //next
		case 11:
			if (day<=30 || day>=1) monthRights=true;


			break;

		case 2:
			if (day<=28 || day>=1) monthRights=true;

			break;

		}
	return monthRights;

	}




// Metodo que imprime la estacion de ese mes
	public String getSeason (int season) {

		String seasons = new String (" ");

		switch (month) {
	
		case 1: //next
		case 2: 
			seasons="Invierno";
			break;
	
		case 3: // En este casos ponemos que cuando el día es mayor que 21, será primavera, si no, invierno
			if(day>=21) seasons="Primavera";
			else seasons="Inivierno";
			break;

		case 4: //next
		case 5: 
			seasons="Primavera";
		case 6: // En este casos ponemos que cuando el día es mayor que 21, será verano, si no, primavera
			if (day>=21) 	seasons="Verano";
			else seasons="Primavera";
			break;

		case 7: //next
		case 8: 
			seasons="Verano";
		case 9: //En este casos ponemos que cuando el día es mayor que 23, será Otoño, si no, verano
			if (day>=23) seasons="Otoño";
			else seasons="Verano";
			break;

		case 10: //next
		case 11:	
			seasons="Otoño";

		case 12://En este casos ponemos que cuando el día es mayor que 21, será invierno, si no, Otoño
			if(day>=21) seasons="Invierno";
			else seasons="Otoño";
			break;		
		}
	return seasons;
	}





	boolean isSameYear (Date date) {
		return (this.year==date.getYear());
	}

	boolean isSameDay (Date date) {
		 return (this.day==date.getDay());
	}
	
	boolean isSameMonth (Date date) {
		return (this.month==date.getMonth());
	}


}

