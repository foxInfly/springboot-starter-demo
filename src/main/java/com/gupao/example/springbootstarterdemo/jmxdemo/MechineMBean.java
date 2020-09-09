package com.gupao.example.springbootstarterdemo.jmxdemo;

//把需要发布出去的指标信息,通过MB来进行发布
public interface MechineMBean {


    //属性、  操作

    //1.获取CPU核数
    int getCpuCore();
    //2.获取空闲内存
    long getFreeMemory();
    //3.关闭
    void shutdown();
}
