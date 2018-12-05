package image;
import static util.Matrices.*;
import javafx.scene.paint.Color;

import java.io.LineNumberInputStream;
import java.util.*;

public class PaletteRasterImage extends RasterImage implements Image {
    public List<Color> Palette;
    public int[][] indexesofcolor;
    public int width;
    public int height;


    public PaletteRasterImage(Color color, int width, int height) {
        this.height = height;
        this.width = width;
        createRepresentation();
        Palette.add(color);
        setPixelsColor(color);
            }

    public PaletteRasterImage(Color[][] pixels) {

        this.height =getColumnCount(pixels);
        this.width = getRowCount(pixels); 
        createRepresentation();
        requiresNonNull(pixels);
        requiresNonZeroDimensions(pixels);
        requiresRectangularMatrix(pixels);
        setPixelsColor(pixels);
     
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return Palette.get(indexesofcolor[x][y]);
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
    public void createRepresentation(){
    	 this.indexesofcolor = new int[width][height];
         this.Palette = new ArrayList<Color>();
    }
    public void setPixelColor(Color color, int x, int y){
    	if(!Palette.contains(color))
    		Palette.add(color);
    	indexesofcolor[x][y]=Palette.indexOf(color);
    }
    public void setPixelsColor(Color[][] pixels){
    	 for (int i = 0; i < width; i++) {
             for (int j = 0; j < height; j++) {
             	Palette.add(pixels[i][j]);
                 indexesofcolor[i][j] = Palette.indexOf(pixels[i][j]);
             }
         }
    }
    public void setPixelsColor(Color color){
    	for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                indexesofcolor[i][j] = Palette.indexOf(color);
            }

        }

    }
    
    protected void setWidth(int width){
    	this.width = width;
    }
    protected void setHeight(int height){ 
    	this.height = height;
    }
}
