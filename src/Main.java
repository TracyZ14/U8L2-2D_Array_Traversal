import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        int[][] numArr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("EXPECTED RESULT : false");
        System.out.println("ACTUAL RESULT   : " + hasDuplicate(numArr1));

        System.out.println();

        int[][] numArr2 = {{1, 1, 1}, {2, 2, 2}};
        System.out.println("EXPECTED RESULT : false");
        System.out.println("ACTUAL RESULT   : " + hasDuplicate(numArr2));

        System.out.println();

        int[][] numArr3 = {{1, 2, 3}, {1, 2, 3}};
        System.out.println("EXPECTED RESULT : true");
        System.out.println("ACTUAL RESULT   : " + hasDuplicate(numArr3));

        System.out.println();

        int[][] numArr4 = {{1, 2}, {3, 4}};
        System.out.println("EXPECTED RESULT : false");
        System.out.println("ACTUAL RESULT   : " + hasDuplicate(numArr4));

        System.out.println();

        int[][] numArr5 = {{1, 1}, {2, 2}};
        System.out.println("EXPECTED RESULT : false");
        System.out.println("ACTUAL RESULT   : " + hasDuplicate(numArr5));

        System.out.println();

        int[][] numArr6 = {{1, 2}, {1, 2}};
        System.out.println("EXPECTED RESULT : true");
        System.out.println("ACTUAL RESULT   : " + hasDuplicate(numArr6));

        for(int i = 0; i < 10; i++)
        {
            int rows = (int) (1 + Math.random() * 10);
            int columns = (int) (1 + Math.random() * 10);
            int[][] numArr = new int[rows][columns];
            for(int row = 0; row < rows; row++)
            {
                for(int column = 0; column < columns; column++)
                {
                    numArr[row][column] = (int) (Math.random() * 10);
                }
            }
            for(int row = 0; row < numArr.length; row++)
            {
                System.out.println(Arrays.toString(numArr[row]));
            }
            System.out.println("Has duplicate : " + hasDuplicate(numArr));
            System.out.println();
        }
    }

    public static boolean hasDuplicate(int[][] numArr)
    {
        for(int column = 0; column < numArr[0].length; column++)
        {
            for(int row = 0; row < numArr.length; row++)
            {
                for(int row2 = row + 1; row2 < numArr.length; row2++)
                {
                    if(numArr[row][column] == numArr[row2][column])
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}