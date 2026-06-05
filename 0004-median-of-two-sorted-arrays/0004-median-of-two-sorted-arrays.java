class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = mergeSortedArrays(nums1,nums2);
        int len = merged.length,mid = 0;
        double median = 0;

        if(len % 2 == 0){
            mid = len / 2;
            double e1 = merged[mid];
            double e2 = merged[mid-1];
            median = (e1 + e2) / 2.0;
        }
        else{
            mid = (len - 1) / 2;
            median = merged[mid];
        }

        return median;
    }

        public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < n1) merged[k++] = arr1[i++];
        while (j < n2) merged[k++] = arr2[j++];

        return merged;
    }

}