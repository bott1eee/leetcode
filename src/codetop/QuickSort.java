package codetop;

import com.sun.crypto.provider.PBEWithMD5AndDESCipher;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int startIndex, int endIndex) {
//        if (startIndex >= endIndex)
//            return;
        if (startIndex < endIndex) {
            int baseIndex = partition_12(arr, startIndex, endIndex);
            quickSort(arr, startIndex, baseIndex - 1);
            quickSort(arr, baseIndex + 1, endIndex);
        }
    }

    public static int partition(int[] arr, int startIndex, int endIndex) {

        int base = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        int index = startIndex;
        while (right >= left) {
            while (right >= left) {
                if (arr[right] < base) {
                    arr[left] = arr[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }
            while (right >= left) {
                if (arr[left] > base) {
                    arr[right] = arr[left];
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        arr[index] = base;
        return index;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 7, 6, 5, 3, 2, 8, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
//        System.out.println(findKthLargest(arr, 2));
    }

    public static void quickSort_2(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int index = partition_2(arr, startIndex, endIndex);
        quickSort_2(arr, startIndex, index - 1);
        quickSort_2(arr, index + 1, endIndex);
    }

    public static int partition_2(int[] arr, int startIndex, int endIndex) {
        int base = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        int index = startIndex;
        while (right >= left) {
            while (right >= left) {
                if (arr[right] < base) {
                    arr[left] = arr[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }
            while (right >= left) {
                if (arr[left] > base) {
                    arr[right] = arr[left];
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        arr[index] = base;
        return index;
    }

    public static void quickSort_3(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex)
            return;
        int index = partition_3(arr, startIndex, endIndex);
        quickSort_3(arr, startIndex, index - 1);
        quickSort_3(arr, index + 1, endIndex);
    }

    public static int partition_3(int[] arr, int startIndex, int endIndex) {
        int base = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        int index = startIndex;
        while (right >= left) {
            while (right >= left) {
                if (arr[right] < base) {
                    arr[left] = arr[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }
            while (right >= left) {
                if (arr[left] > base) {
                    arr[right] = arr[left];
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        arr[index] = base;
        return index;
    }

    public static int findKthLargest(int[] nums, int k) {
        return quickSort_4(nums, 0, nums.length - 1, nums.length - k);
    }

    public static int quickSort_4(int[] arr, int startIndex, int endIndex, int k) {
        int index = partition_4(arr, startIndex, endIndex);
        if (index == k) {
            return arr[index];
        } else if (index < k) {
            return quickSort_4(arr, index + 1, endIndex, k);
        } else {
            return quickSort_4(arr, startIndex, index - 1, k);
        }
    }

    public static int partition_4(int[] arr, int startIndex, int endIndex) {
        int base = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        int index = startIndex;
        while (right >= left) {
            while (right >= left) {
                if (arr[right] < base) {
                    arr[left] = arr[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }
            while (right >= left) {
                if (arr[left] > base) {
                    arr[right] = arr[left];
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        arr[index] = base;
        return index;
    }

    public static void quickSort_10(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int baseIndex = partition(arr, startIndex, endIndex);
        quickSort_10(arr, startIndex, baseIndex - 1);
        quickSort_10(arr, baseIndex + 1, endIndex);
    }

    public static int partition_10(int[] arr, int startIndex, int endIndex) {
        int base = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        int index = startIndex;
        while (right >= left) {
            while (right >= left) {
                if (arr[right] < base) {
                    arr[left] = arr[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }
            while (right >= left) {
                if (arr[left] > base) {
                    arr[right] = arr[left];
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        arr[index] = base;
        return index;
    }


    public static int partition_11(int[] arr, int startIndex, int endIndex) {
        int base = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        int index = startIndex;
        while (right >= left) {
            while (right >= left) {
                if (arr[right] < base) {
                    arr[left] = arr[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }
            while (right >= left) {
                if (arr[left] > base) {
                    arr[right] = arr[left];
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        arr[index] = base;
        return index;
    }

    public static int kth(int[] arr, int startIndex, int endIndex, int k) {
        int index = partition_11(arr,startIndex,endIndex);
        if (index == k) {
            return arr[index];
        } else if (index < k) {
            return kth(arr, index + 1, endIndex, k);
        } else {
            return kth(arr, startIndex, index - 1, k);
        }
    }

    public int findKthLargest_2(int[] nums, int k) {
        return kth(nums,0,nums.length-1,k);
    }

    public static int partition_12(int[] nums, int startIndex, int endIndex) {
        int base = nums[startIndex];
        int left = startIndex;
        int right = endIndex;
        int index = startIndex;
        while (left < right) {
            while (left < right) {
                if (nums[right] < base) {
                    nums[left] = nums[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }
            while (left < right) {
                if (nums[left] > base) {
                    nums[right] = nums[left];
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        nums[index] = base;
        return index;
    }
}
