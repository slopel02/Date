package es.unileon.prg;
public class mainDate{
	public static void main(String [] args){
		Date today,tomorrow;
		today= new Date(14,2,2018);
		tomorrow= new Date(15,3,2018);
		System.out.println("Today y tomorrow tienen el mismo año "+today.isSameYear(tomorrow));
		System.out.println("Today y tomorrow tienen el mismo mes "+today.isSameMonth(tomorrow));
		System.out.println("Today y tomorrow tienen el mismo dia "+today.isSameDay(tomorrow));
		System.out.println("Today y tomorrow son el mismo dia "+today.isSame(tomorrow));
		System.out.println(today.getMonthName());
		System.out.println(today.isDayOfMonthOk());
		System.out.println(today.stationOfMonth());
		System.out.println(today.restOfMonths());
		System.out.println(today.restOfDaysInAMonth());
		System.out.println(today.sameMonths());
		System.out.println("Dias desde que comenzo el año "+today.daysSinceStartYear());
		System.out.println("Intentos para adivinar la fecha: "today.contEqualDate());
	}
}
