package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.binding.PassengerInfo;
import com.project.binding.TicketDetail;
import com.project.service.GoibiboService;

import reactor.core.publisher.Mono;

@RestController
public class GoibiboController {
	
	@Autowired
	private GoibiboService goibiboService;
	
	@PostMapping("/booking")
	public ResponseEntity<Mono<TicketDetail>> bookTicket(@RequestBody PassengerInfo passengerInfo){
				Mono<TicketDetail> ticketMono = goibiboService.bookTicket(passengerInfo);
		return new ResponseEntity<Mono<TicketDetail>>(ticketMono,HttpStatus.CREATED);
	}
	
	@GetMapping("/getTickets")
	public ResponseEntity<Mono<List<TicketDetail>>> getAllTickets(){
		Mono<List<TicketDetail>> ticket = goibiboService.getTicket();
		return new ResponseEntity<Mono<List<TicketDetail>>>(ticket,HttpStatus.OK);
	}
	
	@PutMapping("/updateTickets/{pnr}")
	public ResponseEntity<Mono<TicketDetail>> updateTicket(@PathVariable String pnr,@RequestBody PassengerInfo passengerInfo){
		Mono<TicketDetail> ticket = goibiboService.updateTicket(pnr, passengerInfo);
		return new ResponseEntity<Mono<TicketDetail>>(ticket,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteTicket/{pnr}")
	public ResponseEntity<String> deletTicket(@PathVariable String pnr){
		goibiboService.deleteTicket(pnr);
		return new ResponseEntity<String>("Ticket Deleted",HttpStatus.OK);
	}
	
	

}
