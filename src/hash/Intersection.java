package hash;


import java.util.*;

public class Intersection {

    public static int[] intersection(int[] nums1,int[] nums2){

//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//        Set<Integer> inter_set = new HashSet<>();
//
//        for (int i:nums1)
//            set1.add(i);
//        for (int i:nums2)
//            set2.add(i);
//
//        for (int i:set1){
//            for (int j:set2){
//                if (i==j)
//                    inter_set.add(i);
//            }
//        }
//        int[] inter = new int[inter_set.size()];
//        int index = 0;
//        for (int i:inter_set)
//            inter[index++]=i;
//        return inter;

        /*
        定义两个集合，将其中一个数组的元素填充至一个集合中，
        然后遍历另一个数组，判断里面的元素是否存在于集合中，
        若存在则添加至另一个集合中，最后将集合中的元素转换为数组返回即可。
         */
        Set<Integer> set = new HashSet<>();
        Set<Integer> inter_set = new HashSet<>();
        for (int i:nums1)
            set.add(i);
        for (int i:nums2)
            if (set.contains(i))
                inter_set.add(i);
        int[] inter = new int[inter_set.size()];
        int index=0;
        for (int i:inter_set)
            inter[index++]=i;
        return inter;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5},new int[]{9,4,9,8,4})));
    }
}
