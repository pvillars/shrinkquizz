package com.anpetrus.shrinkquizz;

/**
 * Created by Petrus on 05-08-2017.
 */

public class MatchResult extends MatchAnswer {

    public MatchResult(int userAge, int loverAge) {
        super(userAge, loverAge);
    }

    private int processing(){
        return getUserAge() * getLoverAge() % 3;
    }

    public String compatibility(){
        switch (processing()){
            case 0:
                return "Les quedan 2 meses, de felicidad";
            case 1:
                return "Estan puro perdiendo tiempo, separence!!";
            case 2:
                return "Es un amor algo eterno, solo hasta que sepamos quien es Camila";
            default:
                return "Error de comparibilidad";
        }
    }
}
