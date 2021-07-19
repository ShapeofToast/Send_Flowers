package cn.com.java.experiment.exception;

import cn.com.java.experiment.Rose;

public class RoseException extends Exception{
    public RoseException(int flowerNum) {
        if (flowerNum < 0)
            System.out.println("玫瑰花数必须大于零！");
        else
            System.out.println("没钱买"+flowerNum+"支玫瑰花");
    }

}
