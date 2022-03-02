package Abstractions;

import Enums.BiomeTypes;

import java.util.ArrayList;

public abstract class AAviary {

    private BiomeTypes biomeType;
    public BiomeTypes getBiomeType() { return biomeType; }
    public void setBiomeType(BiomeTypes biomeType) { this.biomeType = biomeType; }

    private int enclosureArea;
    public  int getEnclosureArea() { return  enclosureArea; }
    public  void  setEnclosureArea(int enclosureArea) {this.enclosureArea = enclosureArea; }

    private boolean reservoirExist;
    public  boolean getReservoirExist() { return reservoirExist; }
    public  void setReservoirExist(boolean reservoirExist) { this.reservoirExist = reservoirExist; }

    private ArrayList<AAnimal> animals;
    public  ArrayList<AAnimal> getAnimals() { return animals; }
    public void setAnimals(ArrayList<AAnimal> animals) { this.animals = animals; }

    public AAviary(BiomeTypes biomeType, int enclosureArea, boolean reservoirExist, ArrayList<AAnimal> animals) {
        this.biomeType = biomeType;
        this.enclosureArea = enclosureArea;
        this.reservoirExist = reservoirExist;
        this.animals = animals;
    }
}
