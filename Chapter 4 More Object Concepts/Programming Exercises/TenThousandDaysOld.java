import java.time.*;
public class TenThousandDaysOld {
   public static void main(String[] args) {
      LocalDate birthday = LocalDate.of(2003, 2, 23);
      System.out.println("You will turn 10000 days old on " + birthday.plusDays(10000));
   }
}