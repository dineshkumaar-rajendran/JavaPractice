package MapCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsCollections {
	public static void main(String[] args) {
		Map<Character, Integer> hmap = new LinkedHashMap<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String name = scan.nextLine();
		name = name.toUpperCase();
		name = name.replace(" ", "");
		System.out.println(name);
		char c[] = name.toCharArray();
		int size = c.length;
		String temp = "";
		int maxVal = 0;
		char maxKey = ' ';

		for (int i = 0; i < size; i++) {
			if (hmap.containsKey(c[i]) == false) {
				hmap.put(c[i], 1);
			} else {
				int oldVal = hmap.get(c[i]);
				int newVal = oldVal + 1;
				hmap.put(c[i], newVal);
			}
		}

		for (Map.Entry<Character, Integer> data : hmap.entrySet()) {

			if (data.getValue() > maxVal) {
				maxVal = maxVal + data.getValue();
				maxKey = data.getKey();
			}
		}
		System.out.println("The max repeated characters are :" + maxKey+" and the value is "+maxVal);
	}
}
