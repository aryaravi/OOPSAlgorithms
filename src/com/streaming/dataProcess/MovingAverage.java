package com.streaming.dataProcess;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
int windowsize;
Queue queue;
int sum;

public MovingAverage(int windowsize) {
this.windowsize = windowsize;
this.queue = new LinkedList();
this.sum = 0;
}

// finds moving average after inserting item n into data stream
private double findMovingAverage(int n) {
if (queue.size() > windowsize - 1) {
//sum = sum - queue.poll();
}
queue.offer(n);
sum = sum + n;
return (double) sum / queue.size();
}

public static void main(String[] args) {

int windowsize = 3;
MovingAverage m = new MovingAverage(windowsize);

for (int i = 1; i < 20; i++) {
System.out.println("After Adding " + i + " to the queue: {" + m.queue.toString() + "}; Average is: " + m.findMovingAverage(i));

}
}
}




