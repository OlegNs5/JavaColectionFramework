package ro.ctrln.java.colection.model;

import java.util.Objects;

public class CarBrands {
    private int carBrandID;
    private String carBrandName;

    public CarBrands(){};


    public CarBrands(String[] brandLineComponent) {
        this.carBrandID=Integer.parseInt(brandLineComponent[0]);
        this.carBrandName= brandLineComponent[1];
    }

    public int getCarBrandID() {
        return carBrandID;
    }

    public void setCarBrandID(int carBrandID) {
        this.carBrandID = carBrandID;
    }

    public String getCarBrandName() {
        return carBrandName;
    }

    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarBrands)) return false;
        CarBrands carBrands = (CarBrands) o;
        return getCarBrandID() == carBrands.getCarBrandID() && getCarBrandName().equals(carBrands.getCarBrandName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarBrandID(), getCarBrandName());
    }

    @Override
    public String toString() {
        return "CarBrands{" +
                "carBrandID=" + carBrandID +
                ", carBrandName='" + carBrandName + '\'' +
                '}';
    }
}
