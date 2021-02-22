package com.finastra.never_use_switch.step3_using_factory_pattern;

public class SmsPhoneVerificationMessageGenerator extends MessageGenerator {

    public SmsPhoneVerificationMessageGenerator(int messageCode) {
        super(messageCode);
    }

    public SmsPhoneVerificationMessageGenerator() {
        this.setMessageCode(4);
    }

    @Override
    public String getMessage() {
        return "SMS Phone Verification";
    }
}
