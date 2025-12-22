//Method -1 brute force
//public class MultipleLeftRotationArray {
//    public static void main(String[] args) {
//   int a[] = {1,2,3,4,5};
//   int b[]  = {2,3};
//   int ans[][] = new int[b.length][a.length];
//  for(int i=0; i<b.length ; i++){
//      int k = b[i];  //k=2
//      int tempArray[] = a.clone();  //tempArray = 1,2,3,4,5
//      rotateByK(tempArray,k); //In Java, when you pass an array to a method like rotateByK(tempArray, k), you aren't passing a copy of the values; you are passing the memory address of that array.
//      ans[i] = tempArray;  //Inside rotateByK, the code moves the numbers around directly at that memory address.
//      //Because tempArray and the parameter inside the method both point to the same "box" in memory, any change made inside the method is visible to tempArray immediately after the method finishes.
//  }
//  for(int[] r : ans){
//      for(int num : r){
//          System.out.print(num+ " ");
//      }
//      System.out.println();
//  }
//
//    }
//
//    static void rotateByK(int a[], int k){
//        int n = a.length;
//        for(int i=0 ; i<k ; i++){
//            int temp = a[0];
//            for(int j=0; j<a.length-1 ; j++){  //did length-1 because last elemnt we want to leave for now
//              a[j] = a[j+1];
//            }
//            a[n-1] = temp;
//        }
//    }
//}
//above Time compelxity - O(K*n) --> for each row , if 2 shifts have to be done
    // now if there are 2 rows then multiple by size of array b
// Therefore time complexity - O(k*n) * b


//Method-2 is more efficient
// good property od rotation

//TODO : need to complete thid array problem with optimised solution

public class MultipleLeftRotationArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[]  = {2,3};

        int ans[][] = new int[b.length][a.length];


    }

//    static int[][] rotateByK(int a[], int k){
////        int rows =
//
//    }
}
