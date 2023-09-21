import greenfoot.*;
import java.util.Random;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plane extends Actor
{
    /**
     * Act - do whatever the plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public plane() {
        GreenfootImage img = this.getImage();
        img.scale(140, 100);
        this.setImage(img);
    }
    private int speed = 6;
    private Random random = new Random();
    
    public void act() {
        if (random.nextInt(100) < 1) {
            randomTurn();
        }
        move(speed);
        
        
        if (isCloseToEdge()) {
            avoidWall();
        }
    }
    
    private boolean isCloseToEdge() {
        int edgeDistance = 20;
        int x = getX();
        int y = getY();
        int width = getWorld().getWidth();
        int height = getWorld().getHeight();
        
        return x<= edgeDistance || x >= width - edgeDistance || y <= edgeDistance || y >= height - edgeDistance;
    }
    
    private void avoidWall() {
        turn(-90);
        move(speed);
    }
    
    private void randomTurn() {
        int angle = random.nextInt(45) - 45;
        turn(angle);
    }
}
