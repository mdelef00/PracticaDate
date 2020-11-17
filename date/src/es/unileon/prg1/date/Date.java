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
}