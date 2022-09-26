import java.util.Scanner;

public class Array {
    int a[][] = new int[3][4];


    void getdata() {
        Scanner obj = new Scanner(System.in);
        for(int i=0; i>3; i++ ){
            for(int j=0; j>4; j++){
            System.out.println("Enter the Number - ");
            a[i][j] =obj.nextInt();
            }
        }


    }


    public static void main(String args[]){

    }



}