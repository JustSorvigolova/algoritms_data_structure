public class Queue {
    int[] queue = new int[5];
   int s; // размер
    int front; // передний
     int r;  // задний

    public void Enqeue(int data){
        queue[r] = data; // 0 5
        r++; //1
        s++;

        System.out.println(s);
    }
    public void shows(){
        for (int i=0;i<s;i++){
            System.out.print(queue[i] + ",");
        }
    }
    public void Deqeue() {
        int data = queue[front];
        if (!isEmpty()) {
            front = (front ++) % 5;
            s--;
        } else System.out.print("Empty");
    }
    public boolean isEmpty(){
        return s == 0;
    }
}
