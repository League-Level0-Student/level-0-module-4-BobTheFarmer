//Donkey.jpg
//Tail.jpeg
PImage donkey;
PImage tail;
void setup() {
  donkey = loadImage("Donkey.jpg");
tail = loadImage("Tail.jpeg");
size(800, 590);
}
void draw() {
 background (donkey);
image(tail, mouseX, mouseY);
}
