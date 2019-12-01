public class TestJobApplicants
{
public static void main(String[] args)
{
    int qualCounter=0;
    JobApplicant applicant = new JobApplicant("ABC", 98125123, true, true, true, false);
    if(applicant.getWord() == true)
    qualCounter++;
    if(applicant.getSpreadSheet() == true)
    qualCounter++;
    if(applicant.getDatabase() == true)
    qualCounter++;
    if(applicant.getGraphics() == true)
    qualCounter++;
    if(qualCounter>=3)
System.out.println("Qualified Applicant");
else
System.out.println("Applicant is not qualified ");
}
}