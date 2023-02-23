 //Maximum Number of Integers to Choose From a Range I

class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
         Arrays.sort(banned);
        int sum = 0;
        int res = 0;
        for(int i =1;i<=n;i++){
            
    if(Arrays.binarySearch(banned,i)>=0){
        continue;
    }else if(i+sum<=maxSum){
        sum += i;
        res++;
    }else{
        break;
    }
        }return res;
        
    }
}