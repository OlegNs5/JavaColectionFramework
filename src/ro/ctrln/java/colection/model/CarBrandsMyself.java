package ro.ctrln.java.colection.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CarBrandsMyself {
    public static void main(String[] args) {carBrand();}

        private static void carBrand () {
            try {
                StringBuilder carBrands = new StringBuilder();

                List<String> brands = Files.readAllLines(Paths.get("brands.txt"));
                int index = 1;
                for (String brand : brands) {
                    carBrands.append(index).append(",").append(brand).append("\n");
                    index++;
                }
                Files.write(Paths.get("Car-Brands.txt"), carBrands.toString().getBytes());
                System.out.println(carBrands);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }

}


