package pattern;

public class HollowPattern {

    public static void main(String[] args) {

        hollowRectangle(10, 7);

    }

    /**
     * @param row
     * @param col
     */
    private static void hollowRectangle(Integer row, Integer col) {

        for (int i = 1; i <= row; i++) 
        {

            for (int j = 1; j <= col; j++) 
            {
                if (i == 1 || j == 1 || i == row || j == col)
                    System.out.print("*");
                else 
                    System.out.print(" ");

                
            }
            System.out.println();

        }

    }

}
