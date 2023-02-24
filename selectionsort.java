package algo_practice;
public class selectionsort{
    public static void main(String []args) {
        int[] nums = {4,8,3,9,3,7};
        int n = nums.length;
        for(int j=1;j<n;j++){
            int key = nums[j];
            int i = j-1;
            while(i > -1 && nums[i] > key){
                nums[j] = nums[i];
                i = i-1;
            }
            nums[i+1] = key;
        }
        for(int nu : nums){
            System.out.println(nu);
        }
    }
}