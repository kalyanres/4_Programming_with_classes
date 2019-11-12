package by.epam.task421;

/*
 *
 *    1. Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Main {

  public static void main(String[] args) {

    Word[] word1 = new Word[2];
    // Method overloading
    word1[0] = new Word("Method ");
    word1[1] = new Word("overloading.\n ");

    Word[] word2 = new Word[14];
    // One of the important features in any programming language is the use of names.
    word2[0] = new Word("One ");
    word2[1] = new Word("of ");
    word2[2] = new Word("the ");
    word2[3] = new Word("important ");
    word2[4] = new Word("features ");
    word2[5] = new Word("in ");
    word2[6] = new Word("any ");
    word2[7] = new Word("programming ");
    word2[8] = new Word("language ");
    word2[9] = new Word("is ");
    word2[10] = new Word("the ");
    word2[11] = new Word("use ");
    word2[12] = new Word("of ");
    word2[13] = new Word("names. ");

    Word[] word3 = new Word[14];
    // When you create an object, you give a name to a region of storage.
    word3[0] = new Word("When ");
    word3[1] = new Word("you ");
    word3[2] = new Word("create ");
    word3[3] = new Word("an ");
    word3[4] = new Word("object, ");
    word3[5] = new Word("you ");
    word3[6] = new Word("give ");
    word3[7] = new Word("a ");
    word3[8] = new Word("name ");
    word3[9] = new Word("to ");
    word3[10] = new Word("a ");
    word3[11] = new Word("region ");
    word3[12] = new Word("of ");
    word3[13] = new Word("storage. ");

    Word[] word4 = new Word[8];
    //A method is a name for an action.
    word4[0] = new Word("A ");
    word4[1] = new Word("method ");
    word4[2] = new Word("is ");
    word4[3] = new Word("a ");
    word4[4] = new Word("name ");
    word4[5] = new Word("for ");
    word4[6] = new Word("an ");
    word4[7] = new Word("action. ");

    Sentence[] sentence = new Sentence[4];
    sentence[0] = new Sentence(word1);
    sentence[1] = new Sentence(word2);
    sentence[2] = new Sentence(word3);
    sentence[3] = new Sentence(word4);

    Text text = new Text(sentence);

    // вывод в консоль текста
    TextView textView = new TextView(text);
    textView.showText();

    // добавление текста
    Word[] wordAdd = new Word[10];
    // You refer to all objects and methods by using names.
    wordAdd[0] = new Word("You ");
    wordAdd[1] = new Word("refer ");
    wordAdd[2] = new Word("to ");
    wordAdd[3] = new Word("all ");
    wordAdd[4] = new Word("objects ");
    wordAdd[5] = new Word("and ");
    wordAdd[6] = new Word("methods ");
    wordAdd[7] = new Word("by ");
    wordAdd[8] = new Word("using ");
    wordAdd[9] = new Word("names. ");

    Sentence sentenceAdd = new Sentence(wordAdd);
    text.addSentence(sentenceAdd);
    textView.setText(text);

    // вывод в консоль текста с добавленным предложением
    textView.showText();

    // вывод в консоль заголовка текста
    textView.showTitle();

  }
}
