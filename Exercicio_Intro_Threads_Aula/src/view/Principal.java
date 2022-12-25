package view;

import controller.ThreadBuffer;
import controller.ThreadString;

public class Principal {
	public static void main(String args[]) {

		ThreadBuffer tb = new ThreadBuffer();
		ThreadString ts = new ThreadString();

		long inicioTb = System.currentTimeMillis();
		tb.lacoBuffer();
		System.out.println("tempo Buffer ==> " + (System.currentTimeMillis() - inicioTb) + "ms");

		long inicioTs = System.currentTimeMillis();
		ts.lacoString();
		System.out.println("tempo String ==> " + (System.currentTimeMillis() - inicioTs) + "ms");

	}
}
