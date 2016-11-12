package com.hexapix.jjcrisp.trafficsight;

import com.hexapix.jjcrisp.trafficsight.graphics.TSPanel;
import com.hexapix.jjcrisp.trafficsight.util.ImageLoader;
import javax.swing.JFrame;

public class TrafficSight {
    public static final int WIDTH = 600, HEIGHT = 400;
    public static float zoom = 1;
    
    
    public static void main(String[] args) {
        ImageLoader.load();
        init();
    }
    
    public static void init(){
        JFrame frame = new JFrame();
        frame.setSize(WIDTH, HEIGHT);
        TSPanel panel = new TSPanel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
