package com.finastra.never_use_switch.step2_abstract_class;

public class SmsPhoneVerificationMessageGenerator extends AbstractMessageGenerator {

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
