int xlocation=0;
int ylocation=0;
int xspeed=1;
int yspeed=10;

void setup() {
  size(800, 200);
}

void draw() {
  if (mousePressed) 
    fill(255, 000, 000);
      ellipse(xlocation, ylocation, 150, 150);
  xlocation=xlocation+xspeed;
  //xspeed=1;
  ylocation=ylocation+yspeed;
  if (xlocation>width){
  xspeed=-1;
  }
  if (ylocation>height) {
    yspeed=-10;
  }

  if (ylocation<0) {
    yspeed=10;
  }
}


  //5. ... change the X co-ordinate so that the dot moves to the right
  //2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position.
  //6. Make your dot move really fast so that it can win the race 
  //(you have to figure out what part of your code to change)
  //7. Use this method to play a ding when your dot crosses the finish line.

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
  if (!soundPlayed) {
    Minim minim = new Minim(this);
    AudioSample sound = minim.loadSample("ding2.wav");
    sound.trigger();
    soundPlayed = true;
  }
}