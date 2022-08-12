package aamir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveElementsFromList {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			if (next == 1) {
				iterator.remove();
			}
		}
		arrayList.forEach(a-> System.out.println(a));
	}
}
