package com.finastra.never_use_switch.step4_using_interface;

public class MailWelcome implements MessageGenerator {
    @Override
    public int getMessageCode() {
        return 2;
    }

    @Override
    public String getMessage() {
        return "Welcome aboard e-mail";
    }
}
