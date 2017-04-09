/**
 *              5
 *          4       6
 *      1               8
 *                          9
 */
public class TreeMinElement {
    private static int minimum(TreeNode node){
        // base case
        if(node == null){
            return Integer.MAX_VALUE;
        }else{
            return( Math.min(Math.min(minimum(node.left), minimum(node.right)), node.data));
        }
    }
    private static int maximum(TreeNode node){
        // base case
        if(node == null){
            return Integer.MIN_VALUE;
        }else{
            return( Math.max(Math.max(maximum(node.left), maximum(node.right)), node.data));
        }
    }

    public static void main(String args[]){
        TreeNode a5 = new TreeNode(5);
        TreeNode a4 = new TreeNode(4);
        TreeNode a1 = new TreeNode(1);
        TreeNode a6 = new TreeNode(6);

        TreeNode a8 = new TreeNode(8);
        TreeNode a9 = new TreeNode(9);

        a5.left = a4;
        a4.left = a1;
        a5.right = a6;
        a6.right = a8;
        a8.left  = a9;

        int min = minimum(a5);
        System.out.println("Height : " + min);

        int max = maximum(a5);
        System.out.println("Height : " + max);
    }

}
