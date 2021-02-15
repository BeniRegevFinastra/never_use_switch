package com.finastra.never_use_switch.step2_abstract_class;

public abstract class AbstractMessageGenerator {
    private int messageCode = 0;

    public AbstractMessageGenerator() {
    }

    public AbstractMessageGenerator(int messageCode) {
        this.messageCode = messageCode;
    }

    public int getMessageCode() {
        return this.messageCode;
    }

    public void setMessageCode(int messageCode) {
        this.messageCode = messageCode;
    }

    public abstract String getMessage();
}
