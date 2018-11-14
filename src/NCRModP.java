import java.util.Arrays;

class NCRModP { 
    
    // Returns nCr % p 
    static int nCrModp(int n, int r, int p) 
    { 
        int C[]=new int[r+1]; 
        Arrays.fill(C,0); 
      
        C[0] = 1; // Top row of Pascal Triangle 
      
        for (int i = 1; i <= n; i++) 
        { 
          
            for (int j = Math.min(i, r); j > 0; j--) 
            	
                C[j] = (C[j] + C[j-1])%p; 
        } 
        return C[r]; 
    } 
      
    // Driver program 
    public static void main(String args[]) 
    { 
        int n = 3, r = 2, p = 1000000007; 
        System.out.println("Value of nCr % p is "
                           + nCrModp(n, r, p)); 
          
    } 
} 
