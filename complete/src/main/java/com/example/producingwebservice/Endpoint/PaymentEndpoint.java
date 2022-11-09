package com.example.producingwebservice.Endpoint;

import com.example.producingwebservice.DTO.GetPaymentResponse;
import com.example.producingwebservice.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PaymentEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private PaymentRepository paymentRepository;

	@Autowired
	public PaymentEndpoint(PaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPaymentRequest")
	@ResponsePayload
	public GetPaymentResponse getPayment(@RequestPayload GetPaymentRequest request) {
		GetPaymentResponse response = new GetPaymentResponse();
		response.setPayment(paymentRepository.findPayment(request.getPaymentId()));

		return response;
	}
}
