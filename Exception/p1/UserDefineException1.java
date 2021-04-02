package p1; 

public class UserDefineException1 extends RuntimeException// here is runtime exception this is unchecked exception
{
    UserDefineException1() {
    }
    
    UserDefineException1(final String message) {
        super(message);
    }
}
