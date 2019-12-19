PImage bucket;
void setup(){
  bucket = loadImage("shark.png");
  bucket.resize(55, 65);
    size(500, 500);
}
int y = 30;
int x = (int) random(width);
int score = 0;
int speed = 1;
void draw(){
    background(5, 50, 100);
    fill(#44CB59);
    stroke(0, 0, 0);
    ellipse(x, y, 10, 20);
    fill(#959595);
    //rect(mouseX - 23, 480, 45, 35);
    image(bucket, mouseX, 450);
    y = y + speed;
    if (y >= 500){
      checkCatch(x);
      y = 30;
      x = (int) random(width);
    }
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
 void checkCatch(int x){
         if (x > mouseX - 23 && x < mouseX+100){
            score++;
            speed = speed + 1;
         }
         else if (score > 0) {
            score--;
            speed = speed - 1;
         }
        println("Your score is now: " + score);
    }
