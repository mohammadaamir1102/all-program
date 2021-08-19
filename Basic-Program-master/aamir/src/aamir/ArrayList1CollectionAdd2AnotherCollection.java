package aamir;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1CollectionAdd2AnotherCollection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aamir");
		list.add("salman");
		list.add("imran");
		list.add("furqan");
		list.add("nurulislam");
		Collections.sort(list, Collections.reverseOrder());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
