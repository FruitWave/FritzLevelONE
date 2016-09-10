int x = 500;
int y = 0;
int speed = 5;
int a;
int b;
int c;



void setup(){
  a = (int)random(255);
  b = (int)random(255);
  c = (int)random(255);
  size(1000, 1000);
}
void draw(){
background(a, b, c);
fill( 0, 255, 255);
ellipse(x, y, 20, 20);
noStroke();
rect(mouseX, 900, 100, 50);
for (int i = 1;  i > 0 ; i++  ) {
  y = y - speed;
  //if (x bucket and x raindrop are same) { make raindrop dissapear, score go up by 1}
  }

}