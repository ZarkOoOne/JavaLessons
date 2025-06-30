 class exercise02 {
    public static void main(String[] args) {
        int[][] array = { {35,12,2}, {3,53,4}, {12,74,7}, {12,7,83} };

        for (int i=0; i<4; i++) {
            int sum = 0;
            for (int j=0; j<3; j++)
                sum+=array[i][j];

            System.out.println("the " + i + " row have sum: " + sum);
        }
        for (int j=0; j<3; j++) {
            int sum = 0;
            for (int i=0; i<4; i++)
                sum+=array[i][j];

            System.out.println("the " + j + " colm have sum: " + sum);
        }
    }
}