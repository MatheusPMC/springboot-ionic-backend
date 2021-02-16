package com.matheusprado.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.matheusprado.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfimationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
