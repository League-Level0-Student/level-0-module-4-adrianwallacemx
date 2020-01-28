 PImage face;
void setup() {
  
face = loadImage("bart.jpg");
   size(800,600);
    face.resize(width,height);
    
    
}

void draw() {
  background(face);
  fill(#FFFFFF);
  ellipse(410,150,90,80);
  ellipse(410+90,150,90,80);
  fill(#030000);
  
  if(mouseX < 360){
     mouseX = 360; 
  }
  
  if(mouseX>450){
    mouseX=450;
  }
    if (mouseY<120){
      mouseY=120;
    }
    if(mouseY>190){
      mouseY=190;
    }
  
  ellipse(mouseX,mouseY,10,10);
  ellipse(mouseX+90,mouseY,10,10);
}
