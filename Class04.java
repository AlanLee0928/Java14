package Class04;

import java.io.*;

public class Class04 {
	public static void main(String[] args) throws IOException {
		char a [] = new char[128];
		FileReader f = new FileReader("D:\\eclipse\\����ɦV\\Java14\\Class04\\donkey.txt");
		
		int b = f.read(a);
		String c = new String(a , 0 , b);
		System.out.println("Characters read= " + b);
		System.out.println(c);
		f.close();
	}
}
//����b�{���̭��]��O�r��