class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        ArrayList<Integer> c=new ArrayList<>();
        for(int i:a){
            c.add(i);
        }
        for(int j:b){
            c.add(j);
        }
        Collections.sort(c);
        int j=0;
        for(int i=0;i<a.length;i++){
            a[i]=c.get(j);
            j++;
        }
        for(int i=0;i<b.length;i++){
            b[i]=c.get(j);
            j++;
        }
    }
}
