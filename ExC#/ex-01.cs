using System;

public class Ex01
{
    public static void Main(string[] args)
    {
        int a = 10;
        int b = 20;
        int c = 0;
        
        c = a;
        a = b;
        b = c;
        
        Console.WriteLine("Var a, b");
        Console.WriteLine(a);
        Console.WriteLine(b);
        
    }
}