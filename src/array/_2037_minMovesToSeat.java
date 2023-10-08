package leetcode_problems.array;

public class _2037_minMovesToSeat {
    public static void main(String[] args) {
    }

    public int minMovesToSeat(int[] seats, int[] students) {
        quicksort(seats, 0, seats.length - 1);
        quicksort(students, 0, students.length - 1);

        int moves = 0;

        for (int i = 0; i < seats.length; i++) {
            moves += abs(seats[i] - students[i]);
        }

        return moves;
    }

    static int abs(int num) {
        return (num < 0) ? -num : num;
    }

    public void quicksort(int[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(arr, low, high);
            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low;
        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
