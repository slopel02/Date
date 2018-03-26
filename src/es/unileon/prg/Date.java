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
	int getDay(){
		return this.day;
	}

	boolean isSameYear(Date aDate){
		if (this.year== aDate.getYear()){
			return true;
		}
		return false;
	}

	boolean isSameMonth(Date aDate){
		if(this.month==aDate.getMonth()){
			return true;
		}
		return false;
	}

	boolean isSameDay(Date aDate){
		if(this.day==aDate.getDay()){
			return true;
		}
		return false;
	}

	boolean isSame(Date aDate){
		if(this.isSameYear(aDate)==true && this.isSameMonth(aDate)==true && this.isSameYear(aDate)==true){
				return true;
		}
		return false;
	}

	boolean isDayOfMonthOk(){
		boolean ok=false;
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
		return ok;
	}

	public String getMonthName(){
		String Monthname;
		Monthname="";
		switch(this.month){
		
		case 1:
			Monthname= "Enero ";
			break;
		case 2:
			Monthname= "Febrero ";
			break;
		case 3:
			Monthname= "Marzo ";
			break;
		case 4:
			Monthname= "Abril ";
			break;
		case 5:
			Monthname= "Mayo ";
			break;
		case 6:
			Monthname= "Junio ";
			break;
		case 7:
			Monthname= "Julio ";
			break;
		case 8:
			Monthname= "Agosto ";
			break;
		case 9:
			Monthname= "Septiembre ";
			break;
		case 10:
			Monthname= "Octubre ";
			break;
		case 11:
			Monthname= "Noviembre ";
			break;
		case 12:
			Monthname= "Diciembre ";
			break;
		}
		return Monthname;
	}

	String stationOfMonth(){
		String station;
		station="";
		switch(this.month){
		
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
			station="Otoño";
			break;
		}
		return station;	
	}
	public String toString(){
		return this.getDay() + "/"+ this.getMonth()+ "/"+ this.getYear();
	}
	
		
}
