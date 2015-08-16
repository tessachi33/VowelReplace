import org.junit.*;
import static org.junit.Assert.*;

public class VowelReplaceTest {

  @Test
  public void DoesSayHello() {
  VowelReplace testVowelReplace = new VowelReplace();
  String userInput = "Teresa";
  String answer  = "T-r-s-a";
  assertEquals(answer, testVowelReplace.outPut(userInput));

  }
