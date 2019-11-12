package by.epam.task421;

public class Sentence {
  private Word[] sentence;

  public Sentence() {
  }

  public Sentence(Word[] sentence) {
    this.sentence = sentence;
  }

  public Word[] getSentence() {
    return sentence;
  }

  public void setSentence(Word[] sentence) {
    this.sentence = sentence;
  }
}
