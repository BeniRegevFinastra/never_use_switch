package com.finastra.never_use_switch.step2_abstract_class;

public class MailHappyBirthdayMessageGenerator extends AbstractMessageGenerator {

    public MailHappyBirthdayMessageGenerator(int messageCode) {
        super(messageCode);
    }

    public MailHappyBirthdayMessageGenerator() {
        this.setMessageCode(1);
    }

    @Override
    public String getMessage() {
        return "E-mail Happy Birthday";
    }
}
