import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * Copyright (c) Anton on 21.02.2019.
 */
public class Test extends TestCase {

    public  void testAdd100kArrayList() {
        System.out.println("Add 100k elements to ArrayList: ");
        ArrayList<Integer> arrayList = new ArrayList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }

    public  void testAdd100kLinkedList() {
        System.out.println("Add 100k elements to LinkedList: ");
        LinkedList<Integer> linkedList = new LinkedList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }

    public  void testAdd1mArrayList() {
        System.out.println("Add 1 million elements to ArrayList: ");
        ArrayList<Integer> arrayList = new ArrayList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }

    public  void testAdd1mLinkedList() {
        System.out.println("Add 1 million elements to LinkedList: ");
        LinkedList<Integer> linkedList = new LinkedList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }

   public  void testAdd10mArrayList() {
        System.out.println("Add 10 million elements to ArrayList: ");
        ArrayList<Integer> arrayList = new ArrayList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 10000000; i++) {
            arrayList.add(i);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }

    public  void testAdd10mLinkedList() {
        System.out.println("Add 10 million elements to LinkedList: ");
        LinkedList<Integer> linkedList = new LinkedList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 10000000; i++) {
            linkedList.add(i);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }

    public  void testInsertStart100kArrayList() {
        System.out.println("Insert Start 100k elements to ArrayList: ");
        ArrayList<Integer> arrayList = new ArrayList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 100000; i++) {
            arrayList.add(0,1);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }

    public  void testInsertStart100kLinkedList() {
        System.out.println("Insert Start 100k elements to LinkedList: ");
        LinkedList<Integer> linkedList = new LinkedList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 100000; i++) {
            linkedList.add(0,1);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }

//    public  void testInsertStart1mArrayList() {
//        System.out.println("Insert Start 1 million elements to ArrayList: ");
//        ArrayList<Integer> arrayList = new ArrayList <>();
//        Long before = System.nanoTime();
//        for (Integer i = 0; i < 1000000; i++) {
//            arrayList.add(0,i);
//        }
//        Long after = System.nanoTime();
//        Long time = after - before;
//        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
//    }

    public  void testInsertStart1mLinkedList() {
        System.out.println("Insert Start 1 million elements to LinkedList: ");
        LinkedList<Integer> linkedList = new LinkedList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 1000000; i++) {
            linkedList.add(0,i);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }

//    public  void testInsertStart10mArrayList() {
//        System.out.println("Insert Start 10 million elements to ArrayList: ");
//        ArrayList<Integer> arrayList = new ArrayList <>();
//        Long before = System.nanoTime();
//        for (Integer i = 0; i < 10000000; i++) {
//            arrayList.add(0,i);
//        }
//        Long after = System.nanoTime();
//        Long time = after - before;
//        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
//    }

    public void testInsertStart10mLinkedList() {
        System.out.println("Insert Start 10 million elements to LinkedList: ");
        LinkedList<Integer> linkedList = new LinkedList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 10000000; i++) {
            linkedList.add(0,i);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }

    public void testInsertMiddle100kArrayList() {
        System.out.println("Insert Middle 100k elements to ArrayList: ");
        ArrayList<Integer> arrayList = new ArrayList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 100000; i++) {
            arrayList.add(arrayList.size()/2,1);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }

    public  void testInsertMiddle100kLinkedList() {
        System.out.println("Insert Start 100k elements to LinkedList: ");
        LinkedList<Integer> linkedList = new LinkedList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 100000; i++) {
            linkedList.add(linkedList.size()/2,1);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }

    public  void testInsertMiddle1mArrayList() {
        System.out.println("Insert Middle 1 million elements to ArrayList: ");
        ArrayList<Integer> arrayList = new ArrayList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 1000000; i++) {
            arrayList.add(arrayList.size()/2,i);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }


    public  void testInsertMiddle1mLinkedList() {
        System.out.println("Insert Middle 1 million elements to LinkedList: ");
        LinkedList<Integer> linkedList = new LinkedList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 1000000; i++) {
            linkedList.add(linkedList.size()/2,i);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }


    public  void testInsertMiddle10mLinkedList() {
        System.out.println("Insert Middle 10 million elements to LinkedList: ");
        LinkedList<Integer> linkedList = new LinkedList <>();
        Long before = System.nanoTime();
        for (Integer i = 0; i < 10000000; i++) {
            linkedList.add(linkedList.size()/2,i);
        }
        Long after = System.nanoTime();
        Long time = after - before;
        System.out.println(TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS));
    }
}
