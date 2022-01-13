// Importing the Random library
import java.util.Random;

class LuckyFive {
  
  public static void main(String[] args) {
    
    // Creating a random number generator
    //tworze nowy obiekt
    Random randomGenerator = new Random();
    
    // Generate a number between 1 and 6
    //obiekt ma przypisane co ma robić
    int dieRoll = randomGenerator.nextInt(6) + 1;

    // Repeat while roll isn't 5
    while (dieRoll!=5){
      System.out.println(dieRoll);
    dieRoll = randomGenerator.nextInt(6) + 1;
    }
    
  }
  
}
