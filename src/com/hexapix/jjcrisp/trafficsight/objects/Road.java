package com.hexapix.jjcrisp.trafficsight.objects;

import com.hexapix.jjcrisp.trafficsight.util.ImageLoader;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import com.hexapix.jjcrisp.trafficsight.TrafficSight;
import com.hexapix.jjcrisp.trafficsight.graphics.TSPanel;
import com.hexapix.jjcrisp.trafficsight.util.BiArrayList;

public class Road {
    RoadType type;
    int x, y;
    BiArrayList roads;
    
    public Road(int x, int y){
        this.x = x;
        this.y = y;
        this.roads = TSPanel.roads;
        type = RoadType.NS;
        roads.set(x, y, this);
    }
    
    public void render(Graphics g){
        if(isRoad(x, y - 1) && isRoad(x + 1, y) && isRoad(x - 1, y) && isRoad(x, y + 1)){//NEWS
            this.type = RoadType.NEWS;
        }else{
            if(isRoad(x, y + 1) && isRoad(x, y - 1)){//NS
                if(isRoad(x + 1, y)){//E
                    this.type = RoadType.TE;
                }else if(isRoad(x - 1, y)){//W
                    this.type = RoadType.TW;
                }else{
                    this.type = RoadType.NS;
                }
            }else if(isRoad(x - 1, y) && isRoad(x + 1, y)){//EW
                if(isRoad(x, y - 1)){//N
                    this.type = RoadType.TN;
                }else if(isRoad(x, y + 1)){//S
                    this.type = RoadType.TS;
                }else{
                    this.type = RoadType.EW;
                }
            }else if(isRoad(x, y - 1)){//N
                if(isRoad(x + 1, y)){//E
                    this.type = RoadType.NE;
                }else if(isRoad(x - 1, y)){//W
                    this.type = RoadType.NW;
                }else{//S o niente
                    this.type = RoadType.NS;
                }
            }else if(isRoad(x, y + 1)){//S
                if(isRoad(x + 1, y)){//E
                    this.type = RoadType.SE;
                }else if(isRoad(x - 1, y)){//W
                    this.type = RoadType.SW;
                }else{//N o niente
                    this.type = RoadType.NS;
                }
            }else if(isRoad(x + 1, y)){//E
                if(isRoad(x, y + 1)){//S
                    this.type = RoadType.SE;
                }else if(isRoad(x, y - 1)){//N
                    this.type = RoadType.NE;
                }else{//W o niente
                    this.type = RoadType.EW;
                }
            }else if(isRoad(x - 1, y)){//W
                if(isRoad(x, y + 1)){//S
                    this.type = RoadType.SW;
                }else if(isRoad(x, y - 1)){//N
                    this.type = RoadType.NW;
                }else{//W o niente
                    this.type = RoadType.EW;
                }
            }
        }
        g.drawImage(type.sprite, x * 100, y * 100, (int)(TrafficSight.zoom * 100), (int)(TrafficSight.zoom * 100), null);
    }
    
    
    public static boolean isRoad(int x, int y){
        return TSPanel.roads.get(x, y) != null && TSPanel.roads.get(x, y).type != RoadType.PLAZA;
    }
}
