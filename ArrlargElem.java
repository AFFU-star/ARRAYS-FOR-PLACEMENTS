import java.util.*;

public class ArrlargElem {

  public static void main(String args[]) {

    int arr1[] =  {2, 5, 1, 3, 0}; // Given array
    Arrays.sort(arr1); // Arrays class.  arr1  OBJ instance and  sorting  happens  on arr1[] .

    System.out.println("The Largest element in the array is: " + arr1[arr1.length - 1]); // size is 5, but index is from 0 so return size-1.
  }
}
