package image;
import static util.Matrices.*;
import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {
    private int height;
    private int width;
    private Color[][] colors;

    public BruteRasterImage(Color color, int width, int height ){
        this.width=width;
        this.height=height;
        createRepresentation();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                colors[x][y] = color;
            }
        }
    }

    public BruteRasterImage(Color[][] colors){
        this.width=getRowCount(colors);
        this.height=getColumnCount(colors);
        createRepresentation();
        requiresNonNull(colors);
        requiresNonZeroDimensions(colors);
        requiresRectangularMatrix(colors);
        this.colors = colors;
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

    public void createRepresentation(){
        this.colors = new Color[width][height];

    }
    public void setPixelColor(Color color, int x, int y){
        this.colors[y][x]=color;
    }
    private void setPixelsColor(Color[][] pixels){

    }
    private void setPixelsColor(Color color){
        for (int x=0;x>height;x++){
            for (int y=0;y<width;y++){
                colors[x][y]=color;
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
