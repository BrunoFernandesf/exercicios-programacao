using System;

public class Ex03
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Type your Geometry grade");
        int geoGrade = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Type your Algebra grade");
        int algGrade = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Type your Physics grade");
        int phyGrade = Convert.ToInt32(Console.ReadLine());
        
        double avgGrade = (geoGrade + algGrade + phyGrade) / 3.0;
        
        if(avgGrade >= 7){
            Console.WriteLine("Good job!");
        }
        else if(avgGrade < 4){
            Console.WriteLine("Failed, you really need to work harder!");
        }
        //4 - 6
        else{
            Console.WriteLine("You need to work harder!");
        }
        
        Console.WriteLine("Your average grade is " + avgGrade.ToString("F1"));
    }
}