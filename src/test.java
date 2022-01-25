public class test {
    public static void main(String[] args) {
    }
        private static boolean twoSum(int[][] mat, int tar) {
            int a = 0;
            int[] first = new int[mat.length*mat[0].length];

            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[0].length; j++){
                    first[a] = mat[i][j];
                    a++;
                }
            }for(int i = first.length - 1; i >= 0; i--){
                for(int j = i-1; j >= 0; j--){
                    int sum = first[i] + first[j];
                    System.out.print(sum + ", ");
                    if(sum == tar){
                        return true;
                    }
                }System.out.println();
            } return false;
        }

    }

