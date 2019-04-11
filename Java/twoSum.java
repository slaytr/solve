public class twoSum
{
    public static void main(String[] args){
        int[] output = twoSum(new int[] {2,2,1,4,5}, 3 );
        String out = String.format("%d, %d", output[0], output[1]);
        System.out.println(out);
    }

    public static int[] twoSum( int[] nums, int target ){
        int[] output = {0,0};

        boolean exit = false;
        int arr_len = nums.length;

        for ( int i = 0; i < arr_len -1; i++){
            for ( int j = 1; j < arr_len; j++){
                if ( j == i){
                    continue;
                }
                if ( nums[i] + nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                    exit = true;
                    break;
                }
            }
            if(exit){
                break;
            }
        }
        return output;
    }
}