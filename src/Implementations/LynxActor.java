package Implementations;

import Abstractions.IActor;

public class LynxActor implements IActor {

    @Override
    public void makeASound() {
        System.out.println("Аррррр");
    }

    @Override
    public void doSomething() {
        System.out.println("Показала коготочки");
    }

    @Override
    public void play() {
        System.out.println("Поймала мотылька"); // метод может быть изменён,
                                                // возможно с рысью можно будет поиграть в шахматы
    }
}
