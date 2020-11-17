package es.unileon.prg1.date;

public class Date{

    private int day;

    private int month;

    private int year;

    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 2020;
    }

    public Date(int date, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }

    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month = month;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }


    //Comprobaciones
    if(year <= 0){
		throw new DateException("La fecha introducida no es valida, no hay anios negativos.");
	}else{
		this.year = year;
	}
	
	if (month <= 0 || month >= 13) {
		throw new DateException("La fecha introducida no es valida, solo hay 12 meses.");
	} else {
		this.month = month;
	}

	switch(this.month) {
		case (1):
		case (3):
		case (5):
		case (7):
		case (8):
		case (10):
		case (12):
			if(day <= 0 || day > 31) {
				throw new DateException("La fecha introducida no es valida, este mes tiene 31 dias.");
			}else {
				this.day = day;
			}break;
		case (4):
		case (6):
		case (9):
		case (11):
			if(day <= 0 || day > 30) {
				throw new DateException("La fecha introducida no es valida, este mes tiene 30 dias.");
			}else {
				this.day = day;
			}break;
		case (2):
			if(day <= 0 || day > 28) {
				throw new DateException("La fecha introducida no es valida, este mes tiene 28 dias.");
			}else {
				this.day = day;
			}			
	}


    public boolean isSameDay(Date another){

		boolean sameDay = false;

		if(this.day == another.getDay()){
			sameDay = true;
			System.out.println("Sigue siendo el mismo dia?");
		}else{
			sameDay = false;
			System.out.println("Sigue siendo el mismo dia?");
		}

		return sameDay;
	}
    
    public boolean isSameMonth(Date another){

		boolean sameMonth = false;

		if(this.month == another.getMonth()){
			sameMonth = true;
			System.out.println("Sigue siendo el mismo mes?");
		}else{
			sameMonth = false;
			System.out.println("Sigue siendo el mismo mes?");
		}

		return sameMonth;
	}

    public boolean isSameYear(Date another){

		boolean sameYear = false;

		if(this.year == another.getYear()){
			sameYear = true;
			System.out.println("Sigue siendo el mismo anio?");
		}else{
			sameYear = false;
			System.out.println("Sigue siendo el mismo anio?");
		}

		return sameYear;
	}

    
    //Devolver nombre del mes
    public String getMonthName(){

		String monthName = " ";

		switch(month){
			case (1):
				monthName = "January";
				break;
			case (2):
				monthName = "February";
				break;
			case (3): 
				monthName = "March";
				break;
			case (4):
				monthName = "April";
				break;
			case (5):
				monthName = "May";
				break;
			case (6):
				monthName = "June";
				break;
			case (7):
				monthName = "July";
				break;
			case (8):
				monthName = "August";
				break;
			case (9):
				monthName = "September";
				break;
			case (10):
				monthName = "October";
				break;
			case (11):
				monthName = "November";
				break;
			default:
				monthName = "December";
		}

		return monthName;
	}


    //Devuelve la estacion
    public String getSeasonName(){

		String season = " ";

		switch(month) {
			case (1): 
			case (2):
			case (12):
				season = "Winter";
				break;	
			case (3):
			case (4):
			case (5):
				season = "Spring";
				break;
			case (6):
			case (7):
			case (8):
				season = "Summer";
				break;
			case (9):
			case (10):
			case (11):
				season = "Autumn";
				break;
		}

		return season;
	}


    Date (int year){

    }

    boolean equals(Date another){
        boolean equals;
        equals = (this.day == another.getDay()) && (this.month == another.getMonth()) && (this.year == another.getYear());
        return equals;
    }

    int numAttemptsRandomDateSameYear(){
        int attempts;
        Date randomDate;

        attempts = 1;
        randomDate = new Date(this.year);
        
        while(!this.equals(randomDate)){
            randomDate = new Date(this.year);
            attempts++;
        }

        return attempts;
    }

}