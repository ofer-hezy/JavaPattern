package practice;

import java.util.List;

public class Ab {
	public Ab(List<String> list) { 
		// can't change a.list by doing this
			// Aa a = new Aa();
			// a.list.add("second");
		// but can change when i have a reference to it
		if (list != null) { // list is from a.list
			list.add("second");
		}

	}
}
