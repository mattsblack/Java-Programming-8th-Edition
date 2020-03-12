public class JobApplicant
{
    private String name;
    private long phoneNumber;
    private boolean word;
    private boolean spreadsheet;
    private boolean database;
    private boolean graphics;
    
    public JobApplicant(String appName, long phone, boolean wd, boolean ss, boolean db, boolean gp) //parameterized constructor
    {
        name = appName;
        phoneNumber = phone;
        word = wd;
        spreadsheet = ss;
        database = db;
        graphics = gp;
    }
    public void setName(String appName) //set method
    {
        name = appName;
    }
    public void setPhone(int phone) //set method
    {
        phoneNumber = phone;
    }
    public boolean getWord() //get method
    {
        return word;
    }
    public boolean getSpreadSheet() //get method
    {
        return spreadsheet;
    }
    public boolean getDatabase()
    {
        return database;
    }
    public boolean getGraphics() //get method
    {
        return graphics;
    }
    public void setWord(boolean wd)
    {
        word = wd;
    }
    public void setSpreadSheet(boolean ss)
    {
        spreadsheet = ss;
    }
    public void setDatabase(boolean db)
    {
        database = db;
    }
    public void setGraphics(boolean gp)
    {
        graphics = gp;
    }
}