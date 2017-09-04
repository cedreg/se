package ch.hfict;

public class CollectionDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    java.util.ArrayList<Point> c = new java.util.ArrayList<Point>();
    
    c.add(new Point(1,1));
    c.add(new Point(2,2));
    
    for (Point p : c)
    {
      System.out.println("x: " + p.getX() + "y: " + p.getY());
    }
    
  }

}
