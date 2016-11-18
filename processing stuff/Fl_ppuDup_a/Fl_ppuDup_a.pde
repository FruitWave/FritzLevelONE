//flappy dupya
int thelastxBall = 100;
int yThoBall = 10;
double lightDupyaBallSpeed = 1; //speed
double gravitraxxis = 1; //gravity
int jumpBoost = 20;
int xrollScrollTube = 2000;
int ytube = (int)random(900);
int ThePipeAboveThePipe = ytube - 500;
//vars^^^^^^^^




void setup() {
  size(2000, 2000);      //in setup method
}


//void draw()
void draw() {
  if (xrollScrollTube < 0) {
    xrollScrollTube = 2000;
    ytube = (int)random(500, 900);
ThePipeAboveThePipe = ytube - 200;
  }
  noStroke();
  background(20, 1, 1);
  xrollScrollTube -= 3;
  /* start of Light Dupya initalization*/
  fill(192, 255, 255);    //in draw method
  ellipse(thelastxBall, yThoBall, 20, 20); 

  yThoBall += lightDupyaBallSpeed;
  lightDupyaBallSpeed += gravitraxxis;
  if ((yThoBall > 1000) || (yThoBall < 0)) {
    //System.exit(0);
    yThoBall = 200;
  }

  /* end of Light Dupya initalization*/
  // start of tubes
  fill(0, 200, 0);
  //top
  rect(xrollScrollTube, 0, 40, ThePipeAboveThePipe);
    rect(xrollScrollTube, ytube, 40, ytube);
//bot
print(ytube);
}




void keyPressed() {
  lightDupyaBallSpeed = -20;
}