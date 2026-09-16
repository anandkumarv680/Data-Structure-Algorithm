package dsa.heap;

import java.util.ArrayList;

public class Basics {

    public static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // Add element
        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1;   // Child index
            int par = (x - 1) / 2;    // Parent index

            while (x > 0 && arr.get(x) < arr.get(par)) {
                // Swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        // Peek (minimum element)
        public int peek() {
            if (arr.isEmpty()) {
                throw new RuntimeException("Heap is empty");
            }
            return arr.get(0);
        }

        // Heapify for Min Heap
        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                minIdx = right;
            }

            if (minIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        // Remove minimum element
        public int remove() {
            if (arr.isEmpty()) {
                throw new RuntimeException("Heap is empty");
            }

            int data = arr.get(0);

            // Swap root with last element
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Remove last element
            arr.remove(arr.size() - 1);

            // Heapify
            if (!arr.isEmpty()) {
                heapify(0);
            }

            return data;
        }

        public boolean isEmpty() {
            return arr.isEmpty();
        }
    }

    static void main(String[] args) {
        Heap h = new Heap();

        h.add(5);
        h.add(1);
        h.add(8);
        h.add(2);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}