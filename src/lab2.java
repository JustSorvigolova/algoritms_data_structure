public class lab2 {
    public static void main(String[] args) {
        int[][] matrix = {{6,5,3},{1,7,3},{6,3,9}};
        int target = 16;
        System.out.println(twoSum(matrix, target));
    }
    private static boolean twoSum(int[][] mat, int targ) {
        int a = 0;
        int[] b = new int[mat.length*mat[0].length];

        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                b[a] = ints[j];
                a++;
            }
        }
        for(int i = b.length - 1; i >= 0; i--){
            for(int j = i-1; j >= 0; j--){
                int sum = b[i] + b[j];
                System.out.print("Sum : "+sum);
                if(sum == targ){
                    return true;
                }
            }
        } return false;
    }
}