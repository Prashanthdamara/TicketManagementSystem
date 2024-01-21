package com.project.service.serviceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;

import com.project.binding.PassengerInfo;
import com.project.binding.TicketDetail;
import com.project.configuration.AppProperties;
import com.project.service.GoibiboService;

import reactor.core.Disposable;
import reactor.core.publisher.Mono;

@Service
public class GoibiboServiceImpl implements GoibiboService{

	@Autowired
	private AppProperties appProperties;
	
	@Override
	public Mono<TicketDetail> bookTicket(PassengerInfo passengerInfo) {
		Map<String, String> urls = appProperties.getUrl();
		String url = urls.get("bookurl");
		
		//String url = "http://localhost:8080/booking";
		
		WebClient client = WebClient.create();
					Mono<TicketDetail> ticketDetails = client.post()
					.uri(url)
					.bodyValue(passengerInfo)
					.retrieve()
					.bodyToMono(TicketDetail.class);
		return ticketDetails;
					                               
			
	}

	@Override
	public Mono<List<TicketDetail>> getTicket() {
		Map<String, String> urls = appProperties.getUrl();
		String url = urls.get("geturl");
		
		//String url = "http://localhost:8080/getAllTickets";
		
		WebClient client = WebClient.create();
		 Mono<TicketDetail[]> ticketDetails = client.get()	
							.uri(url)
							.retrieve()
							.bodyToMono(TicketDetail[].class);
							
		
		return ticketDetails.map(tickets -> Arrays.asList(tickets));
	}


	@Override
	public Mono<TicketDetail> updateTicket(String pnr, PassengerInfo passengerInfo) {
		Map<String, String> urls = appProperties.getUrl();
		String url = urls.get("updateurl");
		
		//String url = "http://localhost:8080/updateTicket/{pnr}";
		
		String requestUrl = url.replace("{pnr}", pnr);
		
		WebClient client = WebClient.create();
		Mono<TicketDetail> ticketDetail = client.put()
						.uri(requestUrl)
						.bodyValue(passengerInfo)
						.retrieve()
						.bodyToMono(TicketDetail.class);
						
		
		return ticketDetail;
	}

	@Override
	public void deleteTicket(String pnr) {
		
		Map<String, String> urls = appProperties.getUrl();
		String url = urls.get("deleteurl");
		
		//String url = "http://localhost:8080/deleteTicket/{pnr}";
		String requestUrl = url.replace("{pnr}", pnr);
		
		WebClient client = WebClient.create();
			client.delete()
			.uri(requestUrl)
			.retrieve()
			.toBodilessEntity()
			.subscribe();
		
	}
	
	
	
	

}
