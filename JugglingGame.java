import edu.princeton.cs.algs4.*;

public class JugglingGame {     
    public static void main(String[] args) {         
        StdDraw.enableDoubleBuffering(); 
        
        double paddleHeight = 0.05;         
        double paddleWidth  = 0.4;         
        Paddle paddle = new Paddle(paddleHeight, paddleWidth);         
        BallSet balls = new BallSet(3);         
        ScoreBoard scoreboard = new ScoreBoard();           
        
// main animation loop         
        while (!scoreboard.gameOver())  {             
            StdDraw.show();           
            
// determine the current paddle position             
            paddle.move();             
            double paddleL = paddle.leftEdge();             
            double paddleR = paddle.rightEdge();    
            
// delete balls missed by the paddle             
            int ballnum = 0;            
            while (ballnum < balls.numBalls()) {                 
                Ball b = balls.get(ballnum);              
                if (b.atBottom(paddleHeight) && !b.isWithin(paddleL, paddleR)) {   
                    balls.delete(ballnum);                    
                    scoreboard.zap();                
                }            
                else 
                    ballnum++;            
            }        
            
// move the remaining balls            
            int count = balls.numBalls();            
            for (int i=0; i<count; i++) {                
                Ball b = balls.get(i);               
                if (b.atBottom(paddleHeight)) {              
                    b.changeDirection();                   
                    boolean newlevel = scoreboard.increment();   
                    if (newlevel)                        
                        balls.addBall();                
                }                 
                b.move();          
            }     
            
// draw the screen           
            StdDraw.clear();            
            for (int i=0; i<count; i++) {              
                Ball b = balls.get(i);                 
                b.draw();             
            }             
            paddle.draw();           
            scoreboard.draw(false);     
            StdDraw.pause(20);     
        }                 
// game is over     
        scoreboard.draw(true); 
        StdDraw.show();   
    } 
}


