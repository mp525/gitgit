package sprogskift;

import java.util.Scanner;
public class SprogSkift {
	//static Dansk sprog;
	public static SprogI sprog = new Dansk();
	public static DogListI dogs;
        
	
	static Scanner sc;
	public static void main(String[] args) {
		int choice = 0;
		sc = new Scanner(System.in);
		while (choice != 9) {
			sprog.printMenu();
			choice = sc.nextInt();
			switch(choice) {
                            case 1:
					dogs.printList();
					break;
				case 4:
					changeLanguage();
					break;
				default:
					choice = 9;
					break;
			}
		}
		// print en menu
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
