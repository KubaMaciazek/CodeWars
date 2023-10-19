package org.example;

import java.util.Arrays;

public class Material {
    public static int material(int[] spaceship) {
        int currentMax = spaceship[0];
        int lastMaxPosition = 0;
        int[] prominence = new int[spaceship.length];
        prominence[0] = 0;

        for (int pos = 1; pos < spaceship.length; pos++) {
            prominence[pos] = currentMax - spaceship[pos];
            if (prominence[pos] < 0) {
                prominence[pos] = 0;
                currentMax = spaceship[pos];
                lastMaxPosition = pos;
            }
        }

        if (prominence[spaceship.length-1] > 0) {
            currentMax = spaceship[spaceship.length - 1];
            prominence[spaceship.length - 1] = 0;
            for (int pos = spaceship.length - 2; pos > lastMaxPosition; pos--) {
                prominence[pos] = currentMax - spaceship[pos];
                if (prominence[pos] < 0) {
                    prominence[pos] = 0;
                    currentMax = spaceship[pos];
                }
            }
        }

        return Arrays.stream(prominence).sum();
    }
}
