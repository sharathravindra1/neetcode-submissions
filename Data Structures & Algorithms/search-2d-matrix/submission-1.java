class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        {


            for(int i=0;i<matrix.length;i++){
               int[] arr = matrix[i];
               int l = 0, r=arr.length-1,mid;
               while (l<=r){
                  mid = (l+r)/2;

                  if(target<arr[mid]){
                      r = mid-1;
                  }
                  if(target > arr[mid]){
                      l = mid+1;
                  }
                  if(target == arr[mid]){
                      return true;
                  }
               }

            }

            return false;
        }
    }
}
