package model.comparators;

import model.QuakeEntry;

import java.util.Comparator;

public class SortByTitleAndDepthComparator implements Comparator<QuakeEntry> {

  public int compare(QuakeEntry qe1, QuakeEntry qe2) {
    String title1 = qe1.getInfo();
    String title2 = qe2.getInfo();
    if (title2.compareTo(title1) != 0) {
      return title1.compareTo(title2);
    }

    double depth1 = qe1.getDepth();
    double depth2 = qe2.getDepth();
    if (Double.compare(depth1, depth2) != 0) {
      return title1.compareTo(title2);
    }

    return 0;
  }
}
