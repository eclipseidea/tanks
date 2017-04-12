package writer_reader;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class Find_Rwmove {
	public void findByIdNumber(File file, List<Tanks> fromTxt) {
		System.out.println("input id");
		boolean search = false;
		int id = Tanks_Main.scanner.nextInt();
		for (Object tanks : fromTxt) {
			if (id == ((Tanks) tanks).getId()) {
				System.out.println(tanks);
				search = true;
			}
		}
		if (!search) {
			System.out.println("id did not exist");
		}
	}

	public void removeByIdNumber(List<Tanks> fromTxt) {
		boolean search = false;
		System.out.println("input id");
		int id = Tanks_Main.scanner.nextInt();
		Iterator<Tanks> iterator = fromTxt.iterator();
		while (iterator.hasNext()) {
			Tanks o = iterator.next();
			if (id == (o.getId())){
				iterator.remove();
				search = true;
			}
		}
	  if(!search){
		  System.out.println("id does not exist");
	  }else if(search){
		  System.out.println("deleted tank with id  " + id);
	  }
	}
}
