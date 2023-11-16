package classTest;

class ClassTask4 {
	Result getMaxAndMin(int[] arData) {
		Result result = new Result(arData[0], arData[0]);

		for (int i = 0; i < arData.length; i++) {
			if (result.max < arData[i]) {
				result.max = arData[i];
			}
			if (result.min > arData[i]) {
				result.min = arData[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		int[] arData = { 1, 300, 200, 13, 5 };

		Result result = new ClassTask4().getMaxAndMin(arData);
		System.out.println(result.max + " " + result.min);
	}
}