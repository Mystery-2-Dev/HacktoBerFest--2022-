import java.util.Scanner;
class lcsMemoized
{
    public int max(int a, int b)
    {
        return a>b ? a : b;
    }
    
    public int findLcs(String s1, String s2, int m, int n, int[][] arr)
    {
        if(m==0 || n==0)
            return 0;
            
        if(arr[m-1][n-1] != -1)
            return arr[m-1][n-1];
            
        if(s1.charAt(m-1) == s2.charAt(n-1))
        {
            return arr[m-1][n-1] = 1+ findLcs(s1, s2, m-1, n-1, arr);
        }
        else
            return arr[m-1][n-1] = max(findLcs(s1,s2, m-1, n, arr), findLcs(s1,s2, m, n-1, arr));
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int m=s1.length(), n=s2.length();
        lcsMemoized ob = new lcsMemoized();
        
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                arr[i][j] = -1;
        
        long start = System.nanoTime();
        
        System.out.println(ob.findLcs(s1, s2, m, n, arr));
        System.out.println("\n\nTime taken : "+(System.nanoTime()-start)/1000000 +" milli-seconds or "+(System.nanoTime()-start) +" nano-seconds");
    }
}
