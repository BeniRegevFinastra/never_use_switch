package com.finastra.never_use_switch.step2_abstract_class;

public class MailWelcomeMessageGenerator extends AbstractMessageGenerator {

    public MailWelcomeMessageGenerator(int messageCode) {
        super(messageCode);
    }

    public MailWelcomeMessageGenerator() {
        this.setMessageCode(2);
    }

    @Override
    public String getMessage() {
        return "Welcome aboard e-mail";
    }
}
