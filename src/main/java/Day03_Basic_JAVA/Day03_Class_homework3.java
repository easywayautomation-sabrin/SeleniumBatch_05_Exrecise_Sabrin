package Day03_Basic_JAVA;

public class Day03_Class_homework3 {
	public static void main(String[] args) {
		int n=7;
		boolean flag = false;
		
		for (int i = 0; i < 10; i++) {
			if(i==n) {
				flag = true;
				break;
			}
			
		}
		
		if (flag) {
			System.out.println("Data found");
			
		}else {
			System.out.println("Data not found");
		}
	}
}


