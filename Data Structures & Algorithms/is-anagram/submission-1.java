class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        s="";
        t="";
        for(int i=0; i<ch1.length; i++)
        {
            s=s+ch1[i];
            t=t+ch2[i];
        }
        if(s.equals(t))
            return true;
        return false;
    }
}
