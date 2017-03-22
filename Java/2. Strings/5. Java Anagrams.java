static boolean isAnagram(String a, String b) {        
    a = a.toLowerCase().trim();
    b = b.toLowerCase().trim();
        
    if (a.length() == b.length()) {
        int[] str1Letters = new int[26];
        int[] str2Letters = new int[26];
        int n = a.length();
            
        for (int i = 0; i < n; i++) {
            ++str1Letters[(int) a.charAt(i) - 97];
            ++str2Letters[(int) b.charAt(i) - 97];
        }
            
        for (int i = 0; i < 26; i++) {
            if (str1Letters[i] != str2Letters[i])
                return false;                
        }
            
    } else {
        return false;
    }       
        
    return true;
}