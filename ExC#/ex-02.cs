using System;

public class Ex02
{
    public static void Main(string[] args)
    {
        double avgGrade = 0;
        
        Console.WriteLine("Type your grade for Geometry");
        int geoGrade = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Type your grade for Algebra");
        int algGrade = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Type your grade for physics");
        int phyGrade = Convert.ToInt32(Console.ReadLine());
        
        avgGrade = (geoGrade + algGrade + phyGrade) / 3.0;
        
        Console.WriteLine("Your average grade is " + avgGrade.ToString("F1"));
    }
}