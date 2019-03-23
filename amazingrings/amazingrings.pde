int erwin=300;
int rommel=750;
void setup() {

  size(1000, 1000);
}
void draw() {
  background(255,255,255);
  erwin+=1;
  rommel-=1;
  for (int i= 300; i>=0; i=i-10) {
    noFill();
    ellipse(erwin, 450, i, i);
  }
  for (int a= 300; a>=0; a=a-10) {
    noFill();
    ellipse(rommel, 450, a, a);
 }
}
//*dies*
