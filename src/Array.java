import java.util.Scanner;

public class Array {
    int[][]a= {{1,2,3},{4,5,6},{7,8,9}};




    void row() {
        for (int i = 0; i < 3; i++) {
            int sum =0;
            for (int j = 0; j < 3; j++) {
                sum += a[i][j];

            }
            System.out.println("sum of all element of row " + i + " : " +sum);
        }
    }


    void col() {
        for (int i = 0; i < 3; i++) {
            int sum =0;
            for (int j = 0; j < 3; j++) {
                sum += a[j][i];

            }
            System.out.println("sum of all element of column " + i + " : " + sum);
        }
    }

    public static void main(String[] args) {
    Array obj = new Array();
    obj.row();
    obj.col();
    }
}


