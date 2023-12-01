public class Main {
	public static void main(String[] args) {
		try {
			System.out.println(checkNumb(20, null));
		} catch (NullPointerException e){
			System.out.println(e);
		}
	}

	public static int checkNumb(Integer numerator, Integer denominator) {
		if (numerator != null || denominator != null) {
			return numerator / denominator;
		} else {
			throw new NullPointerException();
		}
	}
}