package com.designer.pattern;


/**
 * 建造者模式
 * @author wangtao
 */
public class    Computer {

    /**
     * 必须
     */
    private String cpu;

    /**
     * 必须
     */
    private String ram;

    /**
     * 选填
     */
    private String usbCount;

    /**
     * 选填
     */
    private String keyboard;

    /**
     * 选填
     */
    private String display;


    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    public static class Builder {
        private String cpu;

        private String ram;

        private String usbCount;

        private String keyboard;

        private String display;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setUsbCount(String usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public static void main(String[] args) {
        Computer computer = new Builder("英特尔", "三星").setDisplay("aaaa").build();
    }
}




