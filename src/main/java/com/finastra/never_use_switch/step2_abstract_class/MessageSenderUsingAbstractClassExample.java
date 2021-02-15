package com.finastra.never_use_switch.step2_abstract_class;

import java.util.Random;

/**
 * <div>
 *     <h2>Step 2: Using an <i>abstract Class</i></h2>
 *     <p>  Using an <i>abstract Class</i> will give us
 *          a start of Object Oriented thinking, and a
 *          little more flexibility.
 *     </p>
 *     <p>  This way is a very basic Object Oriented
 *          programming to perform the same operation
 *          in different ways, e.g. sending different
 *          message via e-mail, SMS, MMS, etc.
 *     </p>
 * </div>
 * @author Beni Regev
 */
public class MessageSenderUsingAbstractClassExample {
    private static final int MESSAGE_TYPES_COUNT = 4; // Number of possible/available messages

    private void send(String msg) {
        System.out.println(msg + " was sent");
    }

    public void generateMessage(int messageCode) {
        switch (messageCode) {
            case 1:
                send(new MailHappyBirthdayMessageGenerator().getMessage());
                break;
            case 2:
                send(new MailWelcomeMessageGenerator().getMessage());
                break;
            case 3:
                send(new MailVerificationMessageGenerator().getMessage());
                break;
            case 4:
                send(new SmsPhoneVerificationMessageGenerator().getMessage());
                break;
            default:
                System.out.println("message type " + messageCode + " is not recognized");
        }
    }
    public static void main(String[] args) {
        MessageSenderUsingAbstractClassExample example = new MessageSenderUsingAbstractClassExample();
        Random random = new Random();

        for(int i=0; i<20; i++) {
            int messageType = random.nextInt(MESSAGE_TYPES_COUNT) + 1;
            example.generateMessage(messageType);
        }
    }
}
