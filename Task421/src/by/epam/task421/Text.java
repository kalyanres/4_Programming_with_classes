package by.epam.task421;

public class Text {
  private Sentence[] sentences;

  public Text() {
  }

  public Text(Sentence[] sentences) {
    this.sentences = sentences;
  }

  public Sentence[] getSentences() {
    return sentences;
  }

  public void setSentences(Sentence[] sentences) {
    this.sentences = sentences;
  }

  // добавление предложения в конец текста
  public void addSentence(Sentence sentence) {
    Sentence[] sent = new Sentence[sentences.length + 1];
    for (int i = 0; i < sentences.length + 1; i++) {
      if (i < this.sentences.length)
        sent[i] = this.sentences[i];
    }
    sent[sentences.length] = sentence;
    sentences = sent;
  }
}

