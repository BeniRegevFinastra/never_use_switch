package com.finastra.never_use_switch.step4_using_interface;

public class SmsPhoneVerification implements MessageGenerator {
    @Override
    public int getMessageCode() {
        return 4;
    }

    @Override
    public String getMessage() {
        return "SMS Phone Verification";
    }
}
