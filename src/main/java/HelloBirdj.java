import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;

@Library("say")
@Runtime(CRuntime.class)

public class HelloBirdj {

    static {
        BridJ.register();
    }
    /**
     * Prints the given string to stdout.<br>
     * @param str  the characters making up the string<br>
     * @param len  the length of the string<br>
     * Original signature : <code>void say(const int, const char*)</code><br>
     * <i>native declaration : say-native/src/main/jnaerator/include/say.hpp:9</i>
     */
    public static void say(int len, Pointer<Byte > str) {
        say(len, Pointer.getPeer(str));
    }
    protected native static void say(int len, @Ptr long str);

    public static void main(String[] args) {

    }
}
