import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
            int [][] mat = {{1,2,3},{4,5,6,5,6}};
            Lines(mat);
       }
       //
    public static void Lines(int[][]ll){
        for(int i =0; i<ll.length; i++){
            for (int j=0; j<ll[i].length; j++){
                System.out.print(ll[i][j]);
            }
        }
    }
}


