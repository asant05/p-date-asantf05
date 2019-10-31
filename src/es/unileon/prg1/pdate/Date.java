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

		
		public Date(int day,int month,int year) {
			this.day=day;
			this.month=month;
			this.year=year;
		}


		public boolean isSameYear(Date miFecha) {
			boolean retorno=false;
			if(this.year == miFecha.year) {
			retorno=true;
			}
			return retorno;
		}
		
		@Override
		public String toString() {
			return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
		}


		public int getDay() {
			return day;
		}


		public void setDay(int day) {
			this.day = day;
		}


		public int getMonth() {
			return month;
		}


		public void setMonth(int month) {
			this.month = month;
		}


		public int getYear() {
			return year;
		}


		public void setYear(int year) {
			this.year = year;
		}
		
		

}
