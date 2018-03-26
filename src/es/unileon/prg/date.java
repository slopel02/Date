package es.unileon.prg;
	
public class Date{
	private int day;
	private int month;
	private int year;
		
	Date(int day, int month ,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	int getYear(){
		return this.year;
	}
	int getMonth(){
		return this.month;
	}
	int getYear(){
		return this.day;
	}

	boolean isSameYear(Date, aDate){
		if (this.year== aDate.getYear()){
			return true;
		}
	}

	boolean isSameMonth(Date, aDate){
		if(this.month==aDate.getMonth()){
			return true;
		}
	}

	boolean isSameDay(Date, aDate){
		if(this.day==aDate.getDay()){
			return true;
		}
	}

	boolean isSame(Date, aDate){
		if(this.Date.isSameYear(aDate)==true && this.Date.isSameMonth(aDate)==true && this.Date.isSameYear(aDate)==true){
				return true;
		}
	}

	boolean isDayOfMonthOk(){
		boolean ok;
		switch(this.month){
		case 1: //next
		case 3: //next
		case 5: //next
		case 7: //next
		case 8: //next
		case 10: //next
		case 12: 
			if(this.day>0 && this.day<=31){
				ok=true;
			}
			else{
				ok=false;
			}
			break;
		case 4: //next
		case 6: //next
		case 9: //next
		case 11:
			if(this.day>0 && this.day<=30){
				ok=true;
			}
			else{
				ok=false;
			}
			break;
		case 2:
			if(this.day>0 && this.day<=28){
				ok=true;
			}
			else{
				ok=false;
			}
			break;
		}
	}

	String getMonthName(){
		switch(this.month){
		String name;
		case 1:
			name= "Enero ";
			break;
		String name;
		case 2:
			name= "Febrero ";
			break;
		String name;
		case 3:
			name= "Marzo ";
			break;
		String name;
		case 4:
			name= "Abril ";
			break;
		String name;
		case 5:
			name= "Mayo ";
			break;
		String name;
		case 6:
			name= "Junio ";
			break;
		String name;
		case 7:
			name= "Julio ";
			break;
		String name;
		case 8:
			name= "Agosto ";
			break;
		String name;
		case 9:
			name= "Septiembre ";
			break;
		String name;
		case 10:
			name= "Octubre ";
			break;
		String name;
		case 11:
			name= "Noviembre ";
			break;
		String name;
		case 12:
			name= "Diciembre ";
			break;
		}
	}

	String stationOfMonth(){
		switch(this.month){
		String station;
		case 1: //next
		case 2: //next
		case 3: 
			station="Invierno";
			break;
		case 4: //next
		case 5: //next
		case 6: 
			station="Primavera";
			break;
		case 7: //next
		case 8: //next
		case 9: 
			station="Verano";
			break;
		case 10: //next
		case 11: //next
		case 12: 
			station="Otonyo";
			break;
		}
			
	}
		
}
