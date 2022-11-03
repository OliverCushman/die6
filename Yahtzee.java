/**
 * Abstracts one six-sided die (plural is dice)
 * 
 * @Mr. Jaffe
 * @1.0 2017-07-13
 */

public class Yahtzee
{
  /**
   * Contains the current value of the die
   */
  private int value;
  
  /**
   * Holds values for all 5 die
   */
  private int[] arr = new int[5];

  /**
   * Constructor to do an initial roll to set the first values
   */
  public Yahtzee() {
    this.roll();
  }

  /**
   * Roll the die! Generate random number 1 <= x <= 6 and assign to index of
   * each die
   * Note that roll does NOT return the new value
   */
  public void roll() {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int)(Math.random() * 6) + 1;
    }
  }  
  
  /**
   * Roll a specific die (1-5)
   */
  public void rollDieNumber(int dieNumber) {
    arr[dieNumber - 1] = (int)(Math.random() * 6) + 1;
  }
  
  /**
   * Roll a group of die by defining the first die of the group you want to
   * roll and the last die of the group you want to roll (1-5)
   */
  public void rollDiceGroup(int start, int end) {
    for (int i = start; i <= end; i++) {
      rollDieNumber(i);
    }
  }
  
  /**
   * String in format of "1-count 2-count 3-count ... 6-count"
   */
  public String summarize() {
    String summary = "";
    int count = 0;
    for (int i = 1; i <= 6; i++) {
      for (int a = 0; a < arr.length; a++) {
        if (arr[a] == i) {
          count++;
        }
      }
      summary += i + "-" + count;
      if (i < 6) {
        summary += " ";
      }
      count = 0;
    }
    return summary;
  }
  
  public String rollAndSummarize() {
    roll();
    return summarize();
  }
  
  /**
   * String in format of "die1Value die2Value die3Value ... die6Value"
   */
  public String toString() {
    String s = "";
    for (int i = 0; i < arr.length; i++) {
      s += Integer.toString(arr[i]);
      if (i < arr.length - 1) {
            s += " ";
      }
    }
    return s;
  }
  
  public String rollAndToString() {
    roll();
    return toString();
  }
}