public class ColoumRowPyramid {
    public static void starPyramid(int m ){
        for(int row =0; row<m;row++){
            for(int col =0;col<m-row;col++){
                System.out.print(" ");
            }
            for(int col2 = 0;col2<=row;col2++){
                System.out.print("*");
            }
            for(int col3 = 0;col3<row;col3++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void conditionPyramid(int m){
        /*
            1
           010
          10101
         0101010
         */
    }
    public static void rowPyramid(int m){
        for(int row1=0;row1<m;row1++){
            for(int col1=0;col1<m-row1;col1++){
                System.out.print(" ");
            }
            for(int col2=0;col2<=row1;col2++){
                System.out.print(row1);
            }
            for(int col3=0;col3<row1;col3++){
                System.out.print(row1);
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        starPyramid(8);
        System.out.println("_____________________");
        rowPyramid(8);
        System.out.println("_____________________");
        conditionPyramid(8);

    }
}
