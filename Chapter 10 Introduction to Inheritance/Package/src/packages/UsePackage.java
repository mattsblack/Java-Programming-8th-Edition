package packages;

import java.util.Scanner;

public class UsePackage {
	public static void main(String[] args) {
		Package package1, package2, package3;
        InsuredPackage insuredPackage1, insuredPackage2, insuredPackage3;
        int weight1, weight2, weight3, weight4, weight5, weight6;
        char method1, method2, method3, method4, method5, method6;
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert the weight of your shipping >> ");
        weight1 = input.nextInt();
        input.nextLine();
        System.out.print("Now, please insert the method >> ");
        method1 = Character.toUpperCase(input.nextLine().charAt(0));
        package1 = new Package(weight1, method1);
        System.out.print("Please insert the weight of your shipping >> ");
        weight2 = input.nextInt();
        input.nextLine();
        System.out.print("Now, please insert the method >> ");
        method2 = Character.toUpperCase(input.nextLine().charAt(0));
        package2 = new Package(weight2, method2);
        System.out.print("Please insert the weight of your shipping >> ");
        weight3 = input.nextInt();
        input.nextLine();
        System.out.print("Now, please insert the method >> ");
        method3 = Character.toUpperCase(input.nextLine().charAt(0));
        package3 = new Package(weight3, method3);
        System.out.print("Please insert the weight of your shipping >> ");
        weight4 = input.nextInt();
        input.nextLine();
        System.out.print("Now, please insert the method >> ");
        method4 = Character.toUpperCase(input.nextLine().charAt(0));
        insuredPackage1 = new InsuredPackage(weight4, method4);
        System.out.print("Please insert the weight of your shipping >> ");
        weight5 = input.nextInt();
        input.nextLine();
        System.out.print("Now, please insert the method >> ");
        method5 = Character.toUpperCase(input.nextLine().charAt(0));
        insuredPackage2 = new InsuredPackage(weight5, method5);
        System.out.print("Please insert the weight of your shipping >> ");
        weight6 = input.nextInt();
        input.nextLine();
        System.out.print("Now, please insert the method >> ");
        method6 = Character.toUpperCase(input.nextLine().charAt(0));
        insuredPackage3 = new InsuredPackage(weight6, method6);
        package1.display();
        package2.display();
        package3.display();
        insuredPackage1.display();
        insuredPackage2.display();
        insuredPackage3.display();
	}
}
