package image;
import static util.Matrices.*;
import javafx.scene.paint.Color;

import java.io.LineNumberInputStream;
import java.util.*;

public class PaletteRasterImage implements Image {
    public List<Color> Palette;
    public int[][] indexesofcolor;
    public int width;
    public int height;


    public PaletteRasterImage(Color color, int width, int height) {
        this.height = height;
        this.width = width;
        this.Palette = new ArrayList<Color>();
        this.indexesofcolor = new int[width][height];
        Palette.add(color);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                indexesofcolor[i][j] = Palette.indexOf(color);
            }

        }
    }

    public PaletteRasterImage(Color[][] pixels) {

        this.height = getRowCount(pixels);
        this.width = getColumnCount(pixels);
        this.indexesofcolor = new int[width][height];
        this.Palette = new ArrayList<Color>();
        requiresNonNull(pixels);
        requiresNonZeroDimensions(pixels);
        requiresRectangularMatrix(pixels);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {


                Palette.add(pixels[i][j]);
                indexesofcolor[i][j] = Palette.indexOf(pixels[i][j]);
            }


        }

    }

    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

}