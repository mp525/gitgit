/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprogskift;

/**
 *
 * @author thor
 */
public class DanskEngelsk implements SprogI{

	public void printMenu() {
		System.out.println("Velkommen til hundeuddelingen");
		System.out.println("1) show dogs");
		System.out.println("2) vælg hund");
		System.out.println("3) search dog by name");
		System.out.println("4) skift sprog");
		System.out.println("9) exit program");
		System.out.println("Indstast valg: ");
	}
	public void printLang() {
		System.out.println("Change language: ");
		System.out.println("1) Dansk");
		System.out.println("2) Engish");
                System.out.println("3) DanskEngelsk");
	}
	
}
