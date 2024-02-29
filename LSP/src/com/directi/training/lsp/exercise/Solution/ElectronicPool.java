package com.directi.training.lsp.exercise.Solution;

public class ElectronicPool {
    public void run() {
        ElectronicDuck electroDuck = new ElectronicDuck();
        ElectronicDuck electroDuck1 = new ElectronicDuck();
        quack(electroDuck, electroDuck1);
        swim(electroDuck, electroDuck1);
    }

    private void quack(ElectronicDuck... ducks) {
        for (ElectronicDuck duck : ducks) {
            if (duck.is_on()) {

                duck.quack();
            }
        }
    }

    private void swim(ElectronicDuck... ducks) {
        for (ElectronicDuck duck : ducks) {
            if (duck.is_on()) {
                duck.swim();
            }
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
