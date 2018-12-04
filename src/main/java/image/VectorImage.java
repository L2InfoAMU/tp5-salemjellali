package image;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.paint.Color;

public class VectorImage implements Image {
	private int width;
	private int height;
	private List<Shape> shape;

	public VectorImage(List<Shape> shapes, int width, int height){
		this.height=height;
		this.width = width;
		this.shape= new ArrayList<Shape>();
		shape = shapes;
		
		/*for(Shape c :shapes){
		this.shape.add(c);
		}
		for(int i=0;i<width;i++){
			for(int j=0;j<height;j++){
				test(i,j);
			}
		}*/
	}
	@Override
	public Color getPixelColor(int x, int y) {
			for(Shape c:shape){
				if(c.contains(new Point(x,y)))
					return c.getColor();	
			}			
		return Color.RED;
	}
	
	public void test(int x, int y){
		for(Shape c:shape){
				if(c.contains(new Point(x,y))){
					System.out.println("0");		
				}
				//System.out.println("1");
		}
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}
	protected void setWidth(int width){
		this.width = width;
		
	}
	protected void setHeight(int height){
		this.height=height;
	}

}
