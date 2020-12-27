import model.Location;

public class Main {
  public static void main(String[] args) {
    DifferentSorters df = new DifferentSorters();
    // vancouver, BC
    Location vancouver = new Location(49.246292, -123.116226);
    System.out.println("Sort By Distance");
    df.sortByDistance(vancouver);
    System.out.println("\n\n Sort By Magnitude");
    df.sortByMagnitude();
    System.out.println("\n\n Sort By Title and Depth");
    df.sortByTitleAndDepth();
    System.out.println("\n\n Sort By Last Words of Title and Magnitude");
    df.sortByTitleLastAndMagnitude();
  }
}
