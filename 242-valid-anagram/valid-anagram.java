class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] Charcount = new int[26];

        for ( int i = 0; i<s.length();i++){
            Charcount[s.charAt(i) - 'a']++;
            Charcount[t.charAt(i) - 'a']--;
        }

        for (int count:Charcount){
            if(count!=0){
                return false;
            }
        }
    return true;
    }
}