class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] nums3=new int[m+n];
        int k=0;
        for(int i=0;i<m;i++){
            nums3[k++]=nums1[i];
        }
        for(int j=0;j<n;j++){
            nums3[k++]=nums2[j];
        }

        Arrays.sort(nums3);
        int l=nums3.length;
        if(l%2==0){
            int i=l/2;
            int sum=nums3[i]+nums3[i-1];
            double med=sum/2.0; 
            return med;

        }
        else{
return nums3[l/2];
        }
        
    }
}