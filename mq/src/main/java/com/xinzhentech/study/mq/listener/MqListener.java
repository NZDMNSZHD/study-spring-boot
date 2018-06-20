package com.xinzhentech.study.mq.listener;

/**
* @author limingfeng@xinzhentech.com
* @since 2018/6/20 14:38
*
* @desc 消息队列监听接口
*/
public interface MqListener<T> {

    void listen(T t) throws Exception;
}
