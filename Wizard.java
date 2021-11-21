import java.lang.Math;

public class Wizard extends Human implements HumanInterface {
  private int magicka = 100;
  private static int LOW_MAGICKA = 1;
  private static int HIGH_MAGICKA = 100;
  public void castSpell() {
    if (magicka >= LOW_MAGICKA && magicka <= HIGH_MAGICKA) {
      magicka = setMagicka(magicka);
    }
    if (magicka >= LOW_MAGICKA && magicka >= HIGH_MAGICKA) {
      magicka = (setMagicka(magicka))/2;
    }
  }
  public String toString() {

  }
  public boolean setMagicka (int m) {
    int random = (int)(Math.random()*20)+1;
    return magicka-random;
  }
  public boolean equals(Wizard w) {
    
  }
  public static String getMagickaRules() {

  }
  public static String get MagickaRules() {
    
  }
}