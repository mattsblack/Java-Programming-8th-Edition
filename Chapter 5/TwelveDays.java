public class TwelveDays
{
    public static void main(String[] args)
    {
        System.out.print("Twelve Days of Christmas\n\n");
        int index;

        String ordinal_numbers[] = { "first", "second",   "third",  "fourth", "fifth",  "sixth",  "seventh",  "eighth",  "ninth", "tenth", "eleventh",  "twelfth"};

        for(index = 1; index <= 12; ++index)
        {
            System.out.print("On the " + ordinal_numbers[index-1]+ " day of Christmas,\n");
            switch(index)
            {
                case 12:
                    System.out.println("Twelve Drummers Drumming");

                case 11:
                    System.out.println("Eleven Pipers Piping");

                case 10:
                    System.out.println("Ten Lords a Leaping");

                case 9:
                    System.out.println("Nine Ladies Dancing");

                case 8:
                    System.out.println("Eight Maids a Milking");

                case 7:
                    System.out.println("Seven Swans a Swimming");

                case 6:
                    System.out.println("Six Geese a Laying");

                case 5:
                    System.out.println("Five Golden Rings");

                case 4:
                    System.out.println("Four Calling Birds");

                case 3:
                    System.out.println("Three French Hens");

                case 2:
                    System.out.println("Two Turtle Doves");

                case 1:
                    if(index == 0)
                        System.out.print("A Partridge in a Pear Tree.\n\n");
                    else
                        System.out.print("and a Partridge in a Pear Tree.\n\n");
                    break;
                default:
                    System.out.print("Internal Error.");
                    System.exit(1);
            }
        }                                     
    }
}