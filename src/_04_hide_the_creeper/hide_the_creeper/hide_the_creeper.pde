PImage creeper; 
PImage minecraft;
int x=624;
int y=39;
void setup() {
 size(700,700);
 minecraft = loadImage("forest.jpg");
 minecraft.resize(width, height);
 background(minecraft); 
 creeper=loadImage("creeper.jpg");
 creeper.resize(10, 10);
}

void draw() {
  println(mouseX+"   "+mouseY);
  background(minecraft);
  image(creeper, x, y); 
  fill(#FF0000);
  if (mousePressed) {
    if (mouseX>x&&mouseX<x+10&&mouseY>y&&mouseY<y+10) {
    
    fill(#00FF00);
    x=(int)random(width);
    y=(int)random(height);
    }
  }
  ellipse(mouseX,mouseY,50,50);
}
