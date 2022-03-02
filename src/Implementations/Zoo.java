package Implementations;

import Abstractions.AAnimal;
import Abstractions.AAviary;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Aviary> aviaries;
    public ArrayList<Aviary> getAviaries() { return  aviaries; }
    public void setAviaries(ArrayList<Aviary> aviaries) { this.aviaries = aviaries; }

    public Zoo(ArrayList<Aviary> aviaries) {
        this.aviaries = aviaries;
    }
}
