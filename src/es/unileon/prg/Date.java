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
			Monthname= "Enero";
			break;
		case 2:
			Monthname= "Febrero";
			break;
		case 3:
			Monthname= "Marzo";
			break;
		case 4:
			Monthname= "Abril";
			break;
		case 5:
			Monthname= "Mayo";
			break;
		case 6:
			Monthname= "Junio";
			break;
		case 7:
			Monthname= "Julio";
			break;
		case 8:
			Monthname= "Agosto";
			break;
		case 9:
			Monthname= "Septiembre";
			break;
		case 10:
			Monthname= "Octubre";
			break;
		case 11:
			Monthname= "Noviembre";
			break;
		case 12:
			Monthname= "Diciembre";
			break;
		}
		return Monthname;
	}

	public String stationOfMonth(){
		String stationOfMonth;
		stationOfMonth=null;
		switch(this.month){
		
		case 1: //next
			
		case 2: //next
		case 3: 
			stationOfMonth="Invierno";
			if(this.day>=21){
			stationOfMonth="Primavera";
			}
			break;
			
		case 4: //next
		case 5: //next
		case 6: 
			stationOfMonth="Primavera";
			if(this.day>=22){
			stationOfMonth="Verano";
			}
			break;
		case 7: //next
		case 8: //next
		case 9: 
			stationOfMonth="Verano";
			if(this.day>=23){
			stationOfMonth="Otoño";
			}
			break;
		case 10: //next
		case 11: //next
		case 12: 
			stationOfMonth="Otoño";
			if(this.day>=22){
			stationOfMonth="Invierno";
			}
			break;
			
		}
		return stationOfMonth;	
	}

	public String toString(){
		return this.getDay() + "/"+ this.getMonth()+ "/"+ this.getYear();
	}

	public String restOfMonths(){ //in the same year
		StringBuffer restOfMonths;
		restOfMonths=new StringBuffer();
		for(int i=this.month;i<=12;i++){
			restOfMonths.append(this.getMonthName(i));
			if(i!=12){
			restOfMonths.append(", ");
			}
			if(i==12){
			restOfMonths.append(".");
			}
		}
		return restOfMonths.toString();
	}

	public String restOfDateInAMonth(){
		StringBuffer restOfDateInAMonth;
		restOfDateInAMonth= new StringBuffer();
		for(int i=this.day;i<=31;i++){	
		Date rest;
		rest =new Date(i,this.month,this.year);
			if(rest.isDayOfMonthOk()==true){
				restOfDateInAMonth.append(rest+ "\t");
			}
		}
		return restOfDateInAMonth.toString();
	}
	
	public String sameMonths(){
		StringBuffer sameMonths;
		sameMonths= new StringBuffer();
		for(int i=1;i<=12;i++){
			Date sameMonth;
			sameMonth= new Date(this.day,i,this.year);
			if(this.lastDayOfMonth()==sameMonth.lastDayOfMonth()){
				sameMonths.append(this.getMonthName(i));
				if(i!=12){
					sameMonths.append(", ");
				}
				if(i==12){
					sameMonths.append(".");
				}
			}
		}
		return sameMonths.toString();
	}

	public int daysSinceStartYear(){
		int cont=0;
		Date daysCont;
		daysCont= new Date(this.day,this.month,this.year);
		for (int i=1;i<=daysCont.month;i++){
			if(i==daysCont.month){
				for(int j=0;j<daysCont.day;j++){
					cont=cont+1;
				}
			}
			else {	
				for(int j=0;j<daysCont.lastDayOfMonth(i);j++){
					cont=cont+1;
				}
			daysCont.day=this.day;
			}
		}
		return cont;
	}

	private int lastDayOfMonth(){
		return (this.lastDayOfMonth(this.month));
	}
	private int lastDayOfMonth(int i){
		int lastDay=1;
		switch(i){
		case 1: //next
		case 3: //next
		case 5: //next
		case 7: //next
		case 8: //next
		case 10: //next
		case 12:
			lastDay=31;
			break;
		case 4: //next
		case 6: //next
		case 9: //next
		case 11:
			lastDay=30;
			break;
		case 2:
			lastDay=28;
			break;
		}
	return lastDay;
	}

	/*public int contEqualDate(){
		int cont, day, month;
		cont=0; day=1; month=1;
		Date random;
		random =new Date(day,month,this.year);
		while(this.isSame(random)==false){
			random.month=(int)(Math.random()*12+1);
			random.day=(int)(Math.random()*(this.lastDayOfMonth(month))+1);
			cont = cont +1;
		}
		return cont;
	}*/
	public int contEqualDate(){
		int cont, day, month;
		cont=0; day=1; month=1;
		Date random;
		random =new Date(day,month,this.year);
		do{
			random.month=(int)(Math.random()*12)+1;
			random.day=(int)(Math.random()*(this.lastDayOfMonth(month)))+1;
			cont = cont +1;
		}while(this.isSame(random)==false);
		return cont;
	}

	private String dayOfFirstWeek(int i){//Sabiendo que el 1 de Enero es Lunes
		String dayOfFirstWeek;
		dayOfFirstWeek=null;
		switch(i){
		case 1:
			dayOfFirstWeek="Lunes";
			break;
		case 2: 
			dayOfFirstWeek="Martes";
			break;
		case 3: 
			dayOfFirstWeek="Miercoles";
			break;
		case 4:
			dayOfFirstWeek="Jueves";
			break;
		case 5:
			dayOfFirstWeek="Viernes";
			break;
		case 6:
			dayOfFirstWeek="Sabado";
			break;
		case 0:
			dayOfFirstWeek="Domingo";
			break;
		}
		return dayOfFirstWeek;
	}

	public String nameDayOfWeek(){
		int days;
		days=this.daysSinceStartYear();
		while (days>=7){
			days=days%7;
		}
		return (this.dayOfFirstWeek(days));
	}
}
