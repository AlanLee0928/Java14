package Class07;

import java.io.*;

public class Class07 {
	public static void main(String[] args) throws IOException {
		int a = 0;
		String b;
		FileReader f = new FileReader("D:\\eclipse\\物件導向\\Java14\\Class04\\donkey.txt");
		BufferedReader bu = new BufferedReader(f);
		while((b = bu.readLine()) != null) {
			if(a == 1) {
				bu.skip(14);
			}
			System.out.println(b);
			a++;
		}
		f.close();
	}
}