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

 public void setup() {
 	size(500,500);
 	bie = new Bacteria [100];
 	for (int m=0; m<bie.length; m++) {
 		bie[m] = new Bacteria();
 	}
 }

 public void draw() {
 	background (255);
 	Zom.show();
 	Zom.move();
 	for (int m=0; m<bie.length; m++) {
 		bie[m].show();
 		bie[m].move();
 	}
 }

 class Bacteria {
 	int x,y,c;

 	Bacteria() {
 		x = 250;
 		y = 250;
 		c = (int)(Math.random()*256);
 	}
 	public void move() {
 		x = x+(int)(Math.random()*3)-1;
 		y = y+(int)(Math.random()*3)-1;
 	}

 	public void show() {
 		fill(c,c,c);
 		ellipse(x,y,10,10);
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
