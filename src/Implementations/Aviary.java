package Implementations;

import Abstractions.AAnimal;
import Abstractions.AAviary;
import Enums.BiomeTypes;
import java.util.ArrayList;

public class Aviary extends AAviary {

    private  int aviaryNumber;
    public int getAviaryNumber() { return  aviaryNumber; }
    public  void setAviaryNumber(int aviaryNumber) { this.aviaryNumber = aviaryNumber; }

    public Aviary(BiomeTypes biomeType, int enclosureArea, boolean reservoirExist, ArrayList<AAnimal> animals) {
        super(biomeType, enclosureArea, reservoirExist, animals);
    }
}
