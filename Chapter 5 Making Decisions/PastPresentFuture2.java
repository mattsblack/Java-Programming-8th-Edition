import java.time.*;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class PastPresentFuture2 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      LocalDate today = LocalDate.now();
      LocalDate insert;
      int mo,da,yr;
      int todayMo,todayDa,todayYr;
      todayMo = today.getMonthValue();
      todayDa = today.getDayOfMonth();
      todayYr = today.getYear();
      System.out.println("Enter a month >> ");
      mo = input.nextInt();
      System.out.println("Enter a day >> ");
      da = input.nextInt();
      System.out.println("Enter a year (four digits) >> ");
      yr = input.nextInt();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
      insert = LocalDate.parse(mo+"/"+da+"/"+yr, formatter);
      System.out.println(insert);
      if(today.isBefore(insert))
         System.out.println("The inserted date is in the future");
      else
         if(today.equals(insert))
            System.out.println("The inserted date is today");
         else
            if(today.isAfter(insert))
               System.out.println("The inserted date is in the past");
   }
}