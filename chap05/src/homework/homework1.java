package homework;

public class homework1 {
	public static void main(String[] args) {
		// 1. 키 순서대로 앉으세요
		int[] height = {152, 180, 165, 158, 171};
		
		for (int i = 0; i < height.length; i++) {
			for (int j = 0; j < height.length-1-i; j ++) {
				if (height[j] > height[j+1]) {
					int tmp = height[j];
					height[j] = height[j+1];
					height[j+1] = tmp;
				}
			}
			System.out.println(height[i]);
		}
	}

}
