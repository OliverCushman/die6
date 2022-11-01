
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
  
  public void roll (int dieNumber, int[] nums) {
    if (dieNumber <= nums.length && dieNumber >= 0) {
      this.value = (int)(Math.random() * 6) + 1;
      nums[dieNumber] = getValue();
    }
  }
  
  public String summarize(int[] nums) {
      String summary = "";
      int count = 0;
      for (int i = 1; i <= 6; i++) {
        for (int a = 0; a < nums.length; a++) {
          if (nums[a] == i) {
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

  /**
   * Roll the die! Generate random number 1 <= x <= 6 and assign to value
   * Note that roll does NOT return the new value
   */
  public void roll() {
      
    this.value = (int)(Math.random() * 6) + 1;
  }  
  
  public String rollAndSummarize() {
    int[] arr = new int[5];
    for (int i = 0; i < arr.length; i++) {
        roll();
        getValue();
    }
    String s = summarize(arr);
    return s;
  }

  /**
   * Roll the die and return the new value
   * @return Die value
   */
  public int[] rollAndGetValues() {
    int[] arr = new int[5];
      for (int i = 0; i < arr.length; i++) {
        roll();
        getValue();
    }
    return arr;
  }
}

