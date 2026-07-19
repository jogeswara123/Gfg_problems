class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int i=0,j=arr.length-1;
        int max=0;
        while(i<j){
            int min=Math.min(arr[i],arr[j]);
            int b=j-i;
            max=Math.max(max,(min*b));
            if(arr[i]<arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}