Bacteria Zom = new Bacteria();
Bacteria [] bie;

 void setup() {
 	size(500,500);
 	bie = new Bacteria [100];
 	for (int m=0; m<bie.length; m++) {
 		bie[m] = new Bacteria();
 	}
 }

 void draw() {
 	background (255);
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
 	void move() {
 		if (x>=mouseX-20 && x <= mouseX+20 && y >=mouseY-20 && y <= mouseY+20) {
 			if (x>=mouseX) {
 				x = x+(int)(Math.random()*5);
 			} else if (x <= mouseX) {
 				x = x+(int)((Math.random()*5)-5);
 			}

 			if (y>=mouseY) {
 				y = y-(int)((Math.random()*5)-10);
 			
 			} else if (y<mouseY) {
 				y = y-(int)(Math.random()*5);
 			
 			}

 		} else {
 			x = x+(int)(Math.random()*3)-1;
 			y = y+(int)(Math.random()*3)-1;
 		}
 	}

 	void show() {
 		fill(c,c,c);
 		ellipse(x,y,10,10);
 	}
 }    