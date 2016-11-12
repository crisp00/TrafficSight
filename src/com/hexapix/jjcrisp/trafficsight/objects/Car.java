/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexapix.jjcrisp.trafficsight.objects;

import com.hexapix.jjcrisp.trafficsight.TrafficSight;
import java.awt.Graphics;
import java.awt.Image;


public class Car {
    private Image sprite;
    public float x, y;
    
    public Car(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public void render(Graphics g){
        update();
        
        g.drawImage(sprite, (int)x, (int)y, (int)(TrafficSight.zoom * sprite.getWidth(null)), (int)(TrafficSight.zoom * sprite.getHeight(null)), null);
    }
    
    public void update(){
        
    }
    
}
