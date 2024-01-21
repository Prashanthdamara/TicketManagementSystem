package com.project.service;

import java.util.List;

import com.project.binding.PassengerInfo;
import com.project.binding.TicketDetail;

import reactor.core.publisher.Mono;

public interface GoibiboService {
	
	public Mono<TicketDetail> bookTicket(PassengerInfo passengerInfo);
	
	public Mono<List<TicketDetail>> getTicket();
	
	
	public Mono<TicketDetail> updateTicket(String pnr,PassengerInfo passengerInfo);
	
	public void deleteTicket(String pnr);

}
