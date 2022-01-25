
public class lll {
    public static void main(String[] args) {
        int lol[] = {5, 4, 6};


        print(lol);
    }


    public static void disect(int[] arr) {
        int i = arr.length;
        while (i >= 0) {
            i = i / 2;
            System.out.println(i);
        }
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Current element is: " + arr[i]);
        }
    }
    public Boolean contains(Stack stack) {
        return stack.isEmpty();
    }


}
