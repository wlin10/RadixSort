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
    double ans = (n/(Math.pow(10.0, col)));
    return ((int)(ans % 10));
  }
/*
return the number of digits in n.
length(0) -> 1
length(15) -> 2
length(-10) -> 2
length(5112) -> 4
*/
  public static int length(int n) {
    int ans = (Integer.toString(n).length());
    if (Integer.toString(n).charAt(0) == '-') {
      return (ans - 1);
    } else {
      return ans;
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

  }

  public static void radixSort(SortableLinkedList data) {

  }

}
