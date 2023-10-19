package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class MaterialTest {

    @Test
    public void givenSpaceship010210132121_calculateMaterial_return6() {
        int actualResult = Material.material(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        int expectedResult = 6;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenSpaceship01021031012_calculateMaterial_return8() {
        int actualResult = Material.material(new int[]{0,1,0,2,1,0,3,1,0,1,2});
        int expectedResult = 8;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenSpaceship420325_calculateMaterial_return9() {
        int actualResult = Material.material(new int[]{4,2,0,3,2,5});
        int expectedResult = 9;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenSpaceship64203203145327530121346813_calculateMaterial_return83() {
        int actualResult = Material.material(new int[]{6,4,2,0,3,2,0,3,1,4,5,3,2,7,5,3,0,1,2,1,3,4,6,8,1,3});
        int expectedResult = 83;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenSpaceship621180550189694800_calculateMaterial_return50() {
        int actualResult = Material.material(new int[]{6,2,1,1,8,0,5,5,0,1,8,9,6,9,4,8,0,0});
        int expectedResult = 50;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}