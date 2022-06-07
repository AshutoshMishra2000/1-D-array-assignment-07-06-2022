class NumbersLessThanCurrentNo {
    static int[] smallerNumbersThanCurrent(int[] nums) {
      int count =0;
        int result[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0 ;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    count++;
                }
            }
            result[k]=count;
            count=0;
            k++;
            
        }
        return result;
    }

    public static void main(String[] args) {
        int []arr={8,2,34,1,2,6};
int result[]=smallerNumbersThanCurrent(arr);
for (int i : result) {
    System.out.println(i);
}
    }
}
