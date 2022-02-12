package Implementations;

import Abstractions.IActor;
import Abstractions.AAnimal;
import Enums.InterspeciesRelationshipsTypes;
import Enums.AnimalsFoodTypes;
import Enums.BiomeTypes;
import Enums.KindsOfAnimals;

import java.util.ArrayList;

public class Animal extends AAnimal {

    private String animalName;
    public String getAnimalName() {
        return animalName;
    }

    private double amountOfFood;
    public double getAmountOfFood() {
        return amountOfFood;
    }

    public Animal(InterspeciesRelationshipsTypes interspeciesRelationshipsType, KindsOfAnimals kindOfAnimal, BiomeTypes biomeTypes,
                  boolean reservoirNeed, int minLivingArea, ArrayList<AnimalsFoodTypes> foods, IActor iActor,
                  String animalName, double amountOfFood) {
        super(interspeciesRelationshipsType, kindOfAnimal, biomeTypes, reservoirNeed, minLivingArea, foods, iActor);
        this.amountOfFood = amountOfFood;
        this.animalName = animalName;
    }

}
