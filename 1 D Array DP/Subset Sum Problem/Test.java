public class Test{
    public static boolean subsetSum(int[] arr,int n, int targetSum){
        if(targetSum==0) return true;
        if(n==0 && targetSum!=0)
        return false;
        if(arr[n-1]>targetSum){
            return subsetSum(arr, n-1, targetSum);
        }
        return subsetSum(arr, n-1, targetSum) || subsetSum(arr, n-1, targetSum-arr[n-1]);
    }
    public static void main(String[] args) {
        int[] arr = {3,34,4,12,5,2};
        int targetSum =13;
        int n= arr.length;
        boolean result;
        result = subsetSum(arr, n, targetSum);
        System.out.println("Subset sum exist: "+result);
    }
}