package com.ecom.priyapaytmpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ecom.priyapaytmpayment.model.PaytmDetail;

@SpringBootApplication
public class PriyaPaytmPaymentApplication {
@Bean
public PaytmDetail getpaytmDetail() {
	return new PaytmDetail();
}
	public static void main(String[] args) {
		SpringApplication.run(PriyaPaytmPaymentApplication.class, args);
	}

}
