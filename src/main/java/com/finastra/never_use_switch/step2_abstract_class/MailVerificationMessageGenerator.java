package com.finastra.never_use_switch.step2_abstract_class;

public class MailVerificationMessageGenerator extends AbstractMessageGenerator {

    public MailVerificationMessageGenerator(int messageCode) {
        super(messageCode);
    }

    public MailVerificationMessageGenerator() {
        this.setMessageCode(3);
    }

    @Override
    public String getMessage() {
        return "E-mail Verification";
    }
}
