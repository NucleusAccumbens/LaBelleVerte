package Abstractions;

public interface IZooManager {
    void CreateAviary(AAviary aviary);
    void EditAviary(AAviary aviary);
    void RelocateAnimal(int aviaryNumber, AAnimal animal);
}
