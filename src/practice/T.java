package practice;

import java.util.HashMap;

public class T {

	public static void main(String[] args) {
		String str = "hello";
		StringBuffer sb = new StringBuffer();
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());
		sb = new StringBuffer(str);
		System.out.println(sb.reverse().toString());

		String line = "this line have some duplicate words like apple apple apple line this ";
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		String all[] = line.split(" ");
		for (int i = 0; i < all.length; i++) {
			if (words.containsKey(all[i])) {
				Integer ii = words.get(all[i]);
				words.put(all[i], ++ii);
			} else {
				words.put(all[i], new Integer(1));
			}
		}
		words.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
		int arr[] = { 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		int f = arr[0];
		int s = arr[0];
		for (int i = 1; i < arr.length; i++) {
			// System.out.println(arr[i]+ " ,"+f+" ,"+s);
			if (arr[i] > f) {
				s = f;
				f = arr[i];

			} else {
				if (arr[i] > s && arr[i] < f) {
					s = arr[i];
				}
			}
		}
		System.out.println();
		System.out.println("second: " + s);
		
		line = "String after removing white space	between words and everywher";
		System.out.println(line.replaceAll("\\s", ""));
		
		System.out.println(line.compareTo(line));
		
		char[] ch = line.toCharArray();
		len = ch.length;
		StringBuilder builder = new StringBuilder();
		for (int i=len-1;i>=0;i--) {
			builder.append(ch[i]);
		}
		System.out.println(builder.toString());
		
		
	}
	



}
