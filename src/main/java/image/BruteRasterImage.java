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

    @Override
    public Color getPixelColor(int x, int y) {
        return colors[y][x];
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
