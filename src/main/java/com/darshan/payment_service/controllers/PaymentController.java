package com.darshan.payment_service.controllers;


import com.darshan.payment_service.dtos.CreatePaymentLinkRequestDto;
import com.darshan.payment_service.services.PaymentService;
import com.razorpay.RazorpayException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String createPaymentLink(@RequestBody CreatePaymentLinkRequestDto request) throws RazorpayException {
        String link = paymentService.createPaymentLink(request.getOrderId());

        return link;
    }
    @PostMapping("payment/webhook")
    public void createWebhookEvent(){
        return;
    }
}
