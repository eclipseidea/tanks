package writer_reader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class WriteToTxt {
	
	public void writeText(List<Tanks> fromTxt,File file) throws IOException {
		PrintWriter writer = new PrintWriter(new BufferedWriter(
				new FileWriter(file)));
		try {
			for (Tanks t:fromTxt) {
				writer.write(t.toString() + "\n");
				writer.flush();
			   }
			writer.close();
		}finally{
			writer.close();
		}
	}
}
