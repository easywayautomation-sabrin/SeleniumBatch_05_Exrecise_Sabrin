package Day03_Basic_JAVA;

public class Day03_class_homework_06 {
	public static void main(String[] args) {
		int [] A= {1, 3, 5, 5, 6};
		int i = 0;
		int finalValue=0;
		for (i = 0; i < A.length; i++) {
			if (A[i]==3 || A[i]==5) {
				finalValue=A[i];
				continue;
			}
			
		}
		System.out.println(finalValue);
		
	}

}
