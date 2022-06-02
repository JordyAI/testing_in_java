package com.jordy.javatest.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);

}
