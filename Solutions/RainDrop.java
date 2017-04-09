/**
 Trapping Rain Water
 Given n non-negative integers representing an elevation map where the width of each bar is 1,
 compute how much water it is able to trap after raining.
 Input: arr[]   = {3, 0, 0, 2, 0, 4}
 Output: 10
 */
public class RainDrop {

    public static int countDrops(int[] a) {
        int left, right;
        if (a == null || a.length <= 2) {
            return 0;
        }
        left = 0;
        right = a.length - 1;
        int sum = 0, i = 0;
        int leftMax = 0, rightMax = 0;
        while(left <= right){
            leftMax = Math.max(leftMax, a[left]);
            rightMax = Math.max(rightMax, a[right]);
            if(leftMax < rightMax){
                sum += (leftMax - a[left]);
                left++;
            } else{
                sum += (rightMax - a[right]);
                right--;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int[] a = {5,1,3,4,2,1};
        System.out.println(countDrops(a));
    }
}
