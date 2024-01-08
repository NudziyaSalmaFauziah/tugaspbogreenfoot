import greenfoot.*;
import java.util.Random;

public class Stage extends World
{
    private Random random = new Random();
    
    public Stage() {
        super(1100, 650, 1);
    }
    
    public void act() {
        if (random.nextInt(230) < 1) {
            int randomX = random.nextInt(getWidth());
            int randomY = random.nextInt(getHeight());
            addObject(new tower(), randomX, randomY);
        }
    }
}
