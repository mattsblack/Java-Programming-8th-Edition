import java.time.*;
public class DaysTilNextMonth {
   public static void main(String[] args) {
      LocalDate day = LocalDate.now();
      int month = day.getDayOfMonth();
      int daysinmonth = day.lengthOfMonth();
      System.out.println(daysinmonth - month);
   }
}
      