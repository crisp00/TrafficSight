package com.hexapix.jjcrisp.trafficsight.util;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public abstract class ImageLoader {    

    private static Map<String, Image> images = new HashMap<String, Image>();
    
    public static void load(){
        try {
            images.put("roadNS", ImageIO.read(new File("res/img/roads/roadNS.png")));
            images.put("roadEW", ImageIO.read(new File("res/img/roads/roadEW.png")));
            images.put("roadNW", ImageIO.read(new File("res/img/roads/roadNW.png")));
            images.put("roadNE", ImageIO.read(new File("res/img/roads/roadNE.png")));
            images.put("roadSW", ImageIO.read(new File("res/img/roads/roadSW.png")));
            images.put("roadSE", ImageIO.read(new File("res/img/roads/roadSE.png")));
            images.put("roadTE", ImageIO.read(new File("res/img/roads/roadTE.png")));
            images.put("roadTW", ImageIO.read(new File("res/img/roads/roadTW.png")));
            images.put("roadTN", ImageIO.read(new File("res/img/roads/roadTN.png")));
            images.put("roadTS", ImageIO.read(new File("res/img/roads/roadTS.png")));
            images.put("roadNEWS", ImageIO.read(new File("res/img/roads/roadNEWS.png")));
            images.put("roadPLAZA", ImageIO.read(new File("res/img/roads/roadPLAZA.png")));
            images.put("carGreen", ImageIO.read(new File("res/img/carGreen.png")));
            
        } catch (IOException ex) {
            Logger.getLogger(ImageLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Image getImage(String imageName){
        return images.get(imageName);
    }
    
}
