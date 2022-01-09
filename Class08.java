package Class08;

import java.io.*;

public class Class08 {
	public static void main(String[] args) throws IOException {
		FileReader f1 = new FileReader("D:\\eclipse\\物件導向\\Java14\\Class08\\aaa.txt");
		FileReader f2 = new FileReader("D:\\eclipse\\物件導向\\Java14\\Class08\\bbb.txt");
		FileWriter f3 = new FileWriter("D:\\\\eclipse\\\\物件導向\\\\Java14\\\\Class08\\\\ccc.txt");
		BufferedReader b1 = new BufferedReader(f1);
		BufferedReader b2 = new BufferedReader(f2);
		BufferedWriter b3 = new BufferedWriter(f3);
		String a;
		while((a = b1.readLine())!=null) {
			b3.write(a);
			b3.newLine();
		}
		
		while((a = b2.readLine())!=null) {
			b3.write(a);
			b3.newLine();
		}
		b3.flush();
		f1.close();
		f2.close();
		f3.close();
	}
}
