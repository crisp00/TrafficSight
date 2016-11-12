/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexapix.jjcrisp.trafficsight.objects;

import com.hexapix.jjcrisp.trafficsight.util.ImageLoader;
import java.awt.Image;

/**
 *
 * @author INFORMATICA
 */
public enum RoadType {
    NS(ImageLoader.getImage("roadNS")),
    EW(ImageLoader.getImage("roadEW")), 
    NE(ImageLoader.getImage("roadNE")), 
    NW(ImageLoader.getImage("roadNW")), 
    SE(ImageLoader.getImage("roadSE")), 
    SW(ImageLoader.getImage("roadSW")), 
    TE(ImageLoader.getImage("roadTE")), 
    TN(ImageLoader.getImage("roadTN")), 
    TW(ImageLoader.getImage("roadTW")), 
    TS(ImageLoader.getImage("roadTS")), 
    NEWS(ImageLoader.getImage("roadNEWS")),
    PLAZA(ImageLoader.getImage("roadPLAZA"));
    
    Image sprite;

    RoadType(Image sprite){
        this.sprite = sprite;
    }
}
