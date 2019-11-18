/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package sprogskift;

import java.util.Scanner;

/**
 *
 * @author thor
 */
public class SprogSkift {
	
	/**
	 * @param args the command line arguments
	 */
        public static SprogI sprog = new Dansk();
	
	static Scanner sc;
	public static void main(String[] args) {
		int choice = 0;
		sc = new Scanner(System.in);
		sprog = new Dansk();
		while (choice != 9) {
                    sprog.printMenu();
			choice = sc.nextInt();
			switch(choice) {
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
                        case 3: sprog = new DanskEngelsk();break;
		}
		
	}
	
}
