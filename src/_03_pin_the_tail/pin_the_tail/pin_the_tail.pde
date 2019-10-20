PImage donkey;
PImage tail;
int MouseY;
int MouseX;
  import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

void setup() {
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.jpg");
  size(432, 407);
  Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("woohoo.mp3");     //In setup. Change the file name if you need to
}

void draw() {
  image(tail, mouseX-50, mouseY-50);
  tail.resize(100, 100); 
  rect(0, 0, 30, 30);
  rect(350, 160, 50, 50);
  if(mouseX < 30 && mouseY < 30) {
    background(donkey);
  }
  else {
    background(255, 255, 255);
  }
    if(mousePressed) {
      MouseX = mouseX-50;
      MouseY = mouseY-50;
    }
    if(MouseX+50 < 400 && MouseX+50 > 350 && MouseY+50 < 210 && MouseY+50 > 160) {
  println("TAIL PINNED");
  background(donkey);
// put these lines where you want the sound to play
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
  }
    image(tail, MouseX, MouseY);
  tail.resize(100, 100);

}
