class TryAutoClosable implements AutoCloseable {

    @Override
    public void close(){
        System.out.println("AutoCloseAble Working");
    }
}
public class Ans8 {
    public static void main(String[] args) {
        try(TryAutoClosable obj = new TryAutoClosable()){
            System.out.println("Trying Closeable");
        }
    }

}
