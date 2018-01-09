import edu.princeton.cs.algs4.*;

public class BallSet {
    
    private Ball[] balls;
    int count;
    
    public BallSet(int num) {
        count = 0;
        balls = new Ball[10];
        
        for (int i = 0; i  < num; i++) {
         addBall();
       }
    }
        public int numBalls() {
            // Returns the current number of balls.
            return count;
        }
        
        public Ball get(int n) {
            // Returns the nth ball in the set
            return balls[n];
        }
        
        public void addBall() {
            // Adds a new ball to the set. If there are already 10
            // balls in the set, then the method does nothing.
            if (count < balls.length) {
                balls[count] = new Ball();
                count++;
       }   
 }
        
        public void delete(int n) {
            // Deletes the nth ball in the set by moving the
            // last ball of the array into slot n of the array
            
            balls[n] = balls[count -1];
            balls[count -1] = null;
            count--;
        } 
    }

    
    
