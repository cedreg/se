package ch.hfict;

import java.util.Date;

public class Timer implements Runnable{

  private Thread t;
  
  public void start() {
    t = new Thread(this);
  }

  public void stop() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void run() {
    while (true) {
      display();
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
  }

  private void display() {
    System.out.println(new Date());
  }

}
