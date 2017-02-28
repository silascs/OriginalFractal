import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup()
{
	
	noLoop();
}
public void draw()
{
	background(14, 237, 110);
	fractal(250, 250, 300);
}
public void fractal(double x, double y, double siz)
{
	noFill();
	stroke(114, 52, 145);
	ellipse((float)x, (float)y, (float)siz, (float)siz);
	if(siz > 10)
	{
		fractal(x+siz/2, y+siz/2, siz/1.975f);
		fractal(x-siz/2, y-siz/2, siz/1.975f);
		fractal(x-siz/2, y+siz/2, siz/1.975f);
		fractal(x+siz/2, y-siz/2, siz/1.975f);
	}
}
  public void settings() { 	size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
