package image;

import javafx.scene.paint.Color;

abstract class RasterImage {
	  	abstract public void createRepresentation();
	  	abstract public void setPixelColor(Color color, int x, int y);
	  	abstract protected void setPixelsColor(Color[][] pixels);
	  	abstract protected void setPixelsColor(Color color);
	  	abstract protected void setWidth(int width);
	    abstract protected void setHeight(int height);
	    
}
