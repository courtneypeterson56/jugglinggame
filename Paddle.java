import edu.princeton.cs.algs4.*;

public class Paddle  {
    private double center;
    private double height;
    private double width;
    
    public Paddle(double h, double w) {
        center = .5;
        height = h;
        width = w/2;
        
    }
        public void move() {
            // Position the paddle so that it is centered 
            //at the current x-coordinate of the mouse.
            center = StdDraw.mouseX();
        }
        public void draw() {
            // Draw the paddle at its current position.
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledRectangle(center, .05, width/2, height/2); 
        }
        public double leftEdge() {
            // Return the x-coordinate of the left edge of the paddle.
            return (center - width/2);
        }
        public double rightEdge() {
            // Return the x-coordinate of the right edge of the paddle.
            return (center + width/2); 
        }
    }

