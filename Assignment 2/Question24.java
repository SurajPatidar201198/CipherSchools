import java.util.Arrays; 
import java.util.Collections; 
  
class Question24 { 
    public static int kthSmallest(Integer[] arr, int k) 
    { 
        Arrays.sort(arr); 
        return arr[k - 1]; 
    } 
  
    public static void main(String[] args) 
    { 
        Integer arr[] = new Integer[] { 22, 4, 95, 2, 11 }; 
        int k = 5; 
        System.out.print("K'th smallest element is " + kthSmallest(arr, k)); 
    } 
} 