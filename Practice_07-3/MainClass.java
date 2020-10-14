public class MainClass {
    
    public static void main(String[] args) {
        long l = 123456789123L;
        float f = 2.5F;
        char c = 'R';
        //throws compiler error: Incompatible types: possible lossy conversion from long to int
        //int i = l;
        int i = (int)l;
        
        System.out.println(i);
    }
}