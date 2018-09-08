boolean PogU=false;
void setup() {
  size(500, 500);
}
void draw() {
  background(0000000000000, 00000000000, 0000000000000000000);
  noStroke();
  fill(255, 0, 0);
  ellipse(150, 200, 150, 150);
  ellipse(212, 200, 150, 150);
  fill(0, 130, 0);
  rect(176, 103, 12, 32);
  if (PogU==true) {  
    fill(0000000000000000000, 000000000000000000, 000000000000000);
    ellipse(100, 200, 50, 100);
  }
}

void mousePressed() {
  PogU=true;
}