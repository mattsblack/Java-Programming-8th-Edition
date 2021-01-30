package poems;

import java.util.Scanner;

public class DemoPoems {
	public static void main(String[] args) {
		 	Poem poem;
	        Couplet couplet;
	        Haiku haiku;
	        Limerick limerick;
	        String poemName, coupletName, haikuName, limerickName;
	        int poemNumLines;
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the name for the poem >> ");
	        poemName = input.nextLine();
	        System.out.print("Now, enter its number of lines >> ");
	        poemNumLines = input.nextInt();
	        input.nextLine();
	        System.out.print("Now, enter the name for the couplet >> ");
	        coupletName = input.nextLine();
	        System.out.print("Now, enter the name for the haiku >> ");
	        haikuName = input.nextLine();
	        System.out.print("Now, enter the name for the limerick >> ");
	        limerickName = input.nextLine();
	        poem = new Poem(poemName, poemNumLines);
	        couplet = new Couplet(coupletName);
	        haiku = new Haiku(haikuName);
	        limerick = new Limerick(limerickName);
	        System.out.println("--------------------------------------");
	        System.out.println("The registered poems are:\n"
	        +poem.getName()+" and its number of lines are: "+poem.getLines()
	        +"\n"+couplet.getName()+" and its number of lines are: "+couplet.getLines()
	        +"\n"+haiku.getName()+" and its number of lines are: "+haiku.getLines()
	        +"\n"+limerick.getName()+" and its number of lines are: "+limerick.getLines());
	}
}
