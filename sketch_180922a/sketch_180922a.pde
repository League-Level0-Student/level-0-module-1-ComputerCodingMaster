void setup() {
PImage face = loadImage("+.jpg");
image(face,0,0);
size(640,360);
}
void draw() {
fill(mouseX,mouseY,60);
ellipse(240,235,100,100);
ellipse(400,230,100,100);
fill(0,0,0);
ellipse(400,230,40,40);
fill(0,0,0);
ellipse(240,235,40,40);
}