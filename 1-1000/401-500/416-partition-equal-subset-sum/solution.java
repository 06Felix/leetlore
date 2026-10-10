import java.math.BigInteger;
class Solution {
    public boolean canPartition(int[] a) {
        int sum=0;
        for(int i=0;i<a.length;i++)
            sum+=a[i];

        if(sum % 2 !=0)    
            return false;

        BigInteger d=new BigInteger("1").shiftLeft(sum/2);
        for(int i=0;i<a.length;i++)
            d= d.or(d.shiftRight(a[i]));

        return d.testBit(0);
    }
}
