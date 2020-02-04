PImage donkey;
PImage tail;
void setup() {
  donkey = loadImage("donckey.jpg");      //change the file name if you need to
  tail = loadImage("tail.png");      //change the file name if you need to
  size(700, 700);
  tail.resize(100, 100); 
  donkey.resize(width, height);
}

void draw() {

  
  
  if (dist(0, 0, mouseX, mouseY) < 30) {


    background (donkey);
    rect(70, 250, 40, 40);
  }
  else{
    
    background(#FA1E1E);
  image(tail, mouseX, mouseY-50);
  }
  rect(0, 0, 30, 30);
  
  if (mousePressed) {
    if (mouseX>70&&mouseX<110&&mouseY>250&&mouseY<290) {
      background (donkey);
      image(tail, mouseX, mouseY-50);
    }
  }
}
