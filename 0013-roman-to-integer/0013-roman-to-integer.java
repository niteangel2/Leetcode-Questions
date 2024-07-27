class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int last = 0;
        for(int i = 0; i < s.length(); i++){
            int x = 0;
            switch(s.charAt(i))
            {
                case 'I': 
                    x = 1;
                    break;
                case 'V': 
                    x = 5;   
                    break;
                case 'X': 
                   x = 10;
                    break;
                case 'L': 
                    x = 50;
                    break;
                case 'C': 
                    x = 100;
                    break;
                case 'D': 
                    x = 500;
                    break;
                case 'M': 
                    x = 1000;    
                    break;
            }
            ans = (last < x)? (ans - last * 2 +x) : (ans + x);
            last = x;
        }
        return ans;
    }
}