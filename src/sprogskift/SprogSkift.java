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
         static Dansk sprog;
         static Scanner myScan;
	public static void main(String[] args) {
            
                sprog = new Dansk();
                
		sprog.printMenu();
                int choice = 0;
                myScan = new Scanner(System.in);
                while (choice != 9){
                    choice = myScan.nextInt();
                    switch(choice){
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
        public static void changeLanguage(){
           sprog.printLang();
           int langChoice = myScan.nextInt();
           if (langChoice == 1){
               sprog = new Dansk();
           } else if (langChoice == 2){
               sprog = new Engelsk();
           }
        }
	
}
