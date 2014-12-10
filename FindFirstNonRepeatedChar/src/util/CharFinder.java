package util;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {
	
	private String s;
	
	private CharFinder(){}
	
	public CharFinder(String s){
		this();
		this.s = s;
	}
	
	public Character finadFirstNonRepeatedChar(){
		
		if(s == null || s.trim().isEmpty() ){
			return null;
		}
		
		Map<Character, Integer> charCounter = new HashMap<>();
		
		int slenght = s.length();
		for (int i = 0; i < slenght; i++) {
			Character ch = s.charAt(i);
			if(charCounter.containsKey(ch)){
				int count = charCounter.get(ch);
				charCounter.put(ch, ++count);
			}else{
				charCounter.put(ch, 1);
			}
		}
		
		for (int i = 0; i < slenght; i++) {
			Character ch = s.charAt(i);
			int count = charCounter.get(ch);
			if (count == 1) {
				return ch;
			}
		}
		
		return null;
	}
}
