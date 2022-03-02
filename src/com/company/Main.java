package com.company;

import Abstractions.AAnimal;
import Abstractions.IActor;
import Enums.AnimalsFoodTypes;
import Enums.BiomeTypes;
import Enums.InterspeciesRelationshipsTypes;
import Enums.KindsOfAnimals;
import Implementations.Animal;
import Implementations.Aviary;
import Implementations.ParrotActor;
import Implementations.Zoo;
import Abstractions.AAviary;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<AAviary> aviaries = new ArrayList<AAviary>();
    Zoo zoo = new Zoo(aviaries);

    public static void main(String[] args) {

        System.out.println("Добро пожаловать в зоопарк LaBelleVerte! Чтобы зоопарк начал работу, создайте животных, вольеры и приступайте к расселению. \n" +
                "Нажмите '1', чтобы получить информацию о видах, которые могут обитать в зоопарке. \n" +
                "Нажмите '2', чтобы создать животноe. \n" +
                "Нажмите '3' чтобы создать вольер. \n");

        Scanner in = new Scanner(System.in);
        int startCommand = in.nextInt();

        if (startCommand == 1) {
            System.out.println("В зоопарке могут проживать следующие виды животных: \n" +
                    KindsOfAnimals.Рысь.toString() + "\n" +
                    KindsOfAnimals.Попугай.toString() + "\n" +
                    KindsOfAnimals.Кенгуру.toString());
        }
        else if (startCommand == 2) {

        }
        else  if (startCommand == 3) {

        }
        else System.out.println("Вы ввели неверную команду!");
    }
}
