package com.finastra.never_use_switch.step3_using_factory_pattern;

public class MailWelcomeMessageGenerator extends MessageGenerator {

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
