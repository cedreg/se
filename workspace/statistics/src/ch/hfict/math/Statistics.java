package ch.hfict.math;
//import java.util.ArrayList;

public class Statistics{
 private java.util.List<Double> numbers = new java.util.ArrayList<Double>();

 public Statistics(){
  /* if (size <= 0)
   {
     throw new IllegalArgumentException("Size must be > 0");
   } */
 }
 public void addNumber(double n){
   numbers.add(n);
 }
 public double getAverage(){
   double tmp = 0;  
   
   for (double n : numbers) {
     tmp += n;
   }
  //system.out.println(tmp / last);
   return tmp / numbers.size();
   }
}
