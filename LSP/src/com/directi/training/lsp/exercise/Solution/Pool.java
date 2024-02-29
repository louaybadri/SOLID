package com.directi.training.lsp.exercise.Solution;

public class Pool {
    public void run() {
        Duck donaldDuck = new Duck();
        Duck donaldDuck2 = new Duck();
        quack(donaldDuck, donaldDuck2);
        swim(donaldDuck, donaldDuck2);
    }

    private void quack(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.swim();

        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
