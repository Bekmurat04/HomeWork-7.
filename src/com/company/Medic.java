package com.company;

public class Medic extends Hero implements HavingSuperAbility {


    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("хилит всех");
    }
}
