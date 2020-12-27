package model.comparators;

import model.QuakeEntry;

import java.util.Comparator;

public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry> {

  public int compare(QuakeEntry qe1, QuakeEntry qe2) {
    String lastWord1 = qe1.getInfo().substring(qe1.getInfo().lastIndexOf(" ") + 1);
    String lastWord2 = qe2.getInfo().substring(qe2.getInfo().lastIndexOf(" ") + 1);
    if (lastWord1.compareTo(lastWord2) != 0) {
      return lastWord1.compareTo(lastWord2);
    }

    double mag1 = qe1.getMagnitude();
    double mag2 = qe2.getMagnitude();
    if (Double.compare(mag1, mag2) != 0) {
      return Double.compare(mag1, mag2);
    }

    return 0;
  }
}
