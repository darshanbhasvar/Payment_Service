package com.darshan.payment_service.services;

import com.darshan.payment_service.dtos.CreatePaymentLinkRequestDto;
import com.razorpay.RazorpayException;

public interface PaymentService {
     String createPaymentLink(String orderId) throws RazorpayException;
    String getPaymentStatus(String orderId);
}
