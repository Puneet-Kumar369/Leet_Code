class Solution {
    public boolean isPalindrome(int x) {
        String n=""+x;
        int a=0,b=n.length()-1;
        while(a<b){
            if(n.charAt(a)!=n.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
            return true;
    }
}