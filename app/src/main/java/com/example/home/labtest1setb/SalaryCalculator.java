package com.example.home.labtest1setb;

/**
 * Created by home on 6/20/2016.
 */
public class SalaryCalculator {

    private double basicSalary;
    private float medical;
    private float houseRent;

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setMedical(float medical) {
        this.medical = medical;
    }

    public void setHouseRent(float houseRent) {
        this.houseRent = houseRent;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public float getMedical() {
        return medical;
    }

    public float getHouseRent() {
        return houseRent;
    }

    public double calculateTotalSalary(){

        double absoluteMedicalAllowance = getBasicSalary()*(getMedical()/100);
        double absoluteHouseRent = getBasicSalary()*(getHouseRent()/100);

        double totalSalary = getBasicSalary()+absoluteMedicalAllowance+absoluteHouseRent;

        return totalSalary;
    }
}
