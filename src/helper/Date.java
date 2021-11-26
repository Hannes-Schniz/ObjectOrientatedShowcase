package helper;
import helper.*;

/***
 * @author Hannes Schniz
 * @version 0.1
 */
public class Date {
    private int day;
    private Month month;
    private int year;

    /***
     *
     * @param day
     * @param month
     * @param year
     */
    public Date(int day, Month month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     *
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     *
     * @return the month
     */
    public Month getMonth() {
        return month;
    }

    /**
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }
}
