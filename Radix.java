import java.util.*;
public class Radix{
/*
get nth digit of an int, where 0 is the ones column, 1 is the tens column etc.
nth(123,1) -> 2
nth(-123,1) -> 2
nth(123,2) -> 1
nth(-123,2) -> 1
*/
  public static int nth(int n, int col) {
    if (col >= length(n)) {
      return 0;
    } else {
      double ans = (n/(Math.pow(10.0, col)));
      return ((int)(Math.abs(ans) % 10));
    }
  }
/*
return the number of digits in n.
length(0) -> 1
length(15) -> 2
length(-10) -> 2
length(5112) -> 4
*/
  public static int length(int n) {
    if (n == 0) {
      return 1;
    } else {
      return ((int)(Math.log10(Math.abs(n)) + 1));
    }
  }
/*
This requires your MyLinkedList file to be present locally, but please do not commit this extra file.
Merge all of the linked lists in the bucket array into your original linked list. The original may have elements, and those should be kept.
This is O(buckets.length) which should be 10 when we use this later.
The bucket[0] list will be merged first, then the bucket[1] etc.
Write and thoroughly test these methods!

Up until now, there are no methods that care about the contents of your MyLinkedList. It does NOT matter that they are Strings.
*/
  public static void merge(MyLinkedList original, MyLinkedList[]buckets) {
    for (int i = 0; i < buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[]buckets) {
    for (int i = 0; i < buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }

  public static void radixSortSimple(SortableLinkedList data) {
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for(int i = 0; i < 10; i++) {
      buckets[i] = new SortableLinkedList();
    }
    int largestLength = 1;
    int largestNum = 0;
    int dataLength = data.size();
    for (int i = 0; i < largestLength; i++) {
      for (int j = 0; j < dataLength; j++) {
        if (i == 0) {
          if (largestNum < data.get(0)) {
            largestNum = data.get(0);
          }
          if (j == dataLength - 1) {
            largestLength = length(largestNum);
          }
        }
        buckets[nth(data.get(0), i)].add(data.remove(0));
      }
      merge(data, buckets);
    }
  }

  public static void radixSort(SortableLinkedList data) {

  }

}
