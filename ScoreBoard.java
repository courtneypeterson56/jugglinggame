import edu.princeton.cs.algs4.*;

public class ScoreBoard  {
    
    private int hits;
    private int lost;
    private int level;
    
    public ScoreBoard() {
        hits = 0;
        lost = 0;
        level = 0;
    }
    
    public void zap() {
        // Increment the number of balls that have been lost
            lost++;
    }
    public boolean gameOver() {
        // Return true when the number of lost balls
        // is at least 5, and false otherwise.
        if (lost >= 5) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean increment() {
        // Increment the number of hits. If the number of hits
        // is at least 3*level, then increase the level and
        // return true; otherwise return false.
          hits ++;
           if (hits >= 3*level) {
               level++;
               return true;
           }
           else {
               return false;
           }       
    }
    public void draw(boolean gameover) {
        // Display the current status of the game on the StdDraw window.
        if (gameover){
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.text(.5, .6, "GAME OVER");
        }
        else {
             StdDraw.setPenColor(StdDraw.BLACK);
             StdDraw.text(0.5, 0.8, "Level: " + Integer.toString(level));
             StdDraw.text(0.5, 0.7, "Misses Left: " + Integer.toString(5-lost));
      }
   }
}
    
