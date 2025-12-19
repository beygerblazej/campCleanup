package org.example;

public class CampCleanup {
   public static boolean isFullyContained(String line) {
      // podział: "2-8,3-7"
      String[] parts = line.split(",");

      int[] first = parseRange(parts[0]);
      int[] second = parseRange(parts[1]);

      // sprawdzamy czy jeden zakres zawiera drugi
      return (first[0] <= second[0] && first[1] >= second[1]) ||
              (second[0] <= first[0] && second[1] >= first[1]);
   }

   private static int[] parseRange(String range) {
      String[] nums = range.split("-");
      return new int[] {
              Integer.parseInt(nums[0]),
              Integer.parseInt(nums[1])
      };
   }
}
