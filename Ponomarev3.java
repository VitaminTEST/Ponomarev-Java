

public class Ponomarev3 {
   
	public static void main(String[] args) {
        
    	int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Четные числа:");
        for (int num : nums) {
            
        if (num % 2 == 0) {
        	System.out.println(num);
            }
        }
    }
}