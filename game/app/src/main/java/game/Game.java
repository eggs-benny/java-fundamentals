package game;

public class Game {
  public Game(String word) {
  }

  public static void main(String[] args) {
  }

  // public String getWordToGuess(String word) {
  //   StringBuilder sBuilder = new StringBuilder(word);

  //   for (int i = 1; i < word.length(); i++) {
  //     sBuilder.replace(i, word.length(), "_");
  //   }

  //   return sBuilder.toString();
  // }

  public String getWordToGuess(String word) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < word.length(); i++) {
      Character currentLetter = word.charAt(0);
      if (i == 0) {
        builder.append(currentLetter);
      } else {
        builder.append("_");
      }
    }
    return builder.toString();
  }
}
