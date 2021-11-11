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
  protected int xPos;
  // Human's position, y axis
  protected int yPos;
// All of the private variables
  // Value of human, low height
  private double LOW_HEIGHT;
  // Value of human, high height
  private double HIGH_HEIGHT;
  // Value of human, low age
  private int LOW_AGE;
  // Value of human, high age
  private int HIGH_AGE;
  // Value of human, low health
  private int LOW_HEALTH;
  // Value of human, high health
  private int HIGH_HEALTH;
  // value of human, number of
  private int NUM_HUMANS;
// All of the public classes
  public int getNumHumans() {

  }
  public void setNumHumans() {

  }
  public String getAgeRules() {

  } 
  public String getHeightRules() {

  }
  public String getHealthRules() {
 
  }
  public void move() {

  }
  public int getXPos() {

  }
  public int getYPos() {
    
  }
}