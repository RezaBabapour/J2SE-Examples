package dev;

public class PersianCat implements Persian, Cat {
    @Override
    public void speak() {
        System.out.println("mew mew ...");
    }

    @Override
    public void hunt() {
        System.out.println("hunt hunt ...");
    }

    @Override
    public void think() {
        System.out.println("think think ...");
    }

    @Override
    public void eat() {
        System.out.println("eat eat ...");
    }
}
