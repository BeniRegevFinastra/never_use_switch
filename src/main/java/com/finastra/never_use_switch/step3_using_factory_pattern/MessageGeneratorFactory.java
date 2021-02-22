package com.finastra.never_use_switch.step3_using_factory_pattern;

public class MessageGeneratorFactory {
    public MessageGenerator makeMessageGenerator(int messageCode) {
        MessageGenerator newMessage = null;
        switch (messageCode) {
            case 1:
                return new MailHappyBirthdayMessageGenerator();
            case 2:
                return new MailWelcomeMessageGenerator();
            case 3:
                return new MailVerificationMessageGenerator();
            case 4:
                return new SmsPhoneVerificationMessageGenerator();
            default:
                System.out.println("message type " + messageCode + " is not recognized");
                return null;
        }
    }
}
