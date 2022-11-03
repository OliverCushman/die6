
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
  
  /**
   * Holds values for all 5 die
   */
  private int[] arr = new int[5];

  /**
   * Constructor to do an initial roll to set the first values
   */
  public DieN() {
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
   * Roll a specific die
   */
  public void rollDieNumber(int dieNumber) {
      arr[dieNumber] = (int)(Math.random() * 6) + 1;
  }
  
  /**
   * String in format of "1-count 2-count 3-count 4-count 5-count 6-count"
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
   * String in format of "Die1Value Die2Value Die3Value..."
   */
  public String toString() {
    String s = "";
    for (int i = 0; i < arr.length; i++) {
      s += Integer.toString(arr[i]);
      if (i < 4) {
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