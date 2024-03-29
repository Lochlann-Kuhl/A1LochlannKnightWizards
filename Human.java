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
// All of the public instance methods
  public Human() {

  }
  public int getHealth() {
    System.out.println("The human's health is at " + health);
  }
  public boolean setHealth() {

  }
  public String toString() {

  }
  public String getName() {
    System.out.println("The human's name is " + name);
  }
  public void setName() {

  }
  public int getAge() {
    System.out.println("The human's age is " + age);
  }
  public boolean setAge() {
    
  }
  public double getHeight() {
    System.out.println("The human's height is " + height);
  }
  public boolean setHeight() {
    
  }
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
    System.out.println("Minimum age is " + LOW_AGE);
    System.out.println("Maximum age is " + HIGH_AGE);
  } 
  public static String getHeightRules() {
    System.out.println("Minimum height (in inches) is " + LOW_HEIGHT);
    System.out.println("Maximum height (in inches) is " + HIGH_HEIGHT);
  }
  public static String getHealthRules() {
    System.out.println("Minimum health is " + LOW_HEALTH);
    System.out.println("Maximum health is " + HIGH_HEALTh);
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