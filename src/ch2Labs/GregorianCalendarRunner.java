package ch2Labs;

import java.util.GregorianCalendar;
public class GregorianCalendarRunner
{
   public static void main(String[] args)
   {
      GregorianCalendar date = new GregorianCalendar();

      date.add(GregorianCalendar.DAY_OF_MONTH, 100);
      System.out.printf("100 days from today is %s %s %d, %d\n",
            getWeekday(date.get(GregorianCalendar.DAY_OF_WEEK)),
            getMonth(date.get(GregorianCalendar.MONTH)),
            date.get(GregorianCalendar.DAY_OF_MONTH),
            date.get(GregorianCalendar.YEAR));
      date = new GregorianCalendar(2001, GregorianCalendar.JUNE, 6);

      System.out.printf("Max Ho was born on a %s\n",
            getWeekday(date.get(GregorianCalendar.DAY_OF_WEEK)));
      date.add(GregorianCalendar.DAY_OF_MONTH, 10000);
      System.out.printf(
            "10,000 days from Max's birthday is %s %s %d, %d\n",
            getWeekday(date.get(GregorianCalendar.DAY_OF_WEEK)),
            getMonth(date.get(GregorianCalendar.MONTH)),
            date.get(GregorianCalendar.DAY_OF_MONTH),
            date.get(GregorianCalendar.YEAR));
   }
   
   private static String getWeekday(int day_of_week)
   {
      String day = "";

      switch (day_of_week)
      {
         case (GregorianCalendar.SUNDAY):
            day = "Sunday";
            break;
         case (GregorianCalendar.MONDAY):
            day = "Monday";
            break;
         case (GregorianCalendar.TUESDAY):
            day = "Tuesday";
            break;
         case (GregorianCalendar.WEDNESDAY):
            day = "Wednesday";
            break;
         case (GregorianCalendar.THURSDAY):
            day = "Thursday";
            break;
         case (GregorianCalendar.FRIDAY):
            day = "Friday";
            break;
         case (GregorianCalendar.SATURDAY):
            day = "Saturday";
            break;
      }

      return day;
   }

   private static String getMonth(int month)
   {
      String monthStr = "";

      switch (month)
      {
         case (GregorianCalendar.JANUARY):
            monthStr = "January";
            break;
         case (GregorianCalendar.FEBRUARY):
            monthStr = "February";
            break;
         case (GregorianCalendar.MARCH):
            monthStr = "March";
            break;
         case (GregorianCalendar.APRIL):
            monthStr = "April";
            break;
         case (GregorianCalendar.MAY):
            monthStr = "May";
            break;
         case (GregorianCalendar.JUNE):
            monthStr = "June";
            break;
         case (GregorianCalendar.JULY):
            monthStr = "July";
            break;
         case (GregorianCalendar.AUGUST):
            monthStr = "August";
            break;
         case (GregorianCalendar.SEPTEMBER):
            monthStr = "September";
            break;
         case (GregorianCalendar.OCTOBER):
            monthStr = "October";
            break;
         case (GregorianCalendar.NOVEMBER):
            monthStr = "November";
            break;
         case (GregorianCalendar.DECEMBER):
            monthStr = "December";
            break;
      }

      return monthStr;
   }
}

