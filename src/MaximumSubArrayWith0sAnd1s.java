
class MaximumSubArrayWith0sAnd1s  {
    public static void main(String[] args) {
        maximalSquare(sendarray)
    }

    public static int maximalSquare(char[][] matrix) {
        int len=48;
        int row=matrix.length;
        int column=matrix[0].length;
        for(int i=row-1;i>=0;i--){
            for(int j=column-1;j>=0;j--){
                if(i==row-1||j==column-1||matrix[i][j]=='0')
                {


                }
                else
                {
                    matrix[i][j]=(char)(Math.min(Math.min(matrix[i+1][j],matrix[i][j+1]),matrix[i+1][j+1])+1);


                }
                if(matrix[i][j]>len)
                    len=matrix[i][j];

            }
        }

        return (len-48)*(len-48);
    }
}
