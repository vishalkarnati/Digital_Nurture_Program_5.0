package Week1.DesignPatternsAndPrinciples.DecoratorPatternExample;

public class TestDecorator {

    public static void main(String[] args) {

        // Email only
        Notifier emailNotifier = new EmailNotifier();
        System.out.println("Email Only:");
        emailNotifier.send();
        System.out.println();

        // Email + SMS
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        System.out.println("Email + SMS:");
        smsNotifier.send();
        System.out.println();

        // Email + SMS + Slack
        Notifier fullNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        System.out.println("Email + SMS + Slack:");
        fullNotifier.send();
    }
}
