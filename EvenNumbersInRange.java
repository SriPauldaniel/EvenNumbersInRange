import java.util.Scanner;
public class EvenNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[][] tarr = new int[x][2];
        for(int i=0;i<x;i++) {
            for(int j=0;j<2;j++) {
                tarr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<x;i++) {
            System.out.print(findEven(arr, n,tarr[i][0],tarr[i][1])+ " ");
        }
        
    }

    public static int findEven(int[] arr,int n,int l,int r) {
        int[] arr1 = new int[n]; 
        int count = 0;
        for(int i=0;i<n;i++) {
            if(arr[i]%2 == 0) {
                count++;
                arr1[i] = count;
            }else {
                arr1[i] = count;
            }
        }
        if(l == 0) {
            return arr1[r];
        }
        return arr1[r] - arr1[l-1];
    } 
}