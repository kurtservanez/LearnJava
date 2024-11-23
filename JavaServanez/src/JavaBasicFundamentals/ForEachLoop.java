package JavaBasicFundamentals;

public class ForEachLoop {
	public static void main(String[] args) {
		
		int sum = 0;
		int nums[]= {1,2,3,4,5,6,7,8,9,0};
		
		for (int x : nums) {
			
			sum += x;
			
		}
		
		System.out.println("The sum of the numbers is: " + sum);
	}

}
