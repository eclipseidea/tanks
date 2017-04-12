package writer_reader;

import java.util.List;

public class ToShowData {
	
	public void toShowData(List<Tanks> fromTxt) {
		if (fromTxt.size() == 0) {
			System.out.println("EMPTY");
		} else {
			for (Tanks tanks : fromTxt) {
				System.out.println(tanks);
			}
		}
	}
}
