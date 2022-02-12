package Implementations;

import Abstractions.IActor;

import java.util.Scanner;

public class ParrotActor implements IActor {
    @Override
    public void makeASound() {
        System.out.println("Я красивый и умный попугай!");
    }

    @Override
    public void doSomething() {
        System.out.println("Смотрюсь в зеркало...");
    }

    @Override
    public void play() {
        Scanner in = new Scanner(System.in);
        System.out.print("Скажи что-ибудь: ");
        String words = in.nextLine();
        System.out.println("Ты сказал(а):" + " " + words);
        in.close();
    }
}
