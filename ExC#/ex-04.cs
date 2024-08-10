using System;

public class Ex04
{
    public static void Main(string[] args)
    {
        //Variables
        double bitPrice;
        float bitPerc;
        double bitTotal;
        double bitChange;
        
        //Input
        Console.WriteLine("Bitcoin value at purchase");
        bitPrice = Double.Parse(Console.ReadLine());
        Console.WriteLine("Percentage of increase");
        bitPerc = float.Parse(Console.ReadLine());
        
        //Calculate
        if(bitPerc > 0){
            bitTotal = bitPrice * (1 + (bitPerc / 100));
            Console.WriteLine("Positive");
        }
        
        else {
            bitTotal = bitPrice * (1 - (Math.Abs(bitPerc) / 100)); 
            Console.WriteLine("Negative");
        }
        
        bitChange = bitTotal - bitPrice;
        
        //Output
        Console.WriteLine("Total value of the Bitcoin "+ bitTotal.ToString("F1"));
        Console.WriteLine("Increase or decrease value = " + bitChange.ToString("F1"));
    }
}