import java.util.Arrays;
import java.util.Scanner;

public class Matrix
{

    public static void rotate(int[][] mat)
    {

        int N = mat.length;

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < i; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N / 2; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[i][N - j - 1];
                mat[i][N - j - 1] = temp;
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("How many times would you like the matrix to rotate?");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[][] mat =
                {
                        { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }
                };

        for(int i = 0; i < count; i++){
            rotate(mat);
        }

        for (var r: mat) {
            System.out.println(Arrays.toString(r));
        }
    }
}