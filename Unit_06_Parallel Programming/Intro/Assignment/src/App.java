import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 10; i++) {
        RunnableDemo demo = new RunnableDemo("Thread-" + i);
        demo.start();
        }



    }
}