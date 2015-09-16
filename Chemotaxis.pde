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
 	void move() {
 		x = x+(int)(Math.random()*3)-1;
 		y = y+(int)(Math.random()*3)-1;
 	}

 	void show() {
 		fill(c,c,c);
 		ellipse(x,y,10,10);
 	}
 }    

 class Repellent {
 	int x,y;

 	Repellent() {
 		x=mouseX;
 		y=mouseY;
 	}

 	void show() {
 		ellipse(x,y);
 	}
 }