class Solution {
    public static int[] getConcatenation(int[] nums) {
        int[] arr=new int[nums.length+nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
                arr[k]=nums[i];
                k++;
        }
        for(int j=0;j<nums.length;j++){
                arr[k]=nums[j];
                k++;
        }
        return arr;
    }
    }