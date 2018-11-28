package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {
    private Color color;
    private int height;
    private int width;
    private Color[][] colors;

    public BruteRasterImage(Color color, int width, int height ){
        this.color=color;
        this.width=width;
        this.height=height;
    }

    public BruteRasterImage(Color[][] colors){
        this.colors = colors;
    }

    public Color getPixelColor(int x, int y) {
        return colors[y][x];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void createRepresentation(){

    }
    public void setPixelColor(Color color, int x, int y){
        this.colors[y][x]=color;
    }
    private void setPixelsColor(Color[][] pixels){

    }
    private void setPixelsColor(Color color){
        this.color=color;
    }
    protected void setWidth(int width){
        this.width=width;
    }
    protected void setHeight(int height){
        this.height=height;
    }
}
