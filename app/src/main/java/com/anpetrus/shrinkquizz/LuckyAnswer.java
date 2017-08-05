package com.anpetrus.shrinkquizz;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Petrus on 05-08-2017.
 */

public class LuckyAnswer {

    private boolean isHappy;
    private boolean luckyDay;

    public LuckyAnswer(boolean isHappy) {
        this.isHappy = isHappy;
        this.luckyDay = new LuckyDate().isLuckyDay();
    }

    public boolean isHappy() {
        return isHappy;
    }

    public boolean isLuckyDay() {
        return luckyDay;
    }

    private class LuckyDate {

        public boolean isLuckyDay() {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
            int day = Integer.parseInt(simpleDateFormat.format(date));
            return day % 2 == 0?true:false;
        }
    }
}
