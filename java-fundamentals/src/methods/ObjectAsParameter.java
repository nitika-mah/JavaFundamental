package methods;

public class ObjectAsParameter {

  static void update(int B[]) {
    B[0] = 25;
  }

  public static void main(String[] args) {
    int A[] = {2, 3, 4, 5, 6}; 
    update(A); 
    System.out.println(A[0]);
  }
  
}
