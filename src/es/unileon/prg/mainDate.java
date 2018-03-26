package es.unileon.prg;
public class mainDate{
	public static void main(String [] args){
		Date today,tomorrow;
		today= new Date(14,3,2018);
		tomorrow= new Date(15,3,2018);
		today.isSameYear(tomorrow);
		today.isSameMonth(tomorrow);
		today.isSameDay(tomorrow);
		today.isSame(tomorrow);
		System.out.println(today.getMonthName());
		System.out.println(today.isDayOfMonthOk());
		System.out.println(today.stationOfMonth());
	}
}
