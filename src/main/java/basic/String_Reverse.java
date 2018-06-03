package basic;

public class String_Reverse {

	public static void main(String[] args) {
		String str = "ramesh";
		char[] arr = str.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
		String input = "Be in present";
		byte[] strAsByteArray = input.getBytes();
		byte[] result = new byte[strAsByteArray.length];

		for (int i = 0; i < strAsByteArray.length; i++) {
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];
		}
		System.out.println(new String(result));
	}

}
