public final class MathUtil {
    private MathUtil() {
        
    }

    public static int clamp(int value, int min, int max) {
        if (value < min) {
            return min;
        } else if (value > max) {
            return max;
        } else {
            return value;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtil.clamp(5, 1, 10));   
        System.out.println(MathUtil.clamp(-3, 1, 10));  
        System.out.println(MathUtil.clamp(15, 1, 10));  
    }
}
