package es.unileon.prg;
public class mainDate{
	public static void main(String [] args){
		Date today,tomorrow;
		today= new Date(31,3,2018);
		tomorrow= new Date(15,3,2018);
		System.out.println(today);
		System.out.println(tomorrow);
		System.out.println("Today y tomorrow tienen el mismo año "+today.isSameYear(tomorrow));
		System.out.println("Today y tomorrow tienen el mismo mes "+today.isSameMonth(tomorrow));
		System.out.println("Today y tomorrow tienen el mismo dia "+today.isSameDay(tomorrow));
		System.out.println("Today y tomorrow son el mismo dia "+today.isSame(tomorrow));
		System.out.println("Nombre del mes: "+today.getMonthName());
		System.out.println("Es el dia correcto en el mes: "+today.isDayOfMonthOk());
		System.out.println("La estacion de today "+today.stationOfMonth());
		System.out.println("Los meses desde el mes de today hasta final de año: "+today.restOfMonths());
		System.out.println("Las fechas desde today hasta final de mes:\n "+ today.restOfDateInAMonth());
		System.out.println("Los meses que tienen los mismos dias que el mes de today: "+today.sameMonths());
		System.out.println("Desde que comenzo el año hasta today han pasado "+today.daysSinceStartYear()+" dias");
		System.out.println("Intentos para adivinar la fecha today: "+today.contEqualDate());
		System.out.println("El dia de la semana de today es " +today.nameDayOfWeek());
		
	}
}

