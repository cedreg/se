package ch.hfict.math;
import java.io.*;
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
 public boolean isNumber(String s) {
   try  
   {  
     double d = Double.parseDouble(s);  
   }  
   catch(NumberFormatException nfe)  
   {  
     return false;  
   }  
   return true;  
 }
 public void read (BufferedReader r)
 {
   try {
     String [] splitedVal = r.readLine().split(" ");
     
     for (int i = 0; i < splitedVal.length; i++)
     {
       if (isNumber(splitedVal[i])) {
         numbers.add(Double.parseDouble(splitedVal[i]));
       }else {
         System.out.println(splitedVal[i] + " is not a digit!");
       }
     } 
   }
   catch (IOException e) {
     e.printStackTrace();
   }
 }
}
