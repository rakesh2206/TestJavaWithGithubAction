package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class TestWithGithubActionTest {

  @Test
   void printsWelcomeMessagesAndCount() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    TestWithGithubAction.main(new String[]{});

    String expectedOutput  = "Hello and welcome!\n" +
        "Hello and welcome Anju!\n" +
        "Hello and welcome Rakesh!\n" +
        "i = 1\n" +
        "i = 2\n" +
        "i = 3\n" +
        "i = 4\n" +
        "i = 5\n";

    assertEquals(expectedOutput, outContent.toString());
  }

  @Test
   void printsNothingWhenNoArgs() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    TestWithGithubAction.main(new String[0]);

    String expectedOutput  = "Hello and welcome!\n" +
        "Hello and welcome Anju!\n" +
        "Hello and welcome Rakesh!\n" +
        "i = 1\n" +
        "i = 2\n" +
        "i = 3\n" +
        "i = 4\n" +
        "i = 5\n";

    assertEquals(expectedOutput, outContent.toString());
  }
}
