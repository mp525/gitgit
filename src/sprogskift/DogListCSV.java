package sprogskift;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;


public class DogListCSV implements DogListI {
	ArrayList<Dog> dogList;

	public DogListCSV(String filename) throws FileNotFoundException {
		dogList = dogList(filename);
	}
	
	@Override
	public ArrayList<Dog> dogList (String filename) throws FileNotFoundException {
		dogList = new ArrayList<>();
                DogLinkedList dogList2 = new DogLinkedList();
		String line = "";
		File fh = new File(filename);
		Scanner myScanner = new Scanner(fh);
		myScanner.nextLine();
                long startTime = System.currentTimeMillis();
		while (myScanner.hasNextLine()) {
			line = myScanner.nextLine();
			String[] myArr = line.split(",");
			Dog tmpDog = new Dog(Integer.parseInt(myArr[0]),myArr[1],myArr[2],myArr[3],myArr[4],myArr[5]);
			dogList2.add(tmpDog);
		}
                long stopTime = System.currentTimeMillis();
                System.out.println("Tid: " + (stopTime - startTime));
		return dogList;
	}

	public void printList(int numofdogs) {
		for (int i = 0;i<numofdogs;i++) {
			System.out.println(dogList.get(i));
		}
	}
}
