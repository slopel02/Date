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
	public int getYear(){
		return this.year;
	}
	public int getMonth(){
		return this.month;
	}
	public int getDay(){
		return this.day;
	}

	public boolean isSameYear(Date aDate){
		if (this.year== aDate.getYear()){
			return true;
		}
		return false;
	}

	public boolean isSameMonth(Date aDate){
		if(this.month==aDate.getMonth()){
			return true;
		}
		return false;
	}

	public boolean isSameDay(Date aDate){
		if(this.day==aDate.getDay()){
			return true;
		}
		return false;
	}

	public boolean isSame(Date aDate){
		if(this.isSameYear(aDate)==true && this.isSameMonth(aDate)==true && this.isSameYear(aDate)==true){
				return true;
		}
		return false;
	}
	public boolean isDayOfMonthOk(){
		return this.isDayOfMonthOk(this.month);
	}
	private boolean isDayOfMonthOk(int i){
		boolean ok=false;
		switch(i){
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
		return this.getMonthName(this.getMonth());
		
	}

	private String getMonthName(int i){
		String Monthname;
		Monthname=null;
		switch(i){
		
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

	public String stationOfMonth(){
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
	public String restOfMonths(){ //in the same year
		StringBuffer restOfMonths;
		restOfMonths=new StringBuffer();
		for(int i=this.month;i<=12;i++){
			restOfMonths.append(this.getMonthName(i)+",");
		}
		return restOfMonths.toString();
	}
	public String restOfDaysInAMonth(){
		StringBuffer restOfDaysInAMonth;
		restOfDaysInAMonth= new StringBuffer();
		for(int i=this.day;i<=31;i++){	
		Date rest;
		rest =new Date(i,this.month,this.year);
			if(rest.isDayOfMonthOk()==true){
				restOfDaysInAMonth.append(rest+ "\t");
			}
		}
		return restOfDaysInAMonth.toString();
	}
	
	public String sameMonths(){
		StringBuffer sameMonths;
		sameMonths= new StringBuffer();
		for(int i=0;i<=12;i++){
			for(int j=1; j<=32;j++){
			Date otherMonth;
			otherMonth= new Date(j,i,this.year);
				if(otherMonth.isDayOfMonthOk()==false){
				sameMonths.append(this.getMonthName(i));	
				}

			}
		}
		return sameMonths.toString();
	}
	public int daysSinceStartYear(){
		int cont=0;
		Date daysCont;
		daysCont= new Date(this.day,this.month,this.year);
		for (int i=1;i<=this.month;i++){
			if(i==this.month){
				for(int j=1;j<=this.day;j++){
					cont=cont+1;
				}
			}
			else {	
				
				for(int j=1;daysCont.isDayOfMonthOk(i)==true;j++){
					daysCont.day=j+1;
					cont=cont+1;
				}
				daysCont.day=this.day;
			}
		}
		return cont;
	}
		
}
