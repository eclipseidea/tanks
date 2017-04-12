package writer_reader;

import java.util.Collections;
import java.util.List;

public class ChangeId {
    
	public void searchChangeId(List<Tanks> fromTxt){
    	Tanks tank = null;
		boolean search = false;
		boolean searchId = false;
		System.out.println("input id");
		int id = Tanks_Main.scanner.nextInt();
		for (Tanks tanks : fromTxt) {
			if(id==tanks.getId()){
				tank = tanks;
				search = true;
			} 
		}
       if(search){
    	   System.out.println("input id to change"); 
    	   id = Tanks_Main.scanner.nextInt();
             for (Tanks tanks : fromTxt) {
            	 if(tanks.getId()==id){
            		 searchId = true;
            	 }
			 }
       if(searchId){
    	   System.out.println("id already taken");
       }
       else if(!searchId){
    	   tank.setId(id);
       }
       }
       else{
    	   System.out.println("id did not exist");
       }
       Collections.sort(fromTxt, new SortById()); 
	}
}
