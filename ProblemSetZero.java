public class ProblemSetZero {
    public static void main(String[] args) {
        
    }
    public static int countInRange(int[] array, int min, int max) {
        int count = 0;
        for (int num : array) {
            if (num >= min && num <= max) {
                count++;
            }
        }
        return count;
    }
    public static ArrayList<String> clump(ArrayList<String> list) {
    ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i += 2) {
            if (i + 1 < list.size()) {
                String combined = "(" + list.get(i) + " " + list.get(i + 1) + ")";
                result.add(combined);
            } else {
                result.add(list.get(i));
            }
        }
        return result;
    }
    public static boolean isMagicSquare(int[][] square) {
        int size = square.length;
        for (int[] row : square) {
            if (row.length != size) return false;
        }

        int targetSum = 0;
        for (int num : square[0]) targetSum += num;
        for (int[] row : square) {
            int sum = 0;
            for (int num : row) sum += num;
            if (sum != targetSum) return false;
        }
        for (int col = 0; col < size; col++) {
            int sum = 0;
            for (int row = 0; row < size; row++) sum += square[row][col];
            if (sum != targetSum) return false;
        }
        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < size; i++) {
            diag1 += square[i][i];
            diag2 += square[i][size - 1 - i];
        }
        return diag1 == targetSum && diag2 == targetSum;
    }
    public static double median(int[] array) {
        Arrays.sort(array);
        int mid = array.length / 2;
        if (array.length % 2 == 0) {
            return (array[mid - 1] + array[mid]) / 2.0;
        } else {
            return array[mid];
        }
    }

}
