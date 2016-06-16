package com.busi.service;

import com.busi.interceptor.annotation.Loggable;
import com.busi.interceptor.annotation.SerialNumber;
import org.springframework.stereotype.Service;

/**
 * Created by wanglei on 16/6/16.
 */
@Service
public class AtomicServiceImpl implements AtomicService {

    @Override
    @Loggable(desc = "apiOne")
    public void doApiOne(@SerialNumber("hehe")String number,String other) {
        System.out.println("do api one");
    }

    @Override
    @Loggable(desc = "apiTwo")
    public void doApiTwo() {
        System.out.println("do api Exception");
//        System.out.println(2/0);
    }
}
