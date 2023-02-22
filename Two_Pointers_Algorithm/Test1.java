/*
    Cho hai dãy số nguyên đã được sắp xếp không giảm a  và b lần lượt có n và m phần tử.
    Hãy ghép chúng thành dãy c được bố trí theo thứ tự không giảm.

    Giới hạn: n, m ≤ 105 và 0 ≤ a(i), b(i) ≤ 109

*/

package Two_Pointers_Algorithm;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static int[] mergeSort(int[] arr1, int[] arr2, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] a = new int[] {1, 3, 6, 8, 10};
        int[] b = new int[] {2, 6, 7, 12, 14, 15};

        int[] c = new int[a.length + b.length];

        int[] result = Test1.mergeSort(a, b, c);
        for(int i : result) {
            System.out.print(i + " ");
        }

    }
}
