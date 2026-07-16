class Solution {
    public int missingNumber(int[] arr) {
        // code here
        Arrays.sort(arr);
        int i=1,j=0;
        while(i<=arr.length&&j<arr.length){
            if(i==arr[j]){
                i++;
                j++;
            }
            else if(i>arr[j]){
                j++;
            }
            else{
                return i;
            }
        }
        return i;
    }
}
