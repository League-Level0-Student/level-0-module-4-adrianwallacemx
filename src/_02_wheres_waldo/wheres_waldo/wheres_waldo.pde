import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;

void setup() {
  PImage waldo = loadImage("waldo.jpg"); // Change this to match your file name.
  size(700, 700);
  waldo.resize(width, height);
  image(waldo, 0, 0);
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch }
}

void draw() {
  // Use this print statement to find out the coordinates of Waldo
  println("X: " + mouseX + " Y: " + mouseY); 

  // If the mouse is on Waldo, print “Waldo found!”
  //371,352
  if (mousePressed) {
    if (mouseX>361&&mouseX<381&&mouseY>342&&mouseY<362) {
      println("waldo found");
      playWoohoo();
    } else {
      playDoh();
      
    }
  }
  // If Waldo is found, also use the method below to play “Woohoo”
  // Change the name of the sound file if you need to 
  // If the mouse is pressed and they’re not on Waldo, play “Doh”
  // Change the name of the sound file if you need to
}

void playWoohoo() {
  woohoo.stop();
  woohoo.trigger();
}

void playDoh() {
  doh.stop();
  doh.trigger();
}
