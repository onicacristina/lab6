package com.company;

public class Main {

    public static void main(String[] args)
    {
        SubscriptionPlan plan = new SubscriptionPlan(450, "Plan B");
        FileUtility.writeToFile(plan);

        SubscriptionPlan subscriptionPlan = FileUtility.readFromFile();
        System.out.println(subscriptionPlan.toString());
    }
}
