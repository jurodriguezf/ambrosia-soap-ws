package com.example.producingwebservice.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import com.example.producingwebservice.DTO.Payment;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class PaymentRepository {
	private static final Map<String, Payment> payments = new HashMap<>();

	@PostConstruct
	public void initData() {
		Payment payment1 = new Payment();
		payment1.setReceiptId("123456");
		payment1.setDate("11/11/2022");
		payment1.setUserId("1234");
		payment1.setAmount("14.500");
		payment1.setDescription("Description");

		payments.put(payment1.getReceiptId(), payment1);

		Payment payment2 = new Payment();
		payment2.setReceiptId("23489321");
		payment2.setDate("9/3/2021");
		payment2.setUserId("45631");
		payment2.setAmount("99.000");
		payment2.setDescription("Description");

		payments.put(payment2.getReceiptId(), payment2);

		Payment payment3 = new Payment();
		payment3.setReceiptId("849238430");
		payment3.setDate("1/12/2021");
		payment3.setUserId("7489237");
		payment3.setAmount("109.500");
		payment3.setDescription("Description");

		payments.put(payment3.getReceiptId(), payment3);
	}

	public Payment findPayment(String id) {
		Assert.notNull(id, "The country's name must not be null");
		return payments.get(id);
	}
}
