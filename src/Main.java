import java.util.LinkedList;
//             3.
public class Main {
    public static void main(String[] args) {
        int [][] matrix = {{10,9,11,3},{4,5,8,9},{1,2,4,7}};
        Lines(matrix);
    }
    public static void Lines(int[][]ll){
        for(int i =0; i<ll.length; i++){
            for (int j=0; j<ll[i].length; j++){
                LinkedList<int[]> listen = new LinkedList<>();
                listen.add(ll[i]);
                System.out.println(listen);
            }
        }
    }
}