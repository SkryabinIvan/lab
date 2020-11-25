package lab_5;
public class Matrix {
    public static int[][] add_sub_matr(int[][] A, int[][] B, int a1, int a2, int k)
    {

        int [][]C=new int [a1][a2];
        for(int i=0;i<a1;i++)
        {
            for (int ii=0;ii<a2;ii++)
            {
                C[i][ii]=A[i][ii]+B[i][ii]*k;
            }
        }

        return C;
    }


    public static int[][] mul_matr(int[][] A, int[][] B,int a1,int a2, int a3, int a4)
    {

        int [][]C=new int [a1][a4];
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int r=0;
        while (a<a1)
        {
            while (d<a4)
            {
                r=r+A[a][b]*B[c][d];
                b=b+1;
                c=c+1;
                if (c%a3==0)
                {
                    b=0;
                    c=0;
                    C[a][d]=r;
                    d=d+1;
                    r=0;
                }
            }
            a=a+1;
            d=0;
        }

        return C;
    }
}