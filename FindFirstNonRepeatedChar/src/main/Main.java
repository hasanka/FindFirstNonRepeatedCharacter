package main;

import util.CharFinder;

public class Main {

	public static void main(String[] args) {
		CharFinder f = new CharFinder("stress");
		Character c = f.finadFirstNonRepeatedChar();
		System.out.println("First Non Repeated Char ["+c+"]");
	}

}
