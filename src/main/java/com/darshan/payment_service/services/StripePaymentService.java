package com.darshan.payment_service.services;

public class StripePaymentService implements PaymentService{
    public String createPaymentLink(String orderId) {
        return "https://stripe.com/" + orderId;
    }

    public String getPaymentStatus(String orderId) {
        return "SUCCESS";
    }
}
