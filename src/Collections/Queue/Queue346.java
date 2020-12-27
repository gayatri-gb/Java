package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

//Moving Average from Data Stream
public class Queue346 {

        double sum;
        int currentWindowSize;
    Queue<Integer> queue= new LinkedList<>();
        public Queue346(int size) {
            currentWindowSize=size;
            sum=0;

        }

        public double next(int val) {
            if(queue.size()==currentWindowSize) {
                sum-=queue.remove();
            }
            queue.add(val);
            sum+=val;
            return sum/queue.size();
        }



    public static void main(String[] args) {
        Queue346 m= new Queue346(3);
        System.out.println(m.next(1)); //1
        System.out.println(m.next(10));//(1+10)/2
        System.out.println(m.next(3));//(1+10+3)/3
        System.out.println(m.next(5));//(10+3+5)/3



    }
}
