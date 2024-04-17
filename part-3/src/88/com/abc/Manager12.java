package com.abc;  import java.util.PriorityQueue;
class Manager12{
        public static void main(String[] args){
                PriorityQueue queue = new PriorityQueue(10, new C());
                queue.add(new B(1,2));  queue.add(new B(10,0));
                queue.add(new B(5,8));  queue.add(new B(0,10));
                queue.add(new B(2,5)); queue.add(new B(8,6));

                System.out.println(queue); System.out.println(queue.poll());
                System.out.println(queue); System.out.println(queue.poll());
                System.out.println(queue); System.out.println(queue.poll());
                System.out.println(queue); System.out.println("-----");

                PriorityQueue queue2 = new PriorityQueue(10, new D());
                queue2.add(new B(1,2));  queue2.add(new B(10,0));
                queue2.add(new B(5,8));  queue2.add(new B(0,10));
                queue2.add(new B(2,5));  queue2.add(new B(8,6));

                System.out.println(queue2); System.out.println(queue2.poll());
                System.out.println(queue2); System.out.println(queue2.poll());
                System.out.println(queue2); System.out.println(queue2.poll());
                System.out.println(queue2); System.out.println("-----");


        }
}
