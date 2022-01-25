
public class Problems_1 {
    public static void main(String[] args) {
        int matrix [] [] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        Problems_1 o = new Problems_1();
        o.algoritms(matrix, target);
    }
     public void algoritms(int [][] data, int b){
        for(int i = 1; i < data.length; i++){
            for(int j = i; j > 0 && less(data[j], data[j-1]); j--){
                swap(data, j, j-1);


            }

        }

    }

    private boolean less(int[] datum, int[] datum1) {
        return true;
    }


    private static void swap(int[][] a, int min, int i) {
        int[] temp = a[i];
        a[i] = a[min];
        a[min] = temp;

    }
}
