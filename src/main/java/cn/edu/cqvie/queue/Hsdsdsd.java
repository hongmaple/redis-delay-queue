package cn.edu.cqvie.queue;

import java.util.Date;

public class Hsdsdsd {

    public boolean gsfdsf(DelayMessage delayMessage){
        System.out.println(delayMessage.getDelayTime());
        Date date = new Date();
        if (delayMessage.getDelayTime()<= date.getTime()){
            System.out.println("上线"+"，上线时间："+delayMessage.getDelayTime()+",当前时间："+date.getTime());
        }
        return true;
    }
}
