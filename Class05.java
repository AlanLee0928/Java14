package Class05;

import java.io.*;

public class Class05 {
	public static void main(String[] args) throws IOException {
		char a [] = new char[128];
		FileReader f = new FileReader("D:\\eclipse\\物件導向\\Java14\\Class04\\donkey.txt");

		f.skip(9);
		int b = f.read(a);
		String c = new String(a , 0 , b);
		System.out.println("Characters read= " + b);
		System.out.println(c);
		f.close();
	}
}