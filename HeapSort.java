public class HeapSort {
    public void sort(int arr[]) {
        int n = arr.length;

        // Построение кучи (перегруппировка массива)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Один за другим извлекаем элементы из кучи
        for (int i = n - 1; i > 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int root = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1; // Инициализируем левый дочерний элемент
        int right = 2 * i + 2; // Инициализируем правый дочерний элемент

        // Если левый дочерний элемент больше корня
        if (left < n && arr[left] > arr[root]) {
            root = left;
        }

        // Если правый дочерний элемент больше корня
        if (right < n && arr[right] > arr[root]) {
            root = right;
        }

        // Если наибольший элемент не корень
        if (root != i) {
            int swap = arr[i];
            arr[i] = arr[root];
            arr[root] = swap;

            // Рекурсивно вызываем процедуру heapify для поддерева
            heapify(arr, n, root);
        }
    }

    // Вспомогательный метод для вывода на экран массива
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }```
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);

        System.out.println("Отсортированный массив:");
        heapSort.printArray(arr);
    }
}
