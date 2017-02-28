public void setup()
{
	size(500, 500);
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
		fractal(x+siz/2, y+siz/2, siz/1.975);
		fractal(x-siz/2, y-siz/2, siz/1.975);
		fractal(x-siz/2, y+siz/2, siz/1.975);
		fractal(x+siz/2, y-siz/2, siz/1.975);
	}
	//test
}