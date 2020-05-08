package com.company;

import java.io.Serializable;

public class DepartmentEquipment implements Serializable {
    private String department;
    private String nameOfEquipment;
    private int amount;
    private double coast;

    public DepartmentEquipment(String department, String name, int amount, double coast){
        this.department = department;
        this.nameOfEquipment = name;
        this.amount = amount;
        this.coast = coast;
    }


    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getNameOfEquipment() {
        return nameOfEquipment;
    }

    public void setNameOfEquipment(String nameOfEquipment) {
        this.nameOfEquipment = nameOfEquipment;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public String toString(){
        return "Department " + this.department + "; Name of Equipment: " + this.nameOfEquipment +
                "; Amount: " + this.amount + "; Coast: " + this.coast;
    }


}
