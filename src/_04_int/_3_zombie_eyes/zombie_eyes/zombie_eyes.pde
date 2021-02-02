
void setup() {
  PImage face= loadImage("face.png");
  size( 500,500);
  face.resize(500,500);
  image(face, 0,0);

}
void draw() {
  fill(mouseX, mouseY, mouseX);
ellipse( 209, 131, 75,70) ;
 fill(mouseY, mouseX, mouseY);
ellipse( 319, 136, 55,50) ;
  if(mousePressed){
     println(mouseX + "    " + mouseY); 
  }
}
