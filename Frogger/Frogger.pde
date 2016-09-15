int xx = 200;
int yy = 380;
  Car actuallythooo = new Car(50, 350);
Car actuallythooonolog = new Car(360, 310);




void setup(){
  size(400,400);
}

void draw(){
  background(6, 120, 255);
  fill(0, 25, 25);
  ellipse(xx, yy, 10, 10);
  nostopitnoisaidNO();
nostopitnoisaidActuallyWaitYes();
actuallythooo.display();
actuallythooonolog.display();

}

void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
  
      {
      yy = yy - 4;
      }
      else if(keyCode == DOWN)
      {
        yy = yy + 4;
      }
      else if(keyCode == RIGHT)
      {
xx = xx + 4;
}
      else if(keyCode == LEFT)
      {
xx = xx - 4;
}


}}
void nostopitnoisaidNO(){
 if(xx >= 400){
  xx = xx - 10;
 } else if(xx <= 0){
  xx = xx + 10; 
 }
}
void nostopitnoisaidActuallyWaitYes(){
 if(yy >= 400){
  yy = yy - 10;
 } else if(yy <= 0){
  yy = yy + 10; 
 } }
 
 //aw thank you
 
 class Car{
  int xpos;
 int ypos;
Car(int x, int y){
 xpos = x;
 ypos = y;
 
}
  void display() 
  {
    fill(0,255,0);
    rect(xpos, ypos, 50, 50);
  }
void driveLeft(){
    
}
 }
 
