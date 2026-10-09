class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i <= matrix.length - 1; i++) {
            if (matrix[i][0] == target) return true;

            if (matrix[i][matrix[i].length - 1] == target) return true;

            if (target > matrix[i][0] && target < matrix[i][matrix[i].length - 1]) {
                list.add(i);
            }
        }

        if (list.isEmpty()) return false;
        
        int row = list.getFirst();
        int l = 0;
        int r = matrix[row].length - 1;
        
        while (l < r) {
            if (matrix[row][l] == target || matrix[row][r] == target) return true;
            
            int mid = l + (r - l) / 2;

            if (matrix[row][mid] == target) return true;

            if (matrix[row][mid] < target) {
                l = mid + 1;
                continue;
            } 
            r = mid - 1;
        }
        return false;
    }
}
