class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }
        if(x>=0 && x<=9){
            return true;
        }
        int temp = x;
        int rev = 0;
        while (x != 0) {
        int pop = x % 10;
        x /= 10;
        rev = rev * 10 + pop;
        }
        if(rev==temp){
        return true;
        }
        return false;
    }
}
