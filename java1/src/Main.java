public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer age = 45;

        System.out.println(age);
        System.out.println(age.toString().getClass().getName());


        System.out.println("byte 최소값: " + Byte.MIN_VALUE);
        System.out.println("byte 최대값: " + Byte.MAX_VALUE);

        System.out.println("short 최소값: " + Short.MIN_VALUE);
        System.out.println("short 최대값: " + Short.MAX_VALUE);

        System.out.println("int 최소값: " + Integer.MIN_VALUE);
        System.out.println("int 최대값: " + Integer.MAX_VALUE);

        System.out.println("long 최소값: " + Long.MIN_VALUE);
        System.out.println("long 최대값: " + Long.MAX_VALUE);

        System.out.println("float 최소값: " + Float.MIN_VALUE);
        System.out.println("float 최대값: " + Float.MAX_VALUE);

        System.out.println("double 최소값: " + Double.MIN_VALUE);
        System.out.println("double 최대값: " + Double.MAX_VALUE);

        System.out.println("char 최소값: " + (int) Character.MIN_VALUE);
        System.out.println("char 최대값: " + (int) Character.MAX_VALUE);


    }
}