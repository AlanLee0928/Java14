package Class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class03 {
	public static void main(String[] args) throws IOException {
		String a;
		int b;
		int c = 0;
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
		a = bu.readLine();
		b = Integer.parseInt(a);
		for(int i = 1 ; i <= b ; i++) {
			c = c + i;
		}
		System.out.println(c);
	}
}