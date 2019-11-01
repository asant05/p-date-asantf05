package es.unileon.prg1.pdate;
/**
 * Clase date para practica date.
 * @author ainoa
 *
 */
public class Date {

		private int day;
		private int month;
		private int year;
		
		/**
		 * Constructor  de la clase date
		 */
		
		public Date(){
			
			this.day=1;
			this.month=1;
			this.year=1;
		}

		
		public Date(int day,int month,int year){
			
			this.day=day;
			this.month=month;
			this.year=year;
		}


		public boolean isSameYear(Date miFecha) {
			return (this.year == miFecha.getYear());
		}
		public boolean isSameMonth(Date miFecha) {
			return (this.month == miFecha.getMonth());
		}
		public boolean isSameDay(Date miFecha) {
			return (this.day == miFecha.getDay());
		}
		
		@Override
		public String toString() {
			return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
		}

		//Setters y getters
		
		public int getDay() {
			return day;
		}


		public void setDay(int day) throws DateException {
			if (day>0 && day<32) {
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
		
		

}
