    PImage face; 
void setup() { 
   face = loadImage("face.jpg"); 
  size(184, 184);
} 
void draw() {
    face.resize(width, height);
  background(face);
  ellipse(120, 80, 50, 50);
  fill(0, 0, 0);
  ellipse(mouseX, mouseY, 25, 25); 
  fill(255, 255, 255); 
  ellipse(160,80, 50, 50);
  fill(0, 0, 0);
  ellipse(mouseX+50, mouseY, 25, 25);
  fill(255, 255, 255);
} 

