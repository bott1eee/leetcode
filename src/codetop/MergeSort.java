package codetop;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] nums, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int mid = (startIndex + endIndex) / 2;
            mergeSort(nums, startIndex, mid);
            mergeSort(nums, mid + 1, endIndex);
            merge(nums, startIndex, mid, endIndex);
        }
    }

    public static void merge(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int p1 = start;
        int p2 = mid + 1;
        int p = 0;
        while (p1 <= mid && p2 <= end) {
            if (nums[p1] <= nums[p2]) {
                temp[p] = nums[p1];
                p1++;
            } else {
                temp[p] = nums[p2];
                p2++;
            }
            p++;
        }
        while (p1 <= mid) {
            temp[p++] = nums[p1++];
        }
        while (p2 <= end) {
            temp[p++] = nums[p2++];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i + start] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 6, 3, 9, 2, 1, 7};
        mergesort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergesort_2(int[] nums, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int mid = (startIndex + endIndex) / 2;
            mergeSort(nums, startIndex, mid);
            mergeSort(nums, mid + 1, endIndex);
            merge_2(nums, startIndex, mid, endIndex);
        }
    }

    public static void merge_2(int[] nums, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];
        int p1 = start;
        int p2 = mid + 1;
        int p = 0;
        while (p1 <= mid && p2 <= end) {
            if (nums[p1] <= nums[p2]) {
                temp[p] = nums[p1];
                p1++;
            } else {
                temp[p] = nums[p2];
                p2++;
            }
            p++;
        }
        while (p1 <= mid) {
            temp[p++] = nums[p1++];
        }
        while (p2 <= end) {
            temp[p++] = nums[p2++];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i + start] = temp[i];
        }
    }

    public static void mergesort_3(int[] nums, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int mid = (startIndex + endIndex) / 2;
            mergesort_3(nums, startIndex, mid);
            mergesort_3(nums, mid + 1, endIndex);
            merge_3(nums, startIndex, mid, endIndex);
        }
    }

    public static void merge_3(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int p1 = start;
        int p2 = mid + 1;
        int p = 0;
        while (p1 <= mid && p2 <= end) {
            if (nums[p1] <= nums[p2]) {
                temp[p] = nums[p1++];
            } else {
                temp[p] = nums[p2++];
            }
            p++;
        }
        while (p1 <= mid) {
            temp[p++] = nums[p1++];
        }
        while (p2 <= end) {
            temp[p++] = nums[p2++];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[start + i] = temp[i];
        }
    }

    public static void mergeSort_10(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort_10(arr, start, mid);
            mergeSort_10(arr, mid + 1, end);
            merge_10(arr, start, mid, end);
        }
    }

    public static void merge_10(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int p1 = start;
        int p2 = mid + 1;
        int p = 0;
        while (p1 <= mid && p2 <= end) {
            if (arr[p1] < arr[p2]) {
                temp[p++] = arr[p1++];
            } else {
                temp[p++] = arr[p2++];
            }
        }
        while (p1 <= mid) {
            temp[p++] = arr[p1++];
        }
        while (p2 <= end) {
            temp[p++] = arr[p2++];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[i + start] = temp[i];
        }
    }


    public static void merge_11(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int p1 = start;
        int p2 = mid + 1;
        int p = 0;
        while (p1 <= mid && p2 <= end) {
            if (nums[p1] < nums[p2]) {
                temp[p++] = nums[p1++];
            } else {
                temp[p++] = nums[p2++];
            }
        }
        while (p1 <= mid) {
            temp[p++] = nums[p1++];
        }
        while (p2 <= end) {
            temp[p++] = nums[p2++];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[start + i] = temp[i];
        }
    }

    public static void mergesort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergesort(nums, start, mid);
            mergesort(nums, mid + 1, end);
            merge_11(nums, start, mid, end);
        }
    }
}
