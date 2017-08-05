package com.anpetrus.shrinkquizz;

/**
 * Created by Petrus on 05-08-2017.
 */

public class LuckyResult extends LuckyAnswer {

    public LuckyResult(boolean isHappy) {
        super(isHappy);
    }

    private String resultInput(){
        return isHappy()?"Esas es la actitud!":"Anímate!";
    }

    private String resultDay(){
        return isLuckyDay()?"y es tu día de suerte!":"vendrán mejores tiempos :)";
    }

    public String messageOfDay(){
        return resultInput()+" "+resultDay();
    }
}
