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

public class Chemotaxis extends PApplet {

Bacteria Zom = new Bacteria();
Bacteria [] bie;
Bacteria Surv = new Bacteria();
Bacteria [] ivor;

 public void setup() {
 	size(500,500);
 	bie = new Bacteria [100];
 	for (int m=0; m<bie.length; m++) {
 		bie[m] = new Bacteria();
 	}
 }

 public void draw() {
 	background (255);
 	for (int m=0; m<bie.length; m++) {
 		bie[m].show();
 		bie[m].move();
 	}
 }

 class Bacteria {
 	int x,y,c,zx,zy;

 	Bacteria() {
 		x = 250;
 		y = 250;
 		zx=100;
 		zy=100;
 		c = (int)(Math.random()*256);
 	}
 	public void move() {
 		if (x>=mouseX-20 && x <= mouseX+20 && y >=mouseY-20 && y <= mouseY+20) {
 			if (x>=mouseX) {
 				x = x+(int)((Math.random()*5)-5);
 			} else if (x <= mouseX) {
 				x = x+(int)(Math.random()*5);
 			}

 			if (y>=mouseY) {
 				y = y-(int)((Math.random()*5)-10);
 				System.out.println("Y is under");
 			} else if (y<=mouseY) {
 				y = y-(int)(Math.random()*5);
 				System.out.println("Y is above");
 			}

 		} else {
 			x = x+(int)(Math.random()*3)-1;
 			y = y+(int)(Math.random()*3)-1;
 		}
 	}

 	public void show() {
 		fill(c,c,c);
 		ellipse(x,y,10,10);
 	}

 	public void zomshow() {
 		fill (0,255,0);
 		ellipse(zx,zy,10,10);
 	}
 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
