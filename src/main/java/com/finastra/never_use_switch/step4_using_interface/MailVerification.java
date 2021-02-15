package com.finastra.never_use_switch.step4_using_interface;

public class MailVerification implements MessageGenerator {
    @Override
    public int getMessageCode() {
        return 3;
    }

    @Override
    public String getMessage() {
        return "E-mail Verification";
    }
}
