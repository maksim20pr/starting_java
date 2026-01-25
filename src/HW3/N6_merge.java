package HW3;

import java.util.LinkedList;

public class N6_merge {
    static void main() {
        LinkedList<Integer> arr1 = new LinkedList<Integer>();
        LinkedList<Integer> arr2 = new LinkedList<Integer>();
        for (int i = 0; i < 10; i += 2) {
            arr1.add(i);
            arr2.add(i+1);
        }
        for (var el: arr1) {
            System.out.print(el + " ");
        }
        System.out.println();
        for (var el: arr2) {
            System.out.print(el + " ");
        }
        System.out.println();
        int i = 0;
        while (i < arr1.size() || i < arr2.size()) {
//            System.out.println("Start with i=" + i);
            if (i >= arr1.size()) {
//                System.out.println("arr1 is end");
                while (i < arr2.size()) {
//                    System.out.println(i + " " + arr1.getLast() + " " + arr2.get(i));
                    arr1.add(arr2.get(i));
                    i++;
                }
                break;
            } else if (i >= arr2.size()) {
//                System.out.println("arr2 is end");
                break;
            } else if (arr1.get(i) >= arr2.get(i)){
//                System.out.println(i + " + " + arr1.get(i) + " + " + arr2.get(i));
                arr1.add(i, arr2.get(i));
                arr2.remove(i);
//                System.out.println(i + " + " + arr1.get(i) + " + " + arr2.get(i));
            } else {
//                System.out.println(i + " - " + arr1.get(i) + " - " + arr2.get(i));
                arr2.addFirst(0);
//                System.out.println(i + " - " + arr1.get(i) + " - " + arr2.get(i));
                i++;
            }
        }
        for (var el: arr1) {
            System.out.print(el + " ");
        }
    }
}
