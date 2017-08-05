package com.anpetrus.shrinkquizz;

/**
 * Created by Petrus on 05-08-2017.
 */

public class MatchAnswer {
    private int userAge;
    private int loverAge;

    public MatchAnswer(int userAge, int loverAge) {
        this.userAge = userAge;
        this.loverAge = loverAge;
    }

    public int getUserAge() {
        return userAge;
    }

    public int getLoverAge() {
        return loverAge;
    }
}
