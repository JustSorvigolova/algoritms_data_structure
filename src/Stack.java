public class Stack {

    int[] stack = new int[5];

    int t = 0;

    public void Enqeue(int data){
        stack[t] = data; // 0 => 5 1=> 2
        t++; //

    }
    public void shows(){

        for(int i=0;i<stack.length;i++){
            System.out.print(stack[i]+ " ");
        }

    }
    public int Deqeue(){
        t--; //
        int  data = stack[t];
        stack[t] = 0;
        return data;
    }
    public boolean isEmpty(){

        return stack.length == 0;
    }



}
