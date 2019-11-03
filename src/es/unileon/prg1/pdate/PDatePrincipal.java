package es.unileon.prg1.pdate;

public class PDatePrincipal{
	public static void main(String[]args ) throws DateException{
		Date myFecha= new Date(30,12,2019);
		Date myFecha2= new Date(1,11,2019);
	
		
		
		//Comparacion del año
		if(myFecha.isSameYear(myFecha2)) {
			System.out.println("Es el mismo año");
		}
		else {
			System.out.println("No es el mismo año");
		}
		
		//Comparacion del mes	
		if(myFecha.isSameMonth(myFecha2)) {
			System.out.println("Es el mismo mes");
		}
		else {
			System.out.println("No es el mismo mes");
		}
		
		//Comparacion del dia
			if(myFecha.isSameDay(myFecha2)) {
				System.out.println("Es el mismo dia");
			}
			else {
				System.out.println("No es el mismo dia");
			}
		
			
		//Comparacion de la fecha en general
		if((myFecha.isSameYear(myFecha2)) && (myFecha.isSameMonth(myFecha2))&&(myFecha.isSameDay(myFecha2))) {
			System.out.println("Es la misma fecha");
		}
		
		
				System.out.println(myFecha);
		
		
		Date today;
		

		try {
			today = new Date(90, 10, 2017);
			System.out.println(today.toString());
		}
		catch (DateException e) {
			System.out.println(e.getMessage());
		}
		
	
		
	}
	
	
}