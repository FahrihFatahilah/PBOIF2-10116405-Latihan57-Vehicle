/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author Fahrih Fatahilah  
 */
class Bicycle extends Vehicle{
  private int myGearCount;

    public Bicycle() {
    System.out.println("Bicycle");
    super.setBrand("Trek Bike");
    System.out.println("Brand : " + super.getBrand());
    super.setModel("7.4Fx");
    System.out.println("Model : " + super.getModel());
    setGearCount(23);
    System.out.println("Jumlah Gear : " + getGearCount());
    System.out.println("");
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
 }