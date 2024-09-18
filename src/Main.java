import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any day of the week");
		String weekday = in.nextLine();
		System.out.println("Enter a place");
		String place = in.nextLine();
		System.out.println("Enter a name");
		String name = in.nextLine();
		System.out.println("Enter an emotion");
		String emotion = in.nextLine();
		System.out.println("Enter a fruit");
		String fruit = in.nextLine();
		System.out.println("Enter a decimal");
		double decNumber = in.nextDouble();
		System.out.println("Enter a number");
		int score = in.nextInt();
		in.nextLine();
		System.out.println("Enter a insect");
		String insect = in.nextLine();
		

		
		//STORY
		System.out.println("On a random "+weekday+" I was feeling "+emotion+" so I went to the "+place+" with "+name+". On our walk there we ran into a vendor selling some "+fruit+" for "+decNumber+". After buying the fruit, we found "+score+" "+insect+" in the box!!");
			}

}
