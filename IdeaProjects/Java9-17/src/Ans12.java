sealed class A permits B{
    void print(){
        System.out.println("___________A_____________");
    }
}
final class  B extends  A{
    @Override
    void print(){
        System.out.println("__________B___________");
    }


};
public class Ans12 {

    public static void main(String[] args) {

        B obj = new B();
        obj.print();

    }
}
