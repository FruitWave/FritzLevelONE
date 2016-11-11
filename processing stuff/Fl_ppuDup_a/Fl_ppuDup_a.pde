//flappy dupya
int xTasii = 100;
int yTaste = 10;
double lightDupya = 1; //speed
double gravitraxxis = 1; //gravity
int jumpBoost = 100;
int xroll = 2000;
int ytube = (int)random(1900);
//vars^^^^^^^^




void setup(){
  size(2000, 2000);      //in setup method
}


//void draw()
void draw(){
  noStroke();
 
  background(20, 1, 1);
  xroll += 1;
  /* start of Light Dupya initalization*/
  fill(192, 255, 255);    //in draw method
ellipse(xTasii, yTaste, 20, 20); 

yTaste += lightDupya;
lightDupya += gravitraxxis;
if(yTaste > 1000){
 yTaste = 100;
 
}
  /* end of Light Dupya initalization*/
  // start of tubes
  fill(0, 200, 0);
  rect(xroll, ytube, 40, ytube);
  if(xroll < 0){
    xroll = 1000;
  }

}




void mouseClicked(){
  lightDupya = -20;
  
}
