public class PatternMatcher {

	/*
	 * Checks if the provided string is a palindrome
	 * @param str the string to check
	 * @return true if str is a palindrome, false otherwise
	 */
	public static boolean isPalindrome(String str) {
		int i = 0;
		int length = str.length();
		str = str.toLowerCase();
		boolean palindrome = true;
		while (i < length) {
			if (str.charAt(i) == str.charAt(length - 1)) {
				i++;
				length--;
			} else {
				palindrome = false;
				break;
			}
		}
		return palindrome;
	}

	/*
	 * Checks if the provided string contains a vowel
	 * @param str string to check
	 * @return true if str has a vowel, false otherwise
	 */
	public static boolean containsVowel(String str) {
		int length = str.length();
		boolean hasVowel = false;
		for (int i = 0; i < length; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A'
					|| str.charAt(i) == 'e' || str.charAt(i) == 'E'
					|| str.charAt(i) == 'i' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'U') {
				hasVowel = true;
				break;
			}
		}
		return hasVowel;
	}

	/*
	 * Checks if the string is a vowel
	 * @param str is the character to check
	 * @return true if str is a vowel, false otherwise
	 */
	public static boolean isVowel(char str) {
		boolean checkVowel = false;
		if (str == 'a' || str == 'A'
				|| str == 'e' || str == 'E'
				|| str == 'i' || str == 'I'
				|| str == 'o' || str == 'O'
				|| str == 'u' || str == 'U') {
			checkVowel = true;
		}
		return checkVowel;
	}

	/*
	 * Checks if there are letters that are the same and beside each other
	 * @param str is the string to check
	 * @return true if str contains the repeated letters, false otherwise
	 */
	public static boolean containsRepeats(String str) {
		int length = str.length();
		str = str.toLowerCase();
		boolean hasRepeat = false;
		for (int i = 1; i < length; i++) {
			if (str.charAt(i - 1) == str.charAt(i)) {
				hasRepeat = true;
				break;
			}
		}
		return hasRepeat;
	}

	/*
	 * Takes a given input and changes all lowercase letters to uppercase and
	 * all uppercase letters to lowercase
	 * @param str is the string to 'swap'
	 * @return the input with lowercase and uppercase letters swapped
	 */
	public static String performSwap(String str) {
		String swapped = new String("");
		int length = str.length();
		for (int i = 0; i < length; i++) {
			char curr = str.charAt(i);
			String toSwap = Character.toString(curr);
			// changes current character to uppercase if lowercase, and vice versa
			if (Character.isLowerCase(curr)) {
				toSwap = toSwap.toUpperCase();
				swapped += toSwap;
			} else if (Character.isUpperCase(curr)) {
				toSwap = toSwap.toLowerCase();
				swapped += toSwap;
			} else {
				swapped += toSwap;
			}
		}
		return swapped;
	}
	
	/*
	 * main method
	 */
	public static void main(String[] args) {
		System.out.print("check if is palindrome: ");
		if (isPalindrome("racecar") == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		System.out.print("check if has a vowel: ");
		if (containsVowel("LUST") == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		System.out.print("check if is vowel: ");
		if (isVowel('a') == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		System.out.print("check if contains repeats: ");
		if (containsRepeats("seeeeeeed") == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		System.out.print("Swaps input: ");
		System.out.println(performSwap("helLO"));
	}
}
