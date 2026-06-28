class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        int[]num=new int[26];
        if(n!=m){
            return false;
        }
        for(int i=0;i<n;i++){
            num[s.charAt(i)-'a']++;
        }
        for(int i=0;i<m;i++){
            num[t.charAt(i)-'a']--;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(num[i]!=0){
                count++;
            }
        }
        if(count!=0){
            return false;

        }else{
            return true;
        }
        
        
    }
}