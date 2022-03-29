import java.util.Scanner;

public class Main {

    private static final int ROW = 3;
    private static final int COL = 3;
    private static String board[][] = new String[ROW][COL];

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int rowMove = SafeInput.getRangedInt(in, "Enter a move",1,3);
        int colMove = SafeInput.getRangedInt(in, "Enter a move",1,3);


    }
    private static  void clearBoard()
    {

    }
    private static void display()
    {
        for(int row = 1; row <=3; row++)
        {
            for(int col = 1; col <=3; col ++)
            {
                System.out.printf("[ ] ", row * col);
            }
            System.out.println();
        }

    }
    private static boolean isValidMove(int row, int col)
    {
        boolean validMove = false;

        return validMove;
    }
    private static boolean isWin(String player)
    {
        boolean win = false;

        return win;
    }
    private static  boolean isColWin(String player)
    {
        boolean colWin = false;

        return  colWin;
    }
    private static boolean isRowWin(String player)
    {
        boolean rowWin = false;

        return rowWin;
    }
    private static  boolean isDiagonalWin(String player)
    {
        boolean diaWin = false;

        return diaWin;
    }
    private static boolean isTie()
    {
        boolean tie = false;

        return  tie;
    }
}
