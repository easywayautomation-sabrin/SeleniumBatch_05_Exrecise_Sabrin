package Day03_Basic_JAVA;

public class Day03_class_homework_07 {
	public static void main(String[] args) {
		int [] A = {4,2,5,7,8,9,5};
		
		int n = 7;
		boolean flag = false;
		
		for(int i =0; i < A.length; i++) {
			if(A[i]== n) {
				flag = true;
				break;
			}
		}
	if (flag) {
		System.out.println("data found");
		
	} else {
		System.out.println("data not found");

	}
	}
	

}
