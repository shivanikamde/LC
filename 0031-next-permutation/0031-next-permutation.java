class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        //finding pivot point
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }

        //if no pivot pt found means last permutation so reverse entire array
        if(index==-1){
            reverse(nums,0,n-1);
            return;
        }

        // finding next just big element to swap with the pivot point
        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
        }

        //reverse/sort the remaining array
        reverse(nums,index+1,n-1);
    }

    public void sort(int[] nums,int a,int b){
        int n=nums.length;
        a=0;b=1;
        for(int i=0;i<n;i++){
            if(nums[a]<nums[b]){
                a++;
                b++;
            }
            else{
                int temp=nums[a];
                nums[a]=nums[b];
                nums[b]=nums[a];
            }
        }
    }
    public void swap(int[]nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void reverse(int[]nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}