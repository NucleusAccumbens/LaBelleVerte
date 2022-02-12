package Implementations;

import Abstractions.IActor;

public class KangarooActor implements IActor {
    @Override
    public void makeASound() {
        System.out.println("Ааа...ааа...ааа...ааааа");
    }

    @Override
    public void doSomething() {
        System.out.println("Прыг-прыг");
    }

    @Override
    public void play() {
        System.out.println("Тыщ..бум..бац");
    }
}
