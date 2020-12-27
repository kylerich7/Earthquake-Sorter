import model.EarthQuakeParser;
import model.Location;
import model.QuakeEntry;
import model.comparators.DistanceComparator;
import model.comparators.MagnitudeComparator;
import model.comparators.SortByTitleAndDepthComparator;
import model.comparators.TitleLastAndMagnitudeComparator;

import java.util.ArrayList;
import java.util.Collections;

public class DifferentSorters {
  private final String source;
  EarthQuakeParser parser;
  ArrayList<QuakeEntry> list;

  public DifferentSorters() {
    source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
    // source = "data/earthquakeDataSampleSix1.atom"; //testing
    // source = "data/all_week.atom"; //data located at earthquake.usgs as of Dec 2020
    parser = new EarthQuakeParser();
    list = parser.read(source);
  }

  public void sortByMagnitude() {
    Collections.sort(list, new MagnitudeComparator());
    printQuakes();
  }

  public void sortByDistance(Location location) {
    Collections.sort(list, new DistanceComparator(location));
    printQuakes();
  }

  public void sortByTitleAndDepth() {
    Collections.sort(list, new SortByTitleAndDepthComparator());
    printQuakes();
  }

  public void sortByTitleLastAndMagnitude() {
    Collections.sort(list, new TitleLastAndMagnitudeComparator());
    printQuakes();
  }

  private void printQuakes() {
    for (QuakeEntry qe : list) {
      System.out.println(qe);
    }
  }
}
