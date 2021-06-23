package com.andemar.javatest.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
