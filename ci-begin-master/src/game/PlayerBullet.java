package game;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PlayerBullet {
    BufferedImage image;
    Vector2D position;

    public  PlayerBullet() {
        this.image = SpriteUtils.loadImage("F:\\ci-begin-master\\ci-begin-master\\assets\\images\\player-bullets\\a\\0.png");
    }

    public void render(Graphics g) {
        g.drawImage(this.image, (int)this.position.x, (int)this.position.y, null);
    }
    public void run() {
        this.position.substract(0,7);
    }
}
