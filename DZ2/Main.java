public class Main {
    public static void main(String[] args) {
        int arr[] = {15, 19, 1, 5, 4, 3};
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        ob.printArray(arr);
    }
}