package ch.hfict;

import java.io.IOException;

public class SimpleConsole {

  public static void main(String[] args) {
    Timer timer = new Timer();
    timer.start();
    int c = ' ';
    while (c != 's') {
      System.out.println("Enter s to Stop");
      try {
        c = System.in.read();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
    timer.stop();
  }

}
