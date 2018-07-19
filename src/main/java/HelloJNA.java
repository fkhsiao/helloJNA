import com.sun.jna.*;

public class HelloJNA {

    public interface sayDLL extends Library {
        sayDLL INSTANCE = (sayDLL) Native.loadLibrary("sayDLL", HelloJNA.class);
        void helloWorld();
    }

    public static void main(String[] args) {
        sayDLL say = sayDLL.INSTANCE;
        say.helloWorld();  // call of void function
    }
}
