package cn.com.java.experiment;

import cn.com.java.experiment.exception.RoseException;

public class Rose {
    private static int total = 600;

    public static int getTotal() {
        return total;
    }

    public void giveRose(int flowerNum) throws RoseException{
        if(flowerNum <= total && total != 0 && flowerNum > 0) {
            System.out.println("亲爱的，送你"+flowerNum+"朵玫瑰花!");
            total -= flowerNum;
        }else
            throw(new RoseException(flowerNum));
    }
}
