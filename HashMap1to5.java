import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1to5 {

	public static void main(String[] args) {
		problem1();
		problem2();
		problem4();

		problem5();
		problem6();
		problem7();
		problem8();
		problem9();
		problem10();
	}

	// Write a program which takes input as 7 students and their score
	private static void problem1() {
		System.out.println("Problem 1");
		HashMap<String, Double> scores = new HashMap<>();

		scores.put("John", 87.5);
		scores.put("Jenny", 92.3);
		scores.put("mike", 75.5);
		scores.put("Smantha", 65.4);
		scores.put("eric", 82.2);
		scores.put("anthony", 77.0);
		scores.put("bob", 66.9);

	}

	// Write a program which takes input as first name and last name of 10 students.
	private static void problem2() {
		System.out.println("Problem 2");
		HashMap<String, String> names = new HashMap<>();
		names.put("John", "Smith");
		/*
		 * names.put(John, Smith); names.put(John, Smith); names.put(John, Smith);
		 * names.put(John, Smith); names.put(John, Smith); names.put(John, Smith);
		 * names.put(John, Smith); names.put(John, Smith); names.put(John, Smith);
		 */

	}

	// Write a program which takes input as 15 numbers and their occurrence and find
	// which
	// number appears the most.
	public static void problem4() {
		System.out.println("Problem 4");
		HashMap<Integer, Integer> count = new HashMap<>();
		int maxCount = 0;
		int max = 0;
		int[] a = { 12, 45, 25, 67, 98, 12, 45, 45, 67, 89, 45, 90, 45, 67, 45 };
		for (int i = 0; i < a.length; i++) {
			if (count.containsKey(a[i])) {
				int occurance = count.get(a[i]);
				occurance += 1;
				count.put(a[i], occurance);
				if (occurance > maxCount) {
					maxCount = occurance;
					max = a[i];
				}
			} else {
				count.put(a[i], 1);
				if (maxCount == 0) {
					maxCount = 1;
					max = a[i];
				}
			}

		}
		System.out.println(max + " " + maxCount);

	}
	// Write a program which takes input as 15 numbers and find which number appears
	// the least.

	public static void problem5() {
		System.out.println("Problem 5");
		HashMap<Integer, Integer> count = new HashMap<>();
		int minCount = Integer.MAX_VALUE;
		int minValue = 0;
		int[] a = { 12, 45, 25, 67, 98, 12, 45, 45, 67, 12, 45, 98, 45, 67, 45 };
		for (int i = 0; i < a.length; i++) {
			if (count.containsKey(a[i])) {
				int occurance = count.get(a[i]);
				occurance += 1;
				count.put(a[i], occurance);
			} else {
				count.put(a[i], 1);
			}

		}
		for (Integer key : count.keySet()) {
			int value = count.get(key);
			if (value < minCount) {
				minCount = value;
				minValue = key;
			}
		}
		System.out.println(minValue + " " + minCount);

	}
	// Write a program which takes input as 15 numbers and find which number appears
	// even number of times.

	public static void problem6() {
		System.out.println("Problem 6");
		HashMap<Integer, Integer> count = new HashMap<>();

		int[] a = { 12, 45, 25, 67, 98, 12, 45, 45, 67, 89, 45, 90, 45, 67, 45 };
		for (int i = 0; i < a.length; i++) {
			if (count.containsKey(a[i])) {
				int occurance = count.get(a[i]);
				occurance += 1;
				count.put(a[i], occurance);

			} else {
				count.put(a[i], 1);
			}
		}

		for (Integer key : count.keySet()) {
			// find even number

			int value = count.get(key);
			if (value % 2 == 0) {
				System.out.println(key + " " + value);
			}

		}
	}

	// Write a program which takes input as 15 numbers and find which number appears
	// odd number of times.

	public static void problem7() {
		System.out.println("Problem 7");
		HashMap<Integer, Integer> count = new HashMap<>();

		int[] a = { 12, 45, 25, 67, 98, 12, 45, 45, 67, 89, 45, 90, 45, 67, 45 };
		for (int i = 0; i < a.length; i++) {
			if (count.containsKey(a[i])) {
				int occurance = count.get(a[i]);
				occurance += 1;
				count.put(a[i], occurance);

			} else {
				count.put(a[i], 1);
			}
		}

		for (Integer key : count.keySet()) {
			// find odd number
			int value = count.get(key);
			if (value % 2 != 0) {
				System.out.println(key + " " + value);
			}

		}
	}

	// Write a program which takes input as 15 numbers and find which number appears
	// only 3 times.
	public static void problem8() {
		System.out.println("Problem 8");
		HashMap<Integer, Integer> count = new HashMap<>();

		int[] a = { 12, 45, 25, 67, 98, 12, 45, 45, 67, 89, 12, 45, 90, 45, 67, 45 };
		for (int i = 0; i < a.length; i++) {
			if (count.containsKey(a[i])) {
				int occurance = count.get(a[i]);
				occurance += 1;
				count.put(a[i], occurance);

			} else {
				count.put(a[i], 1);
			}
		}

		for (Integer key : count.keySet()) {
			// find odd number
			int value = count.get(key);
			if (value == 3) {
				System.out.println(key + " " + value);
			}

		}
		// Write a program which takes input as aaaaabbbbccccccc and out put as a5b4c6.

	}

	public static void problem9() {
		System.out.println("Problem 9");
		char[] x = "aaaaabbbbcccccc".toCharArray();
		int count = 0;
		String result = "";
		char previous = Character.MIN_VALUE;

		for (int i = 0; i < x.length; i++) {
			char current = x[i];
			if (previous == Character.MIN_VALUE || previous == current) {
				count++;
			} else {
				result += previous + "" + count;
				count = 1;
			}

			previous = current;
		}
		result += previous + "" + count;
		System.out.println(result);

	}

	// Write a java program which takes two input as s1 = “Satin”, s2= “Stain" Find
	// strings are anagram.
	public static void problem10() {
		System.out.println("Problem 10");
		HashMap<Character, Integer> map = new HashMap<>();

		String s1 = "Satins".toLowerCase();
		String s2 = "Stains".toLowerCase();

		for (int i = 0; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i))) {
				int occurance = map.get(s1.charAt(i));
				occurance += 1;
				map.put(s1.charAt(i), occurance);

			} else {
				map.put(s1.charAt(i), 1);
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			if (map.containsKey(s2.charAt(i))) {
				int occurance = map.get(s2.charAt(i));
				if (occurance == 1) {
					map.remove(s2.charAt(i));

				} else {
					occurance -= 1;
					map.put(s2.charAt(i), occurance);
				}
			} else {
				System.out.println(" Not an anagram");
				return;
			}

		}
		if (!map.isEmpty()) {
			System.out.println("Not an anagram");
		} else {

			System.out.println("An anagram");
		}

	}
}
