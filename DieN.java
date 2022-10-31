
/**
 * Abstracts one six-sided die (plural is dice)
 * 
 * @Mr. Jaffe
 * @1.0 2017-07-13
 */
public class DieN
{
  /**
   * Contains the current value of the die
   */
  private int value;
  private int[] dieArr = new int[5];

  /**
   * Constructor to do an initial roll to set the first value
   */
  public DieN() {
      this.roll();
  }

  /**
   * Getter for value
   * @return Die value
   */
  public int getValue() {
    return value;
  }
  
  public void roll (int dieNumber) {
    if (dieNumber <= dieArr.length && dieNumber >= 0) {
      this.value = (int)(Math.random() * 6) + 1;
      dieArr[dieNumber] = getValue();
    }
  }
  
  public String summarize() {
      for (int i = 0; i <= 6; i++) {
        
      }
  }

  /**
   * Roll the die! Generate random number 1 <= x <= 6 and assign to value
   * Note that roll does NOT return the new value
   */
  public void roll() {
      
    this.value = (int)(Math.random() * 6) + 1;
  }  

  /**
   * Roll the die and return the new value
   * @return Die value
   */
  public int[] rollAndGetValues() {
    for (int i = 0; i < dieArr.length; i++) {
        roll();
        getValue();
    }
    return dieArr;
  }
}

