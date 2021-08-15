package week4;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Test;

public class CarPlatesDictionaryTest {
  CarPlatesDictionary dict = new CarPlatesDictionary();

  @Test
  public void findsShortestWordInCarPlate() {
    assertEquals("sort", dict.findShortestWord("RT 123 SO", List.of("sort", "google", "get", "ahead")));
    assertEquals("car", dict.findShortestWord("RC 10014", List.of("what", "is", "google", "car", "waymo")));
  }
}
