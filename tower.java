import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tower extends Actor
{
    /**
     * Act - do whatever the tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkCollision();
    }
    
    private void checkCollision() {
        Actor plane = getOneIntersectingObject(plane.class);
        if (plane != null) {
            int planeX = plane.getX();
            int planeY = plane.getY();
            World world = getWorld();
            if (world != null) {
                world.removeObject(this);
                world.addObject(new boom(), planeX, planeY);
            }
        }
    }
}
