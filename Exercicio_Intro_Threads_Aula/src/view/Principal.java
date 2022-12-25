package view;

import controller.ThreadBuffer;
import controller.ThreadString;

public class Principal {
	public static void main(String args[]) {

		ThreadBuffer tb = new ThreadBuffer();
		ThreadString ts = new ThreadString();

		tb.run();
		ts.run();

	}
}
