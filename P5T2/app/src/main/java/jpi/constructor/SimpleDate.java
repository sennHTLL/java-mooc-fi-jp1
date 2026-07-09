package jpi.constructor;

public class SimpleDate {
    
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() { return this.day; }
    public int getMonth() { return this.month; }
    public int getYear() {return this.year; }

    public boolean before(SimpleDate compared) { 
        boolean isItYear  = (this.year  < compared.year)  ? true : false;
        boolean isItMonth = (this.month < compared.month) ? true : false;
        boolean isItDay   = (this.day   < compared.day)   ? true : false;

        if (this.year == compared.year) {
            if (this.month == compared.month) {
                return isItDay;
            }
            return isItMonth; 
        }
        else { 
            return isItYear; 
        }
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
