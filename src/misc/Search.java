package misc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Node class and search methods intended to be copied to other projects and adapted based on need
// Mostly copied from "Cracking the Coding Interview" by Gayle Laakmann McDowell

public class Search {

    public class Node<T> {
        public Node(T init) { value = init; }
        public List<Node<T>> adjacents = new ArrayList<Node<T>>();
        public T value;
        public boolean visited = false;
    }

    // search through a sorted list recursively, return index of query value in arr
    // initial low and high should be zero and arr.length - 1, respectively
    public static int BinarySearch(int[] arr, int query, int low, int high) {
        if (low > high) return -1; // Error

        int mid = low + (high - low) / 2;
        if (arr[mid] > query) {
            return BinarySearch(arr, query, mid - 1, high);
        }
        else if (arr[mid] < query) {
            return BinarySearch(arr, query, mid + 1, high);
        }
        else return mid;
    }

    public static <T> void DFS(Node<T> root) {
        if (root == null) return;
        // visit(root) here, whatever that entails for use case
        root.visited = true;
        for (Node<T> n : root.adjacents) {
            if (n.visited == false) Search.DFS(n);
        }
    }

    public static <T> void BFS(Node<T> root) {
        Queue<Node<T>> queue = new LinkedList<Node<T>>();
        root.visited = true;
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<T> r = queue.remove();
            // visit(r) here, whatever that entails for use case
            for (Node<T> n : r.adjacents) {
                if (n.visited == false) {
                    n.visited = true;
                    queue.add(n);
                }
            }
        }
    }
}
