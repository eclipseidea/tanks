package writer_reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tanks_Main {
 static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		ReadFromTxt readFromTxt = new ReadFromTxt();
		WriteToTxt writeToTxt = new WriteToTxt();
	    Tanks tanks = new Tanks();
		ClearCollections clearCollections = new ClearCollections();
		Find_Rwmove Find_Rwmove = new Find_Rwmove();
		ToShowData toShowData = new ToShowData(); 
		ChangeId changeId = new ChangeId();
		File file = new File("text.txt");
		List<Tanks> fromTxt = new ArrayList<Tanks>();
		while(true){
		   System.out.println("press 1 to show data");
           System.out.println("press 2 to find by id number");
           System.out.println("press 3 to remove by id number");
           System.out.println("press 4 to add new into data");
           System.out.println("press 5 to change id");
           System.out.println("press 6 to exit");
           String choice =Tanks_Main.scanner.next(); 
              switch(choice){
                 case"1":
                	 clearCollections.clearCollectionfromTxt(fromTxt);
                	 readFromTxt.readTxt(file, fromTxt);
                	 toShowData.toShowData(fromTxt);
                	 break;
                 case"2":
                	 clearCollections.clearCollectionfromTxt(fromTxt);
                	 readFromTxt.readTxt(file, fromTxt);
                	 Find_Rwmove.findByIdNumber(file, fromTxt);
                	 break;
                 case"3":
                	 clearCollections.clearCollectionfromTxt(fromTxt);
                	 readFromTxt.readTxt(file, fromTxt);
                	 Find_Rwmove.removeByIdNumber(fromTxt);
               	     writeToTxt.writeText(fromTxt, file);
                	 break;
                 case"4":
                	 clearCollections.clearCollectionfromTxt(fromTxt);
                	 tanks.createTank(fromTxt);
                	 readFromTxt.readTxt(file, fromTxt);
                	 writeToTxt.writeText(fromTxt, file);
                	 break;
                 case"5":
                	 clearCollections.clearCollectionfromTxt(fromTxt);	
                	 readFromTxt.readTxt(file, fromTxt);
                	 changeId.searchChangeId(fromTxt);
                	 writeToTxt.writeText(fromTxt, file);
                	 break;
                 case"6":
                 	System.exit(5);
 	             break;
		  }
		}
	}
}
