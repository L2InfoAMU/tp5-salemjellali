package image;

import javafx.scene.paint.Color;
import static util.Matrices.*;
public class BruteRasterImage extends RasterImage implements Image {
    private int height;
    private int width;
    private Color[][] colors;

    public BruteRasterImage(Color color, int width, int height ){
        this.width=width;
        this.height=height;
        createRepresentation();
        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] color){
    	this.width = getRowCount(color);
    	this.height = getColumnCount(color);
    	createRepresentation();
    	setPixelsColor(color);
    }
    
    public void createRepresentation(){
        this.colors = new Color[width][height];

    }

    public Color getPixelColor(int x, int y) {
        return colors[x][y];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setPixelColor(Color color, int x, int y){
        this.colors[y][x]=color;
    }
    protected void setPixelsColor(Color[][] pixels){
         colors = pixels;
    }
    protected void setPixelsColor(Color color){
    	for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                colors[x][y] = color;
            }
        }
    }
    protected void setWidth(int width){
        this.width=width;
    }
    protected void setHeight(int height){
        this.height=height;
    }
}
