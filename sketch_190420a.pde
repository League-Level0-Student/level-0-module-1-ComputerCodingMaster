void setup() { 
  PImage face = loadImage("normie.png"); 
  background(face); 
  size(600, 600); 
  face.resize(width, height);
} 
void draw() { 
  ellipse(180, 190, 100, 100);
 fill(0,0,0);
  ellipse(180,190,50,50);
fill(255,255,255);
ellipse(500,200,100,100);
fill(0,0,0);
ellipse(500,200,50,50);
fill(255,255,255);
}
