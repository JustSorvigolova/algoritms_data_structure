
import java.util.Deque;
import java.util.LinkedList;

public class eee {
    public static void main(String[] args) {
        peek(5);
        peek(4);


    }
    public static Deque<Integer> peek(int item){
        Deque<Integer> deque = new LinkedList<>();
            deque.push(item);
        System.out.println(deque);
        return deque;
    }

}
