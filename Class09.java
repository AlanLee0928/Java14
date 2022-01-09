package Class09;

import java.io.*;

public class Class09 {
	public static void main(String[] args) throws IOException {
		FileReader f1 = new FileReader("D:\\eclipse\\物件導向\\Java14\\Class08\\aaa.txt");
		FileReader f2 = new FileReader("D:\\eclipse\\物件導向\\Java14\\Class08\\bbb.txt");
		FileReader f3 = new FileReader("D:\\\\eclipse\\\\物件導向\\\\Java14\\\\Class08\\\\ccc.txt");
		BufferedReader b1 = new BufferedReader(f1);
		BufferedReader b2 = new BufferedReader(f2);
		BufferedReader b3 = new BufferedReader(f3);
		String a;
		System.out.println("aaa.txt");
		while((a = b1.readLine()) != null) {
			System.out.println(a);
		}
		System.out.println("\nbbb.txt");
		while((a = b2.readLine()) != null) {
			System.out.println(a);
		}
		System.out.println("\nccc.txt");
		while((a = b3.readLine()) != null) {
			System.out.println(a);
		}
		f1.close();
		f2.close();
		f3.close();
	}
}