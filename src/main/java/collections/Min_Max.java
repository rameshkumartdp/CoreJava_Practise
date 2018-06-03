package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Min_Max
{
  public static void main(String args[])
  {
    ArrayList firstList = new ArrayList();
    firstList.add(50);
    firstList.add("hello");
    firstList.add(20);
    System.out.println("Elements firstList: " + firstList);

    System.out.println("Minimum value element firstList: " + Collections.min(firstList));
    System.out.println("Maximum value element firstList: " + Collections.max(firstList));

    ArrayList secondList = new ArrayList();
    secondList.add("five");
    secondList.add("two");
    secondList.add("six");
    System.out.println("\nElements secondList: " + secondList);

    System.out.println("Minimum value element secondList: " + Collections.min(secondList));
    System.out.println("Maximum value element secondList: " + Collections.max(secondList));
  }
}