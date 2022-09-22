package Entity;

import Controller.Controller;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends MovingEntity{
public Player(Controller controller){
    super(controller);
}
    @Override
    public void update() {
    super.update();
    }

    @Override
    //Create image of blue square  to represent the player in the game
    public Image getSprite() {
        BufferedImage image = new BufferedImage(size.getWidth(),size.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();

        graphics.setColor(Color.blue);
        graphics.fillRect(0,0,size.getWidth(),size.getHeight());

        graphics.dispose();
        return image;
    }
}
