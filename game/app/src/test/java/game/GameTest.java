package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    Game game = new Game("MAKERS");
    String word = "MAKERS";
    assertEquals(game.getWordToGuess(word), "M_____");
  }

@Test public void testMakersWordToGuess() {
  Game game = new Game("MAKERS");
  String word = "MAKERS";
  assertEquals(game.getWordToGuess(word), "M_____");
}
}
