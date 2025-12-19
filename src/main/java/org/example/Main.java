package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

   public static void main(String[] args) {
      int count = 0;

      try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
         String line;

         while ((line = br.readLine()) != null) {
            if (CampCleanup.isFullyContained(line)) {
               count++;
            }
         }

         System.out.println("Liczba par, gdzie jeden zakres zawiera drugi: " + count);

      } catch (IOException e) {
         System.out.println("Błąd przy odczycie pliku: " + e.getMessage());
      }
   }
}
