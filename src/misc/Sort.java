package misc;

public class Sort {

    // mergesort arr
    public static void mergeSort(int[] arr, int[] helparr, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(arr, helparr, low, middle);
            mergeSort(arr, helparr, middle + 1, high);
            merge(arr, helparr, low, middle, high);
        }
    }   

    private static void merge(int[] arr, int[] helparr, int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helparr[i] = arr[i];
        }

        int helperLeft = low, helperRight = middle + 1, current = low;

        while (helperLeft <= middle && helperRight <= high) {
            if (helparr[helperLeft] <= helparr[helperRight]) {
                arr[current] = helparr[helperLeft];
                helperLeft++;
            }
            else {
                arr[current] = helparr[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            arr[current + i] = helparr[helperLeft + 1];
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quickSort(arr, left, index - 1);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left + (right - left) / 2];
        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    // swaps arr[left] and arr[right] without declaring a third variable
    private static void swap(int[] arr, int left, int right) {
        arr[left] = arr[left] + arr[right];
        arr[right] = arr[left] - arr[right];
        arr[left] = arr[left] - arr[right];
    }
}
