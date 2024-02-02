class Solution {
    public int noOfDigits(int n){
        int c=0;
        while(n>0){
            n/=10;c++;
        }
        return c;
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans= new ArrayList<>();
        String s="123456789";
        int i,n=noOfDigits(low),n1=noOfDigits(high);
        //adding didgits with number of digits of low
        while(n<=n1){
        for(i=0;i<s.length()-n+1;i++){
            String st=s.substring(i,i+n);
            int num=Integer.valueOf(st);
            if(num>=low && num<=high){
                // System.out.println(num);
                ans.add(num);
            }
        }
        n++;
        }
        //adding digits with number of digits of high
        // if(n!=n1){
        // for(i=0;i<s.length()-n1+1;i++){
        //     String st=s.substring(i,i+n1);
        //     int num=Integer.valueOf(st);
        //     if(num>=low && num<=high){
        //         System.out.println(num);
        //         ans.add(num);
        //     }
        // }
        // }
        return ans;
    }
}
