public class Automobile
{
  int id;
  String make;
  String model;
  String color;
  int year;
  int vin_number;
  int mile_per_gallon;
  int speed;
  public Automobile (int id, String make, String model, String color,
     int year, int vin_number, int mile_per_gallon, int speed) //parameterize constructor
  {
    setId(id);
    setmake(make);
    setModel(model);
    setcolor(color);
    setYear(year);
    setVin_number(vin_number);
    setmile_per_gallon(mile_per_gallon);
    setspeed(speed);
  }
  public void Accelerator () //accelerator method
  {
    speed = speed + 5;
  }
  public void Brake () //brake method
  {
    speed = speed - 5;
  }
  public void Accelerator (int s)
  {
    speed = speed + s;
  }
  public void Brake (int b)
  {
    speed = speed - b;
  }
  public int getId ()
  {
    return id; //return id
  }
  public void setId (int id)
  {
    if (id < 0 && id > 9999)
      this.id = id;
    else
      this.id = 0;
  }
  public String getmake ()
  {
    return make; //return make
  }
  public void setmake (String m)
  {
    this.make = m;
  }
  public String getModel ()
  {
    return model; //return model
  }
  public void setModel (String m)
  {
    this.model = m;
  }
  public String getcolor ()
  {
    return color; //return color
  }
  public void setcolor (String c)
  {
    this.color = c;
  }
  public int getyear ()
  {
    return year; //return year
  }
  public void setYear (int y)
  {
    this.year = y;
  }
  public int getvin_number()
  {
    return vin_number; //return vin_number
  }
  public void setVin_number (int v)
  {
    this.vin_number = v;
  }
  public int getmile_per_gallon()
    {
        return mile_per_gallon; //return mile_per_gallon
    }
  public void setmile_per_gallon(int m)
    {
        this.mile_per_gallon = m;
    }
  public int getspeed()
    {
        return speed; //return speed
    }
  public void setspeed(int s)
    {
        this.speed = s;
    }
}
