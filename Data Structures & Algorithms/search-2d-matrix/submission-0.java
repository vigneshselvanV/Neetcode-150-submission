class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int bot = row-1;
        while(top<=bot){
            int mid = (top+bot)/2;
            if(target>matrix[mid][col-1]){
                top = mid+1;
            }
            else if(target<matrix[mid][0]){
                bot = mid-1;
            }
            else{
                break;
            }
        }
        if(top>bot){
            return false;
        }
        int l = 0;
        int r = col-1;
        int Row = (top+bot)/2;
        while(l<=r){
            int mid = (l+r)/2;
            if(matrix[Row][mid]>target){
                r = mid-1;
            }
            else if(matrix[Row][mid]<target){
                l = mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}