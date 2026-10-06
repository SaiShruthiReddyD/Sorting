public class Insertionsort {
    static void insertionsort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int t = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > t) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = t;   
        }
    }
    public static void main(String[] args) {
        int arr[] = {60, -3, 2, 0, 3, 1, 56};
        insertionsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*Insertion sort is a simple sorting algorithm that builds a final sorted array
 (or list) one item at a time. It is significantly less efficient on large 
 lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
  However, it offers some advantages, such as being relatively simple to implement
   and efficient for small data sets or nearly sorted data.
The algorithm works by iterating through the input array and, for each element,
 finding its correct position within the already sorted portion of the array and
  inserting it there. This process is analogous to how one might sort a hand of playing
   cards:
Divide into sorted and unsorted: The array is conceptually divided into a sorted and an 
unsorted portion. Initially, the first element is considered sorted, and the rest are 
unsorted.
Pick and insert: For each element in the unsorted portion, starting from the second
 element:
It is picked up and compared with the elements in the sorted portion, moving from
 right to left.
If an element in the sorted portion is larger than the picked element, it is shifted
 one position to the right to make space.
This shifting continues until an element smaller than or equal to the picked element is 
encountered, or the beginning of the sorted portion is reached.
The picked element is then inserted into this newly created space.
Repeat: This process is repeated until all elements from the unsorted portion have
 been inserted into their correct positions within the now fully sorted array.
Example:
[5](sorted), [2, 4, 6, 1, 3] (unsorted)
Pick 2. Compare with 5. 2 < 5. Shift 5 right. Insert 2. Array becomes [2, 5, 4, 6, 1, 3].
Pick 4. Compare with 5. 4 < 5. Shift 5 right. Compare with 2. 4 > 2. Insert 4. Array becomes [2, 4, 5, 6, 1, 3].
Pick 6. Compare with 5. 6 > 5. Insert 6. Array becomes [2, 4, 5, 6, 1, 3].
Pick 1. Compare with 6, 5, 4, 2. All are larger. Shift all right. Insert 1. Array becomes [1, 2, 4, 5, 6, 3].
Pick 3. Compare with 6, 5, 4. All are larger. Shift all right. Compare with 2. 3 > 2. Insert 3. Array becomes [1, 2, 3, 4, 5, 6]. */