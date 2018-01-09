import edu.princeton.cs.algs4.*;

public class Ball {
    
    private double speed;
    private double radius;
    private int type;
    private double x;
    private double y;
    
    public Ball() {
        
        type = StdRandom.uniform(1,6);
        
        speed = 0.003 * type;
        radius = .02 * type;
        y = 1.0 - radius;
        x = StdRandom.uniform(radius, 1.0 - radius);
    }
    
    public void move() {
        // Change the y-coordinate of the ball, according to its speed. 
           y = y - speed;
           if (y >= (1-radius)) {
               changeDirection();
           }
    }
    public void draw() {
        // Draws the ball on the StdDraw window, based on its coordinates.
        if (type==1){
            StdDraw.setPenColor(StdDraw.RED);
        }
        else if (type==2){
             StdDraw.setPenColor(StdDraw.GREEN);
        }
        else if (type==3){
             StdDraw.setPenColor(StdDraw.BLUE);
        }
        else if (type==4){
             StdDraw.setPenColor(StdDraw.YELLOW);
        }
        else if (type==5){
             StdDraw.setPenColor(StdDraw.ORANGE);
        }
        
        StdDraw.filledCircle(x, y, radius);
}
     public void changeDirection() {
    // Toggles the speed between positive and negative
       speed = -speed;
     }
      public boolean atBottom(double paddleHeight) {
    // Returns true if the bottom of the ball is less than or equal to the top of the paddle.
           if ((y - radius) <= paddleHeight) {
               return true; 
    }
           else { 
               return false;
    }  
}
      public boolean isWithin(double leftEdge, double rightEdge) {
    // Returns true if the bottom of the ball is within the two given x-coordinates.
           if ((x) > leftEdge && (x) < rightEdge)   {
               return true;
    }
           else {
                 return false;
} 
      }
}