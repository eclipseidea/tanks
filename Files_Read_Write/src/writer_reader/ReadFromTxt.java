package writer_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFromTxt {

	public void readTxt(File file, List<Tanks> fromTxt) throws IOException {
		String tmp = "";
		FileReader fileReader;
		fileReader = new FileReader(file);
		BufferedReader buffer = new BufferedReader(fileReader);
		try {
			while ((tmp = buffer.readLine()) != null) {
				Tanks tanks = new Tanks(Integer.parseInt(tmp.substring(1, 12)
						.replaceAll("\\D+", " ").trim()), tmp.substring(13, 23)
						.replaceAll("[^A-Z]", " ").trim(), tmp
						.substring(22, 40).replaceAll("[^A-Z]", " ").trim(),
						Integer.parseInt(tmp.substring(40, 50)
								.replaceAll("[\\D+]", " ").trim()),
						Integer.parseInt(tmp.substring(50, tmp.length())
								.replaceAll("[\\D+]", " ").trim()));
				fromTxt.add(tanks);
			}
		} catch (NumberFormatException | IOException e) {
		} catch (StringIndexOutOfBoundsException e) {
		}finally{
			buffer.close();	
		}
		buffer.close();
		Iterator<Tanks> iter = fromTxt.iterator();
		while (iter.hasNext()) {
			Tanks t = iter.next();
			Iterator<Tanks> iterator = fromTxt.iterator();
			while (iter.hasNext()) {
				Tanks tan = iter.next();
				if (t.getId() == tan.getId()) {
					iter.remove();
				}
			}
		  }
		Collections.sort(fromTxt, new SortById());  
	}
}
