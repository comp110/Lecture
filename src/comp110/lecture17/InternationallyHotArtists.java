package comp110.lecture17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InternationallyHotArtists {

  public static void main(String[] args) {

    Set<String> usArtists, canadaArtists, japanArtists;
    usArtists = InternationallyHotArtists.readArtists("data/us-hot-50.txt");
    canadaArtists = InternationallyHotArtists.readArtists("data/canada-hot-50.txt");
    japanArtists = InternationallyHotArtists.readArtists("data/japan-hot-50.txt");

    // TODO: intersect each of the three sets

  }

  public static Set<String> readArtists(String chartFile) {
    // TODO: Create a Set object

    TextFileReader file = new TextFileReader(chartFile);
    while (file.hasNext()) {
      String line = file.next();

      int tildePosition = line.indexOf('~');
      String artist = line.substring(tildePosition + 1, line.length());

      // TODO: Remove this println and add the artist to our set
      System.out.println(artist);

    }

    return null;
  }

}