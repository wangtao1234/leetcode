package com.designer.pattern.proxy;

public class ProxyFactory {

    public static ILawSuit getProxy() {
        return new ProxyLawyer(new SecondDogWang());
    }

    public static void main(String[] args) {
        ProxyFactory.getProxy().submit("工资流水在此");
        ProxyFactory.getProxy().defend();
    }
}
