package com.finastra.never_use_switch.step4_using_interface;

public class MailHappyBirthday implements MessageGenerator {
    @Override
    public int getMessageCode() {
        return 1;
    }

    @Override
    public String getMessage() {
        return "E-mail Happy Birthday";
    }
}
