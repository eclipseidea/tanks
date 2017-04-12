package writer_reader;

import java.util.Comparator;

public class SortById implements Comparator<Tanks> {

	@Override
	public int compare(Tanks o1, Tanks o2) {
		return o1.getId()-o2.getId();
	}
}


