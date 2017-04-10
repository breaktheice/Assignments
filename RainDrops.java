
public class RainDrops {

		public static void countRainDrops(int[] input){
			if(input == null || input.length == 0){
				System.out.print(" Chart empty");
				return;
			}
			int n = input.length; int max = 0;
			int arr[][] = new int[n][n];
			for(int i = 0 ; i < n ; i++){
				if(input[i] > max){
					max = input[i];
				}
			}
			
			for(int i = 0; i < n ; i++){
				for(int j = 0 ; j < n ; j++){
					if(input[j] - max == 0){
						arr[i][j] = 1;
						input[j] -= 1; 
					}
					else{
						arr[i][j] = 0;
					}
					System.out.print(" " + " " + arr[i][j]);
				}
				System.out.println();
				max -= 1;
			}
			int count1 = 0 ; 
			int count = 0; int maxcount = 0;
			boolean flag = false;
			for(int i = 0 ; i < n ; i++){
				for(int j = 0 ; j < n-1 ; j++){
			
					if(arr[i][j] > arr[i][j+1]){
						 flag = true;
						//count1 += 1;
					}
					if(arr[i][j] < arr[i][j+1] && flag == true){
						count += count1;
						count1 = 0;
						flag = false;
					}
					if(flag == true){
						count1 ++;
					}
					
					
					
				}
				count1 = 0;
     
				flag = false;
			}
			maxcount += count;
			System.out.print(" \n" + " " + maxcount);


			
		}
		public static void main(String[] args){
			int[] input = {3, 4,6,6,7, 2, 5,7};
			countRainDrops(input);
		}
}


