package com.designer.pattern.template;

/**
 * 模板模式
 * 1.封装不变部分，扩展可变部分。
 * 2.提取了公共代码，便于维护。
 * 3.行为由父类控制，子类实现。
 */
public class TencentLivePlay extends LivePlay {

    @Override
    public void openRoom() {
        System.out.println("腾讯打开房间");
    }

    @Override
    public void startAudioAndVideoStream() {
        System.out.println("腾讯打开音视频流");
    }

    @Override
    public void stopAudioAndVideoStream() {
        System.out.println("腾讯关闭音视频流");
    }

    @Override
    public void closeRoom() {
        System.out.println("腾讯关闭房间");
    }

    @Override
    public void pushVideoStream() {
        super.pushVideoStream();
        System.err.println("腾讯进行旁路推流");
    }
}
