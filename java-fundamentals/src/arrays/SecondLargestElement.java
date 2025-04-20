package arrays;
import java.util.*;

public class SecondLargestElement {
  public static void main(String[] args) {
    // Q1 Find sum of all elements
    int A[] = {3,9,7,8,12,6,15,5,4,10};
    int sum = 0;
    for(int i = 0; i<A.length; i++) {
      sum = sum+A[i];
    }
    System.out.println("Sum is "+ sum);

    //Q2. searching an element : 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the key you want to search in array");
    int key = sc.nextInt();
    // for(int i = 0; i< A.length; i++){
    //   if(A[i]==key){
    //     System.out.println(key + " is at index "+ i);
    //     System.exit(0);
    //   }
    // }
    // System.out.println("Not found");

    boolean found = false;
    int index = -1;
    for(int i = 0; i< A.length; i++){
      index++;
      if(A[i]==key){
        found = true;
        break;
      }
    }
    if(found) {
      System.out.println("Found at index : " + index);
    } else { 
      System.out.println("key not present");
    }

    // Q3. Find the maximum element //{3,9,7,8,12,6,15,5,4,10};
    int max = A[0];
    for(int i = 1; i<A.length; i++) {  // O(n) : time complexity
      if(max < A[i]) { 
        max = A[i];
      }
    }
    System.out.println("Max element is " + max); 

    // Q4. Find second largest element : The below solution wont work for descending sorted array
    int max1 = A[0], max2 = A[0];
    for(int i = 1; i<A.length; i++) { // O(n) : time complexity
      if(A[i] > max1) {
        max2 = max1;
        max1 = A[i];
      } else if(A[i] > max2) {
        max2 = A[i];
      }
    }
    System.out.println("Largest:  "+ max1 + " , Second largest: " + max2);
  }
}
