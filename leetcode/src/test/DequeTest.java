import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> integerArrayDeque = new ArrayDeque<>(2);
        integerArrayDeque.addLast(2);
        System.out.println(integerArrayDeque.size());
        integerArrayDeque.addLast(3);
        System.out.println(integerArrayDeque.size());
        integerArrayDeque.addLast(4);
        System.out.println(integerArrayDeque.size());
        System.out.println(integerArrayDeque);
    }




}
