package com.designer.pattern.template;

public abstract class LivePlay {

    /**
     * 模板方法
     */
    public final void seeLivePlay() {
        login();
        openRoom();
        startAudioAndVideoStream();
        pushVideoStream();
        stopAudioAndVideoStream();
        closeRoom();
    }

    /**
     * 通用的业务逻辑
     */
    private void login() {
        System.out.println("用户登录");
    }

    /**
     * 打开房间
     */
    public abstract void openRoom();

    /**
     * 打开音视频流
     */
    public abstract void startAudioAndVideoStream();

    /**
     * 关闭音视频流
     */
    public abstract void stopAudioAndVideoStream();

    /**
     * 关闭房间
     */
    public abstract void closeRoom();

    /**
     * 旁路推流，可以通过视频链接在浏览器中查看视频
     */
    public void pushVideoStream() {

    }



}
