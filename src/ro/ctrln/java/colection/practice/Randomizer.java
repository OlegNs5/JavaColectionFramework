package ro.ctrln.java.colection.practice;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Randomizer {
    public static void main(String[] args) {
        randomizer();
    }

    public static void randomizer() {

        try {
            List<String> brands = Files.readAllLines(Paths.get("brands.txt"));
            Collections.shuffle(brands);//Aranjeaza intr-o ordine aliatoare

            int index = 1;
            StringBuilder randomBrandsContent = new StringBuilder();
            for (String brand : brands) {
                randomBrandsContent.append(index).append(",").append(brand).append("\n");
                index++;
            }
//            System.out.println(randomBrandsContent);
            Files.write(Paths.get("random-brands.txt"), randomBrandsContent.toString().getBytes());
        } catch (Exception ex) {
            System.out.println("A aparut o exceptie! " + ex.getMessage());
            ex.printStackTrace();
        }

    }
}
