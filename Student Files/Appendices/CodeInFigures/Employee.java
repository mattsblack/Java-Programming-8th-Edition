/**
 * @author Joyce Farrell.
 * The Employee class contains data about one employee.
 * Fields include an ID number and an hourly pay rate.
 */
public class Employee
{
   private int idNum;
   private double hourlyPay;
   public Employee(int id, double pay)
   {
      idNum = id;
      hourlyPay = pay;
   }
   int getIdNum()
   {
      return idNum;
   }
   void setIdNum(int id)
   {
      idNum = id;
   }
}
