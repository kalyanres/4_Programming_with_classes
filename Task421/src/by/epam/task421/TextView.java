package by.epam.task421;

public class TextView {

  Text text;

  public TextView() {
  }

  public TextView(Text text) {
    this.text = text;
  }

  public Text getText() {
    return text;
  }

  public void setText(Text text) {
    this.text = text;
  }

  public void showText() {
    for (int i = 0; i < text.getSentences().length; i++) {
      for (int j = 0; j < text.getSentences()[i].getSentence().length; j++) {
        System.out.print(text.getSentences()[i].getSentence()[j].getWord());
      }
    }
    System.out.println();
  }

  public void showTitle() {
    for (int i = 0; i < text.getSentences()[0].getSentence().length; i++)
      System.out.print(text.getSentences()[0].getSentence()[i].getWord());
    System.out.println();
  }
}
