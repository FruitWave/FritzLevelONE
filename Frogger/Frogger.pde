int xx = 200;
int yy = 380;
  Car actuallythooo = new Car(50, 320);
Car actuallythooonolog = new Car(360, 240);




void setup(){
  size(400,400);
}

void draw(){
  background(6, 120, 255);
  //soft
  if(intersects(actuallythooo)){
  print("ouch");
  xx = xx - 2;
  fill(random(255), random(255), random(255));
} else{
   fill(0, 100, 100);
}
//strict
if(intersects(actuallythooonolog)){
  print("ouch");
 // xx = 200;
 // yy = 380;
 print("yoqw");
  xx = xx + 2;
} 
//that extra little push
if(xx < 4){
  xx = 0;
}
//why is the dot being stuck inside the back of the top car? shouldnt it 
if(xx > 398){
  xx = 400;
}
  ellipse(xx, yy, 10, 10);
  nostopitnoisaidNO();
nostopitnoisaidActuallyWaitYes();
actuallythooo.display();
actuallythooonolog.display();
//why is reverse blue while drive is not?
actuallythooo.reverse();
actuallythooonolog.drive();


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
boolean intersects(Car car) {
if ((yy > car.getY() && yy < car.getY()+50) && (xx > car.getX() && xx < car.getX()+50))
          return true;
    else 
        return false;
}
void nostopitnoisaidNO(){
 if(xx >= 400){
  //xx = xx - 10;
  xx = 52;
 } else if(xx <= 0){
  //xx = xx + 10; 
  xx = 398;
 }
}
void nostopitnoisaidActuallyWaitYes(){
 if(yy >= 400){
  yy = yy - 10;
 } else if(yy <= 0){
  yy = yy + 10; 
 } }
 
 //aw thank you
 //car class
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
  //go left
void reverse(){
    xpos = xpos - 2;
    if(xpos <= 0){
      xpos = 400;
    }
}
//go right
void drive(){
    xpos = xpos + 2;
    if(xpos >= 400){
      xpos = 0;
    }
}
//for the cars (below)
int getX(){
  return xpos;
}
int getY(){
  return ypos;
} 
 }
 
