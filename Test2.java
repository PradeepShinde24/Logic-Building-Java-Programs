public class Test2
{
    static int i =5;
    public static void main(String... args)
    {
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(++i+i++);
    }
}