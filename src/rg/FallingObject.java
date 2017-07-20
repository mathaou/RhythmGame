package rg;

import org.newdawn.slick.Image;

public class FallingObject {
	public Image img;
	public float x,y,radius;
	public FallingObject(Image img, float x, float y, float radius) {
		this.img = img;
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public Image getImg() {
		return img;
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public float getRadius() {
		return radius;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public void setX(float x) {
		this.x = x;
	}
	public void setY(float y) {
		this.y = y;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}

}
