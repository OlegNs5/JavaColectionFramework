package ro.ctrln.java.colection.practice;

import ro.ctrln.java.colection.model.CarBrands;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class HashMaps {
    public static void main(String[] args) {

        Randomizer.randomizer();

        HashMap<Integer, CarBrands> brands = new HashMap<>();
        try {
            List<String> brandLines = Files.readAllLines(Paths.get("random-brands.txt"));
            for (String brandLine : brandLines) {
                String[] brandLineComponent = brandLine.split(","); //.split-dispica, se foseste la Array gen "String[]"
                brands.put(Integer.valueOf(brandLineComponent[0]), new CarBrands(brandLineComponent));
            }
            System.out.println("Hashmap-ul de marci este aici !");
            System.out.println(brands);

            ArrayList<CarBrands> carBrandsList = new ArrayList<>(brands.values());
            System.out.println("Lista de marci nearanjate:");
            System.out.println(carBrandsList);
            System.out.println("Lista de marci aranjate:");
            Collections.sort(carBrandsList, new Comparator<CarBrands>() {
                @Override
                public int compare(CarBrands carBrandOne, CarBrands carBrandTwo) {
                    return carBrandOne.getCarBrandName().compareTo(carBrandTwo.getCarBrandName());
                }
            });
            System.out.println(carBrandsList);

        } catch (Exception ex) {
            System.out.println("A aparut o exceptie! " + ex.getMessage());
            ex.printStackTrace();
        }

    }

}
