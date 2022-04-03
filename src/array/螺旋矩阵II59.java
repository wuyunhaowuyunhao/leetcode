package array;

public class 螺旋矩阵II59 {
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int loop = n / 2;
        int startX = 0;
        int startY = 0;
        int num = 1;
        int i=0,j=0;
        int offset = 1;
        while (loop>0){
            i=startX;
            j=startY;
            //向右
            for (;j<startY+n-offset;j++){
                result[i][j]=num++;
            }
            //向下
            for(;i<startX+n-offset;i++){
                result[i][j]=num++;
            }
            //向左
            for(;j>startY;j--){
                result[i][j]=num++;
            }
            //向上
            for(;i>startX;i--){
                result[i][j]=num++;
            }
            loop--;
            startX++;
            startY++;
            offset += 2;
        }
        if(n%2==1)
            result[n/2][n/2]=num;

        return result;
    }


    public static void main(String[] args) {

    }
}
