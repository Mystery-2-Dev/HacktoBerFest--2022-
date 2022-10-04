import java.util.*;
class lcsTabulation {
    public int findLcs(String text1, String text2) {
        int m=text1.length(), n=text2.length();
        int arr[][] = new int[m+1][n+1];
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    arr[i][j] = 1+arr[i-1][j-1];
                }
                else {
                    arr[i][j] = max(arr[i-1][j], arr[i][j-1]);
                }
            }
        }
        
        /*for(int[] T : arr) {
            for(int num : T) {
                System.out.print(num+" ");
            }
            System.out.println();
        }*/
        
        return arr[m][n];
    }
    
    public int max(int a, int b) {
        return a>b ? a : b;
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        lcsTabulation ob = new lcsTabulation();
        System.out.println(ob.findLcs(sc.nextLine(), sc.nextLine()));
    }
}
