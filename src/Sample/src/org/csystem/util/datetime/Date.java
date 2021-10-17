/*----------------------------------------------------------------------
	FILE        : Date.java
	AUTHOR      : Java-May-2021 Group
	LAST UPDATE : 17.10.2021

	Date class for date operations

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

public class Date {
    private static final int [] daysOfMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static final String [] ms_monthsTR = {"", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz",
            "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};

    private static final String [] ms_daysOfWeekTR = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};

    private static final String [] ms_monthsEN = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    private static final String [] ms_daysOfWeekEN = {"Sun", "mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

    private static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static boolean isValidDate(int day, int month, int year)
    {
        if (day < 1 || day > 31 || month < 1 || month > 12)
            return false;

        return day <= (month == 2 && isLeapYear(year) ? 29 : daysOfMonths[month]);
    }

    private static int getTotalDaysByMonth(int month, int year)
    {
        int totalDays = 0;

        for (int m = month - 1; m >= 1; --m)
            totalDays += daysOfMonths[m];

        return month > 2 && isLeapYear(year) ? totalDays + 1 : totalDays;
    }

    private static int getDayOfYear(int day, int month, int year)
    {
        return isValidDate(day, month, year) ? day + getTotalDaysByMonth(month, year) : -1;
    }

    private static int getDayOfWeek(int day, int month, int year)
    {
        int totalDays;

        if (year < 1900 || (totalDays = getDayOfYear(day, month, year)) == -1)
            return -1;

        for (int y = 1900; y < year; ++y)
            totalDays += isLeapYear(y) ? 366 : 365;

        return totalDays % 7;
    }

    private static String getDaySuffix(int day)
    {
        String suffix = "th";

        switch (day) {
            case 1:
            case 21:
            case 31:
                suffix = "st";
                break;
            case 2:
            case 22:
                suffix = "nd";
                break;
            case 3:
            case 23:
                suffix = "rd";
        }

        return suffix;
    }

    private static void doWorkForException(String message)
    {
        System.out.println(message);
        System.exit(1); //Exception işlemleri konusuna kadar sabredin
    }

    private static void checkForDate(int day, int month, int year, String errMessage)
    {
        if (!isValidDate(day, month, year))
            doWorkForException(errMessage);
    }

    private void checkForDay(int val, String errMessage)
    {
        checkForDate(val, m_month, m_year, errMessage);
    }

    private void checkForMonth(int val, String errMessage)
    {
        checkForDate(m_day, val, m_year, errMessage);
    }

    private void checkForYear(int val, String errMessage)
    {
        checkForDate(m_day, m_month, val, errMessage);
    }

    private void set(int day, int month, int year)
    {
        m_day = day;
        m_month = month;
        m_year = year;
        m_dayOfWeek = getDayOfWeek(m_day, m_month, m_year);
    }

    private int m_day;
    private int m_month;
    private int m_year;
    private int m_dayOfWeek;

    public Date(int day, int month, int year)
    {
        checkForDate(day, month, year, String.format("Invalid date value or values -> day: %d, month: %d, year: %d",
                day, month, year));
        set(day, month, year);
    }

    public int getDay()
    {
        return m_day;
    }

    public void setDay(int day)
    {
        if (day == m_day)
            return;

        checkForDay(day, "Invalid day value:" + day);
        set(day, m_month, m_year);
    }

    public int getMonthValue()
    {
        return m_month;
    }

    public void setMonthValue(int month)
    {
        if (month == m_month)
            return;

        checkForMonth(month, "Invalid month value:" + month);
        set(m_day, month, m_year);
    }

    public int getYear()
    {
        return m_year;
    }

    public void setYear(int year)
    {
        if (year == m_year)
            return;

        checkForYear(year, "Invalid year value:" + year);
        set(m_day, m_month, year);
    }

    public int getDayOfWeekValue()
    {
        return m_dayOfWeek;
    }

    public String getDayOfWeekTR()
    {
        return ms_daysOfWeekTR[m_dayOfWeek];
    }

    public String getDayOfWeekEN()
    {
        return ms_daysOfWeekEN[m_dayOfWeek];
    }

    public String toLongDateStringTR()
    {
        return String.format("%d %s %d %s", m_day, ms_monthsTR[m_month], m_year, getDayOfWeekTR());
    }

    public String toLongDateStringEN()
    {
        return String.format("%d%s %s %d %s", m_day, getDaySuffix(m_day), ms_monthsEN[m_month], m_year, getDayOfWeekEN());
    }
}
