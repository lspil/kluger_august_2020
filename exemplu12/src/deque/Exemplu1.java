package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Exemplu1 {

  public static void main(String[] args) {
    // stacks & queues

    /**
     * FIFO   3 4 4 1 2 3 queue
     *
     * LIFO   8 6 5 4 3 stack
     */

    Deque<Integer> stack = new ArrayDeque<>();

    stack.push(10); // adauga un element la inceputul colectiei
    stack.pop(); // elimina un element de la inceputul colectiei

    Deque<Integer> queue = new ArrayDeque<>();

    queue.offer(10); // adauga un element la finalul colectiei
    queue.pop(); // elimina un element de la inceputul colectiei
  }
}
