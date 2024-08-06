package test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

//Creating a custom iterator which returns only palindrom string
public class CustomIterator implements Iterator<String>{
	
	private String nextPalindrom= null;
	private List<String> list;
	private int currIndex=0;
	
	public CustomIterator(List<String> list) {
		this.list=list;
		findNextPalindrom();
	}
	
	private void findNextPalindrom() {
		nextPalindrom= null;
		while(currIndex<list.size()) {
			String currString = list.get(currIndex);
			if(isPalindrom(currString)) {
				nextPalindrom = currString;
				break;
			}
			currIndex++;
		}
	}
	
	private boolean isPalindrom(String s) {
//		StringBuilder sb= new StringBuilder(s);
//		sb.reverse();
//		
//		if(s.equals(sb.toString()))
//			return true;
//		
//		return false;
		
		int left = 0;
		int right= s.length()-1;
		
		while(left<right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	@Override
	public boolean hasNext() {
		return nextPalindrom !=null;
	}

	@Override
	public String next() {
		if(nextPalindrom == null) {
			throw new NoSuchElementException();
		}
		String result = nextPalindrom;
		currIndex++;
		findNextPalindrom();
		return result;
	}
	
	public static void main(String[] args) {
		List<String> list= Arrays.asList("test","mom","run","madam");
		CustomIterator iterator= new CustomIterator(list);
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}


}
