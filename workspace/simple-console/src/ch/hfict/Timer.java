package ch.hfict;

import java.util.Date;

public class Timer implements Runnable{

  private boolean keepgoing;
  private Thread t;
  
  public Timer() {
    keepgoing = true;
    t = null;
  }
  
  public void start() {
    t = new Thread(this);
    t.start();
  }

  public void stop() {
    keepgoing = false;
    // TODO Auto-generated method stub
  }

  @Override
  public void run() {
    while (keepgoing && t != null) {
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
