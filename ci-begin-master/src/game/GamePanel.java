package game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GamePanel extends JPanel {

    // attributes

//    BufferedImage backgroundImage;
//    int backgroundX;
//    int backgroundY;


    Player player;
    Background background;
    static ArrayList<PlayerBullet> bullets; // sua lai sau
    //methods

    //create Background and player
    public GamePanel(){
//        this.backgroundImage = SpriteUtils.loadImage("assets/images/Background/0.png");
//        this.playerImage = SpriteUtils.loadImage("assets/images/players/straight/0.png");
//        backgroundX = 0;
//        backgroundY = 600 - this.backgroundImage.getHeight();
//        playerX = 200;
//        playerY = 400;
        background = new Background();
        player = new Player();
//        player.position.x = 200;
//        player.position.y = 400;
        this.bullets = new ArrayList<>();
//        this.bullets.add();
//        this.bullets.size();
//        this.bullets.get();
    }


    // draw b-ground and player
    @Override
    public void paint(Graphics g){
//      g.draw3DRect(100,100,50,50,true);
//        g.drawImage(backgroundImage,this.backgroundX,this.backgroundY,null);
        this.background.render(g);
        player.render(g);
        for(int i = 0; i < this.bullets.size(); i++) {
            PlayerBullet bullet = this.bullets.get(i);
            bullet.render(g);
        }
    }


    //main
    public void gameLoop(){
        long lastLoop = 0;
        long delay = 1000/60;
        while (true){
            long currentTime = System.currentTimeMillis();
            if(currentTime - lastLoop > delay){
                this.runAll();
                this.renderAll();
                lastLoop = currentTime;
            }
        }
    }


    private void runAll() {
        this.background.run();
        this.player.run();
        for(int i = 0; i < this.bullets.size(); i++) {
            PlayerBullet bullet = this.bullets.get(i);
            bullet.run();
        }
        // Background up
//        if (this.backgroundY < 0){
//            this.backgroundY++;


        // control player


    }






    private void renderAll() {
        this.repaint();
    }
}