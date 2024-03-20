import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Description: Copies the design shown in each of the four quadrants
   * Author: @JustinM12345
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Q1 Code
    stroke(0,0,0);
    strokeWeight(2);

    // Vertical Lines
    for (int intLineX = 20;intLineX <= 180; intLineX += 20){
      line(intLineX, 0, intLineX, height / 2);
    }

    // Horizontal Lines
    for (int intLineY = 20; intLineY <= 200; intLineY += 20){
      line(0, intLineY, width / 2, intLineY);
    }

    // Q2 Code 
    fill(220, 60, 110);
    strokeWeight(1);

    // Moves down to the next row
    for (int intCircleY = 40; intCircleY <=  160; intCircleY += 30) {
      // Draws 5 circles in a row
      for (int intCircleX = 240; intCircleX <= 360; intCircleX += 30) {
        ellipse(intCircleX, intCircleY, width / 20, height / 20);
      }
    }

    // Q3 Code

    for (int intColumn = 0; intColumn <= 200; intColumn += 1) {

      // Multiply by 1.275 because 200 * 1.275 = 255 which is max for RGB
      int intGreyScale = (int) (1.275 * intColumn);
      stroke(intGreyScale);

      // Drawing each line
      line(intColumn, height / 2, intColumn, height);
    }

    // Q4 Code

    // Flower Petals
    for (int intPetalNum = 0; intPetalNum < 8; intPetalNum++){
      fill(255, 165, 0);
      pushMatrix();
      translate((float)(0.75 * width), (float)(0.75 * height));

      // Rotates in a circle
      rotate(-intPetalNum * PI/4);
      translate((float)(width / 12 ), 0 );
      ellipse(0, 0, (float)(width / 6), (float)(height / 22));
      popMatrix();
    }

    // Circle in the middle of the flower
    strokeWeight(0);
    fill(32, 92, 34);
    ellipse((width/4) * 3, (height/4) * 3, width/10, width/10);

  }
}