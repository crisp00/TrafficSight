package com.hexapix.jjcrisp.trafficsight.graphics;

import com.hexapix.jjcrisp.trafficsight.TrafficSight;
import com.hexapix.jjcrisp.trafficsight.objects.Car;
import com.hexapix.jjcrisp.trafficsight.objects.Road;
import com.hexapix.jjcrisp.trafficsight.util.BiArrayList;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class TSPanel extends JPanel{
    public static BiArrayList<Road> roads = new BiArrayList<Road>();
    public static Car c = new Car(50, 50);
    
    public TSPanel(){
        super();
        setFocusable(true);
        new Road(5, 5);
        
        addMouseListener(new MouseAdapter(){
                @Override
                public void mousePressed(MouseEvent e) {
                    if(e.getButton() == 1){
                        new Road(e.getX() / 100, e.getY() / 100);
                        repaint();
                    }
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }
        });
        
        addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent ke) {
                
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_UP){
                    TrafficSight.zoom += 0.1f;
                    System.out.println("up");
                }else if(ke.getKeyCode() == KeyEvent.VK_DOWN){
                    TrafficSight.zoom -= 0.1f;
                }
                repaint();
            }

            @Override
            public void keyReleased(KeyEvent ke) {

            }
        
        
        });
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int x = 0; x < roads.size(); x++){
            for(int y = 0; y < roads.get(x).size(); y++){
                Road r = roads.get(x, y);
                if(r != null){
                    r.render(g);
                }
            }
        }
        c.render(g);
        
    }
}
