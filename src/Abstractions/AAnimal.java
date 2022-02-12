package Abstractions;

import Enums.AnimalsFoodTypes;
import Enums.BiomeTypes;
import Enums.InterspeciesRelationshipsTypes;
import Enums.KindsOfAnimals;

import java.util.ArrayList;

public abstract class AAnimal {

   private InterspeciesRelationshipsTypes interspeciesRelationshipsType;
   public InterspeciesRelationshipsTypes getInterspeciesRelationshipsType() {
        return interspeciesRelationshipsType;
   }

   private KindsOfAnimals kindOfAnimal;
   public KindsOfAnimals getKindOfAnimal() { return  kindOfAnimal; }

   private BiomeTypes biomeTypes;
   public BiomeTypes getBiomeTypes() {
       return biomeTypes;
   }

   private boolean reservoirNeed;
   public boolean getReservoirNeed() {
       return reservoirNeed;
   }

   private int minLivingArea;
   public int getMinLivingArea() {
       return minLivingArea;
   }

   private ArrayList<AnimalsFoodTypes> foods;
   public ArrayList<AnimalsFoodTypes> getFoods() {
       return foods;
   }

   private IActor iActor;

   public void makeASound() {
      this.iActor.makeASound();
   };

   public void doSomething() {
      this.iActor.doSomething();
   };

   public void play() {
      this.iActor.play();
   };

    public AAnimal
           (InterspeciesRelationshipsTypes interspeciesRelationshipsType, KindsOfAnimals kindOfAnimal, BiomeTypes biomeTypes,
            boolean reservoirNeed, int minLivingArea, ArrayList<AnimalsFoodTypes> foods, IActor iActor) {
       this.interspeciesRelationshipsType = interspeciesRelationshipsType;
       this.kindOfAnimal = kindOfAnimal;
       this.biomeTypes = biomeTypes;
       this.reservoirNeed = reservoirNeed;
       this.minLivingArea = minLivingArea;
       this.foods = foods;
       this.iActor = iActor;
   }
}
