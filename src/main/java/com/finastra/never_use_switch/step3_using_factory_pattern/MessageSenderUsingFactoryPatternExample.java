package com.finastra.never_use_switch.step3_using_factory_pattern;

import com.finastra.never_use_switch.step2_abstract_class.MailHappyBirthdayMessageGenerator;
import com.finastra.never_use_switch.step2_abstract_class.MailVerificationMessageGenerator;
import com.finastra.never_use_switch.step2_abstract_class.MailWelcomeMessageGenerator;
import com.finastra.never_use_switch.step2_abstract_class.SmsPhoneVerificationMessageGenerator;

import java.util.Random;

/**
 * <div>
 *     <h2>Step 4: Using an <i>Factory Design Pattern</i></h2>
 *     <p>  Using the <i>Factory Design Pattern</i> will
 *          give us more standard and well known design-pattern
 *          with all it's benefits: Unified coe, known design,
 *          Object-Oriented design, standardization, etc.
 *     </p>
 *     <p>  Involving Design-Patterns in resolving this challenge
 *          is a testimony for good thinking in the right way.
 *          You will score some credit point for using a known
 *          standard design pattern, if you are using the right
 *          one.
 *     </p>
 *     <p>
 *         <ul><h4>What is the Factory Design Pattern</h4>
 *            <li>When a method returns one of several possible classes that share a common super class.</li>
 *            <li>The class is chosen at runtime.</li>
 *         </ul>
 *         <div>
 *             For example:
 *             <div>Create a new enemy in a game.</div>
 *             <div>Random number generator picks a number assigned
 *                  to a specific enemy (class).</div>
 *             <div>The Factory returns the enemy associated with
 *                  that number.</div>
 *         </div>
 *         <div>sounds familiar?</div>
 *     </p>
 *     <p>
 *         <ul><h4>When To Use Factory Design Pattern?</h4>
 *             <li>When you don't know ahead of time what class object you need.</li>
 *             <li>When all of the potential classes are in the same subclass hierarchy.</li>
 *             <li>To centralize class selection code.</li>
 *             <li>When you don't want the user to have to know every class.</li>
 *             <li>To encapsulate object creation.</li>
 *         </ul>
 *     </p>
 *
 * </div>
 * @author Beni Regev
 */
public class MessageSenderUsingFactoryPatternExample {
    private static final int MESSAGE_TYPES_COUNT = 4; // Number of possible/available messages

    private void send(String msg) {
        System.out.println(msg + " was sent");
    }

    public void generateMessage(int messageCode) {
        switch (messageCode) {
            case 1:
//                send(new MailHappyBirthdayMessageGenerator().getMessage());
                break;
            case 2:
//                send(new MailWelcomeMessageGenerator().getMessage());
                break;
            case 3:
//                send(new MailVerificationMessageGenerator().getMessage());
                break;
            case 4:
//                send(new SmsPhoneVerificationMessageGenerator().getMessage());
                break;
            default:
                System.out.println("message type " + messageCode + " is not recognized");
        }
    }
    public static void main(String[] args) {
        MessageSenderUsingFactoryPatternExample example = new MessageSenderUsingFactoryPatternExample();
        Random random = new Random();

        for(int i=0; i<20; i++) {
            int messageType = random.nextInt(MESSAGE_TYPES_COUNT) + 1;
            example.generateMessage(messageType);
        }
    }
}
