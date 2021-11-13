// parent class for the different human types
public abstract class Human implements HumanInterface{
// All of the protected variables
  // Human's name
  protected String name;
  // Human's age
  protected int age;
  // Human's height
  protected double height;
  // Human's health
  protected int health;
  // Human's position, x axis
  protected int xPos = 0;
  // Human's position, y axis
  protected int yPos = 0;
// All of the private class variables
  // Value of human, low height, inches
  private static double LOW_HEIGHT = 60;
  // Value of human, high height, inches
  private static double HIGH_HEIGHT = 78;
  // Value of human, low age, years
  private static int LOW_AGE = 18;
  // Value of human, high age, years
  private static int HIGH_AGE = 90;
  // Value of human, low health, hit points
  private static int LOW_HEALTH = 1;
  // Value of human, high health, hit points
  private static int HIGH_HEALTH = 10;
  // value of human, number of
  private static int NUM_HUMANS = 1;
// All of the public classes

  public static int getNumHumans() {
    return NUM_HUMANS;
  }
  public static void setNumHumans() {
    NUM_HUMANS += 1;
  }
  public static String getAgeRules() {

  } 
  public static String getHeightRules() {

  }
  public static String getHealthRules() {
 
  }
  public static void move(int x, int y) {
    xPos += x;
    yPos += y;
  }
  public static int getXPos() {
    return xPos;
  }
  public static int getYPos() {
    return yPos;
  }
}