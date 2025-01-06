import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger s1=new BigInteger(num1);
        BigInteger s2=new BigInteger(num2);
        BigInteger s3=s1.multiply(s2);
        
        return s3.toString();

    }
}