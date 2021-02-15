package com.finastra.never_use_switch.step3_using_factory_pattern;

public class MailHappyBirthdayMessageGenerator extends AbstractMessageGenerator {
    public MailHappyBirthdayMessageGenerator() {
        this.setMessageCode(1);
    }

    public MailHappyBirthdayMessageGenerator(int messageCode) {
        super(messageCode);
    }

    @Override
    public String getMessage() {
        return "E-mail Happy Birthday";
    }
}
