/**
 * @author Joyce Farrell.
 * The Employee2 class contains data about one employee.
 * Fields include an ID number and an hourly pay rate.
 */
public class Employee2
{
   /**
    * Employee ID number
    */
   private int idNum;
   /**
    * Employee hourly pay
    */
   private double hourlyPay;
   /**
    * Sole constructor for Employee2
    */
   public Employee2(int id, double pay)
   {
      idNum = id;
      hourlyPay = pay;
   }
   /**
    * Returns the Employee2 ID number
    *
    * @return int
    */
   int getIdNum()
   {
      return idNum;
   }
   /**
    * Sets the Employee2 ID number
    *
    * @param id employee ID number
    */
   void setIdNum(int id)
   {
      idNum = id;
   }
}
