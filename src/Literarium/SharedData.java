package Literarium;


public class SharedData {
    private static String customerId;

    public static String getCustomerId() {
        return customerId;
    }

    public static void setCustomerId(String customerId) {
        SharedData.customerId = customerId;
    }
}

