import java.util.*;

public class ConnectFour
{
    public static void main(String[] args)
    {
        Scanner rdr = new Scanner(System.in);
        char[][] board = new char[6][7];
        for (int i = 0; i < board.length; i++)
        {
            board[i] = rdr.nextLine().toCharArray();
        }

        for (int col = 0; col < 7; col++)
        {
            for (int row = 5; row >= 0; row--)
            {
                if (board[row][col] == '.')
                {
                    board[row][col] = 'Y';
                    if (yellowWin(board))
                    {
                        System.out.println("drop in column " + (col + 1));
                        return;
                    }
                    board[row][col] = '.';
                    // if it wasn't this row, none of the above rows will
                    // work for this column
                    break;
                }
            }
        }

        System.out.println("too hard");
    }

    public static boolean yellowWin(char[][] board)
    {
        for (int row = 0; row < 6; row++)
        {
            for (int col = 0; col < 7; col++)
            {
                for (int[] dir : new int[][] { { 1, 0 }, { 0, 1 }, { 1, 1 },
                        { -1, 1 } })
                {
                    int count = 0;
                    for (int i = 0; i < 4; i++)
                    {
                        int r = row + i * dir[0];
                        int c = col + i * dir[1];

                        if (r >= 0 && r < 6 && c >= 0 && c < 7
                                && board[r][c] == 'Y')
                        {
                            count++;
                        }
                    }
                    if (count == 4)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
