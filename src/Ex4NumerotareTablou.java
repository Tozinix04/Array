public class Ex4NumerotareTablou {
    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

        int[][] tablou = new int[rows][cols];

        int numarator = 1;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++) {
                tablou[i][j] = numarator++;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(tablou[i][j] + " ");

            }
            System.out.println();
        }
    }
}
