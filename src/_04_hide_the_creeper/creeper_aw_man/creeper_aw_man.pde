//"Minecraft.jpeg"
//"Creeper(aw_man).png"
PImage minecraft;
PImage creeper;     //at the top of your program
int test;
int test2=0;
int cX = 490;
int cY = 20;
int score = 0;
void setup() {
 size(700, 500);
 creeper=loadImage("creeper.png");     //in setup method
minecraft = loadImage("Minecraft.jpeg");     //in setup method
minecraft.resize(width, height);          //in setup method
}
void draw() {
  background(minecraft); 
  fill(#181DF2);
  textSize(25);
  text("score: " + score, 20, 20);
  if(test2==0) {         //in setup method
image(creeper, cX, cY);     //in draw method
creeper.resize(5, 5); 
if(mousePressed) {
  if(test>0) {
      if(dist(cX, cY, mouseX, mouseY) < 7)  {
       test2=200;
       score +=1;
      }
     else if(dist(cX, cY, mouseX, mouseY) < 80) {
      fill(#02F51C);
    }
    else if(dist(cX, cY, mouseX, mouseY) < 180) {
      fill(#406F0B);
    }
    else if(dist(cX, cY, mouseX, mouseY) < 350) {
       fill(#F2A618); 
    }
    else {
  fill(#E82015);
    }
  ellipse(mouseX, mouseY, 30, 30);
  test-=1;
  }
}
else {
 test = 15;
}
  }
  else {
   test2-=1;
   textSize(50);
   text("You Found The Creeper", 50, 100);
   cX= (int)random(680);
   cY= (int)random(480);
  }
}
