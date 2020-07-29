public class RoundingDemo1
{
   public static void main(String[] args)
   {
       double answer = 2.20 - 2.00;
       boolean isEqual;
       isEqual = answer == 0.20;
       System.out.println("Before conversion");
       System.out.println("answer is " + answer);
       System.out.println("isEqual is " + isEqual);
       answer = answer * 100;
       answer = answer + 0.5;
       answer = (int) answer;
       answer = answer / 100;
       isEqual = answer == 0.20;
       System.out.println("After conversion");
       System.out.println("answer is " + answer);
       System.out.println("isEqual is " + isEqual);
   }
}
