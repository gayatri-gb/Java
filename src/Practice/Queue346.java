package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class Queue346 {
    int currentWindowSize;
    Queue<Integer> queue=new LinkedList<>();
    double sum;
    public Queue346(int size){
        currentWindowSize=size;
        sum=0.0;


    }
    public double next(int val) {
        if (currentWindowSize == queue.size()) {
            sum -= queue.remove();

        }

        queue.add(val);
        sum += val;
        return sum / queue.size();
    }
        public static void main(String[] args) {
            Collections.Queue.Queue346 m= new Collections.Queue.Queue346(3);
            System.out.println(m.next(1)); //1
            System.out.println(m.next(10));//(1+10)/2
            System.out.println(m.next(3));//(1+10+3)/3
            System.out.println(m.next(5));//(10+3+5)/3



        }
    }