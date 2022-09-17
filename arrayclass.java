import java.util.Arrays;

public class arrayclass {
    
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        // 1 operation
        int a1 = Arrays.binarySearch(a, 6);
        System.out.println("6 present at index no:"+" "+a1);
        // 2 operation;
        int[] b = {23,44,11,66,49,2222};
        Arrays.sort(b);
        for(int b1:b){
            System.out.print(b1+" ");
        }
        // 3 operation
        int[] c = {23,44,11,66,49,2222,555};
        Arrays.fill(c,100);
        for(int c1:c){
            System.out.println(c1+" ");
        }
    }
    
    
     
}

