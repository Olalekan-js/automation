package Task;

class Variables
{
    public static void main(String[] a)
    {
        byte by = 127;  // 1 bytes -2^7 to 2^7 -1
        short sh = 32767;   // 2 bytes
        // int num = 2147483647;   // 4 bytes
        long lg = 9223372036854775807l; // 8 bytes
        float f = 5.6f;     // 4 bytes
        double d = 32.42;   // 8 bytes

        boolean isCorrect = true;
        char ch = 'O';      // 2 bytes

        System.out.println("by: "+  by);
        System.out.println("sh: " + sh);
        System.out.println("lg: " + lg);
        System.out.println("ch: " + ch);
        System.out.println("f: " + f);
        System.out.println("d: " + d);
        System.out.println("isCorrect: " + isCorrect);
    }
}