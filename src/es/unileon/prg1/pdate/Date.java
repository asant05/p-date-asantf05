package es.unileon.prg1.pdate;
/**
 * Clase date para practica date.
 * @author Ainoa Santos
 *
 */
public class Date {

		private int day;
		private int month;
		private int year;
		
		/**
		 * Constructor  de la clase date
		 */
		
		public Date(int day,int month,int year)throws DateException{
			
			this.day=day;
			this.month=month;
			this.year=year;
		}
		public Date(){
			
			this.day=1;
			this.month=1;
			this.year=1;
		}
		//Setters y getters
		
		public int getDay() {
			return day;
		}

			//Comprobar cuantos dias tiene cada mes
			public int getDaysOfTheMonth(int month) {
				int numeroDias=0;
				switch(month) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						numeroDias=31;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						numeroDias=30;
						break;
					case 2:
						numeroDias=28;
						break;
					default:
						numeroDias=-1;
				}
				return numeroDias;
			}
	
		public void setDay(int day) throws DateException {
			if (day>0 && day<getDaysOfTheMonth(month)) {
				this.day=day;
			}
			else {
				throw new DateException("Error en el dia introducido");
			}
		}

		public int getMonth() {
			return month;
		}


		public void setMonth(int month) throws DateException {
			if (month>0 && month<13) {
				this.month=month;
			}
			else {
				throw new DateException("Error en el mes introducido");
			}
		}


		public int getYear() {
			return year;
		}

		public void setYear(int year) throws DateException {
			if (year>0) {
				this.year=year;
			}
			else {
				throw new DateException("Error en el año introducido");
			}
		}
			
	

		//If staments, simplificados despues con booleans
		public void ifStaments(int day,int month, int year){
			if(day<0 ||day>31) {
				System.out.println("Error en el dia introducido");
			}
			if(month<0 || month>12) {
				System.out.println("Error en el mes introducido");
			}
			if(year<0) {
				System.out.println("Error en el año introducido");
			}
		}
		
		
		//booleans
		public boolean isSameYear(Date miFecha) {
			return (this.year == miFecha.getYear());
		}
		public boolean isSameMonth(Date miFecha) {
			return (this.month == miFecha.getMonth());
		}
		public boolean isSameDay(Date miFecha) {
			return (this.day == miFecha.getDay());
		}
		public boolean isSame(int day,int month, int year) {
			return ((this.day == day)&&(this.month == month)&&(this.year == year));
		}
		
		
		//Obtener el nombre del mes
		public String getNameOfMonth(){
			String nombreMes="";
			switch (month) {
				case 1 : nombreMes="Enero";
				break;
				case 2 : nombreMes="Febrero";
				break;
				case 3 : nombreMes="Marzo";
				break;
				case 4 : nombreMes="Abril";
				break;
				case 5 : nombreMes="Mayo";
				break;
				case 6 : nombreMes="Junio";
				break;
				case 7 : nombreMes="Julio";
				break;
				case 8 : nombreMes="Agosto";
				break;
				case 9 : nombreMes="Septiembre";
				break;
				case 10 : nombreMes="Octubre";
				break;
				case 11 : nombreMes="Noviembre";
				break;
				case 12 : nombreMes="Diciembre";
				break;
				default: nombreMes="No existe ese numero de mes";
				break;
			}
				
			return getNameOfMonth();
		}
		
		//Metodo para imprimir el mes
		public void printMonth() {
			String month= getNameOfMonth();
			System.out.println("Mes: "+month);
		}
		
		
		//Metodo para chequear si los dias son correctos
			public boolean rigthDay(int day) {
				if (day>0 && day<=getDaysOfTheMonth(day)) {
					return true;
				}
				else {
					return false;
				}
			}
		
		//Para saber en que estacion está la fecha introducida
		public String getSeason(){
			String estacion;
			switch(month) {
				case 1:
				case 2:
				case 3:
					estacion="Invierno";
					break;
				case 4:
				case 5:
				case 6:
					estacion="Primavera";
					break;
				case 7:
				case 8:
				case 9:
					estacion="Verano";
				case 10:
				case 11:
				case 12:
					estacion="Otoño";
					break;
				default:
					estacion="Numero de mes introducido incorrecto";
					break;
			}
			return getSeason();
		}
		
		//Metodo para saber cuantos meses quedan para el fin de año
		public String getMonthsLeft(int month) {
			StringBuffer cadena=new StringBuffer();
			for(int i=month+1;i<=12;i++) {
				cadena.append(getNameOfMonth()+" ");
			}
			return cadena.toString();
		}
		
		//Metodo para escribir en un  string la fecha
		public String printDate(int day, int month, int year) {
			String printDate=" La fecha es : "+day+" / "+month+" / "+year;
			return printDate;
		}
		
		//Metodo para devolver todas las fechas hasta el final del mes
			//Tomorrow
			public Date tomorrow() {
				Date tomorrow = null;
				int d, m, y;
				
				d=this.day;
				m=this.month;
				y=this.year;
				
				d++;
				if(d>this.getDaysOfTheMonth(month)) {
					d=1;
					m++;
					if(m>12) {
						m=1;
						y++;
					}
				}
				try {
					tomorrow=new Date(d,m,y);
				}
				catch(DateException e) {
					e.printStackTrace();
				}
				return tomorrow;
			}
		
		
		public String getDaysLeftOfMonth() {
			Date auxiliar= tomorrow();
			StringBuffer daysLeft =new StringBuffer();
			try {
				for(int i=auxiliar.getDay();rigthDay(i);i++) {
					auxiliar.setDay(i);
					daysLeft.append(auxiliar.toString()+ " ");}
				}
				catch(DateException e) {
					System.err.println("Date.getDaysLeftOfMonth: "+e.getMessage());
				}
				return daysLeft.toString();
			
			}
		
		//Metodo para saber que meses tienen el mismo numero de dias
		
		public void printMonthsWhitTheSameNumberOfDays(int month){
			StringBuffer cadena=new StringBuffer();
			cadena.append("Todos estos mesess tienen el mismo numero de dias : ");
			for (int i=1;i<=12;i++) {
				if(getDaysOfTheMonth(i)==getDaysOfTheMonth(month)) {
					cadena.append(getNameOfMonth()+ " ");
				}
			}
			System.out.println(cadena.toString());
		}
		
		//Metodo para contar el numero de dias que han pasado desde el primer dia del año
		public int daysPast() throws DateException {
			int daysPast=0;
			Date temp=new Date(1,1,year);
			for(int i=1;i<month;i++) {
				daysPast+=getDaysOfTheMonth(i);
				temp.setMonth(i+1);
			}
			daysPast=daysPast+day-1;
			return daysPast;
		}
		
		//Metodo para contar el numero de intentos necesarios para al azar deicr la misma fecha dentro de un año
		
			//Metodo con while
			public int numberOfAttemptsWhile(){
				int number=0;
				int day=0;
				int month=0;
				int year=0;
				
				while(isSame(day,month,year)) {
					month=(int)(Math.random()*12)+1;
					day=(int)(Math.random()*this.getDaysOfTheMonth(month))+1;
					year=year;
					number++;
				}
				return number;
			}
			
			//Metodo con do-while
			public int numberOfAttemptsDo(){
				int number=0;
				int day=0;
				int month=0;
				int year=0;
				
				do {
					month=(int)(Math.random()*12)+1;
					day=(int)(Math.random()*this.getDaysOfTheMonth(month))+1;
					year=year;
					number++;
				}
				while(isSame(day,month,year));
				return number;
			}
			
		//Metodo para saber que dia de la semana es si sabemos el dia de la semana del primer dia del año
			
		public String diaDeLaSemana(int day){
			String diaDeLaSemana=" ";
			switch(day) {
				case 1:
					diaDeLaSemana="Lunes";
					break;
				case 2:
					diaDeLaSemana="Martes";
					break;
				case 3:
					diaDeLaSemana="Miercoles";
					break;
				case 4:
					diaDeLaSemana="Jueves";
					break;
				case 5:
					diaDeLaSemana="Viernes";
					break;
				case 6:
					diaDeLaSemana="Sabado";
					break;
				case 7:
					diaDeLaSemana="Domingo";
					break;
				default:
					diaDeLaSemana="Numero de dia introducido incorrectamente";
					break;
					
			}
			
			return diaDeLaSemana;
		}
		
		public String dayOfWeek(int day) throws DateException {
			int name;
			name=(daysPast()%7 + day)%7;
			return diaDeLaSemana(name);
		}
		
		
		public String toString() {
			return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
		}

		

}
