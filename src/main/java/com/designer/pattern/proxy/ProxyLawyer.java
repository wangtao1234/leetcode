package com.designer.pattern.proxy;

public class ProxyLawyer implements ILawSuit {

    private ILawSuit iLawSuit;

    public ProxyLawyer(ILawSuit lawSuit) {
        this.iLawSuit = lawSuit;
    }

    @Override
    public void submit(String proof) {
        iLawSuit.submit(proof);
    }

    @Override
    public void defend() {
        iLawSuit.defend();
    }
}
