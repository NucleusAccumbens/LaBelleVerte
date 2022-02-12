package com.company;

import Abstractions.AAnimal;
import Abstractions.IActor;
import Enums.AnimalsFoodTypes;
import Enums.BiomeTypes;
import Enums.InterspeciesRelationshipsTypes;
import Enums.KindsOfAnimals;
import Implementations.Animal;
import Implementations.ParrotActor;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        InterspeciesRelationshipsTypes relationshipsType = InterspeciesRelationshipsTypes.Травоядное;
        KindsOfAnimals kind = KindsOfAnimals.Попугай;
        BiomeTypes biomeType = BiomeTypes.Лесной;
        boolean reservoirNeed = false;
        int minLivingArea = 10;
        ArrayList<AnimalsFoodTypes> foods = new ArrayList<>(3);
        IActor actor = new ParrotActor();
        String name = "Люка";
        double amountOfFood = 35;

        Animal parrot = new Animal(relationshipsType, kind, biomeType, reservoirNeed,
                minLivingArea, foods, actor, name, amountOfFood);

        parrot.play();
        parrot.makeASound();
        parrot.doSomething();
    }
}
