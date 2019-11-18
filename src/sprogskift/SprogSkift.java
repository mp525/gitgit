package sprogskift;

import java.io.FileNotFoundException;
import java.util.Scanner;
public class SprogSkift {
	//static Dansk sprog;
	public static SprogI sprog = new Dansk();
	//public static DogList dogs; 
	public static DogListI dogs; 
	
	static Scanner sc;
	public static void main(String[] args) throws FileNotFoundException {
	dogs = new DogListCSV("Data/playforddogsOffSpring.csv");
	//dogs = new DogList("Data/dogsOffspringtest.csv");
		int choice = 0;
		sc = new Scanner(System.in);
		while (choice != 9) {
			sprog.printMenu();
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					dogs.printList(8);
					break;
				case 4:
					changeLanguage();
					break;
				default:
					choice = 9;
					break;
			}
		}
	}
	public static void changeLanguage() {
		sprog.printLang(); 
		int langchoice = sc.nextInt();
		switch(langchoice) {
			case 1: sprog = new Dansk();break;
			case 2: sprog = new Engelsk();break;
		}
	}
	
}
