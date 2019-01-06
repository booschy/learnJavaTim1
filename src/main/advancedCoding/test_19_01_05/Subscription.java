package main.advancedCoding.test_19_01_05;

public enum Subscription {

    PLURALSIGHT("Pluralsight", 300),

    UDEMY("Udemy", 400),

    LINKEDIN_LEARNING("LinkedIn Learning", 350),

    COURSERA("Coursera", 450);

    private int price;

    private String subscriptionName;
    Subscription(String subscriptionName, int price) {
        this.subscriptionName = subscriptionName;
        this.price = price;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public int getPrice() {
        return price;
    }
}
