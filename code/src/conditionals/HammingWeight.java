package conditionals;

public class HammingWeight {
    public static void main(String[] args) {
    }

    static int hammingWeight(int n) {
        int ans=0;
        for(int i = 0; i < 32; i++){
            ans = ans + (n & 1);
            n = n >> 1;
        }
        return ans;
    }

    static int weight(int n) {
        int ans= 0;
        while(n != 0)
        {
            n = n & (n-1);
            ans++;
        }
        return ans;
    }
}