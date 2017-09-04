package ch.hfict.math;

public class StatisticsTest {

  public static void main(String[] args) {
    try {
      Statistics stat = new Statistics();
      stat.addNumber(1.0);
      stat.addNumber(2.0);
      stat.addNumber(3.0);
      System.out.println(stat.getAverage());
    } catch (Exception ex) {
      System.out.println("exception: " + ex.getMessage());
      ex.printStackTrace();
    }
  }
}
