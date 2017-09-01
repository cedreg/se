package ch.hfict.math;
public class Statistics{
 private double [] numbers = null;
 private int last = 0;

 public Statistics(int size){
   if (size <= 0)
   {
     throw new IllegalArgumentException("Size must be > 0");
   }
   numbers = new double [size];
 }
 public void addNumber(double n){
   numbers[last++] = n;
 }
 public double getAverage(){
   double tmp = 0;  
   for (int i = 0; i < last; i++){
     tmp += numbers[i];
   }
  //system.out.println(tmp / last);
   return tmp / last;
   }
}
