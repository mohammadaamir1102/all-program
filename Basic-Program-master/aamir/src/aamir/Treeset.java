package aamir;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<Integer> list=new TreeSet<Integer>();
		list.add(18);
		list.add(21);
		list.add(40);
		list.add(45);
		list.add(23);
		Iterator<Integer>itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
