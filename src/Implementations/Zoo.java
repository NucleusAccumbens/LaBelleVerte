package Implementations;

import Abstractions.AAnimal;
import Abstractions.AAviary;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<AAviary> aviaries;
    public ArrayList<AAviary> getAviaries() { return  aviaries; }
    public void setAviaries(ArrayList<AAviary> aviaries) { this.aviaries = aviaries; }

    public Zoo(ArrayList<AAviary> aviaries) {
        this.aviaries = aviaries;
    }
}
