package codewarsMultipleOf3Or5;

public class MultipleOf3Or5 {
	
	public static int sumOfMultiples(int n) {
		int sumOfMultiples = 0;
		n--;
		while (n > 2) {
			if (n % 3 == 0 && n % 5 == 0) {
				sumOfMultiples += n;
			} else if (n % 3 == 0) {
				sumOfMultiples += n;
			} else if (n % 5 == 0) {
				sumOfMultiples += n;
			}
			n--;
		}
		return sumOfMultiples;
	}
	
}
