package it.vscalcione.springboot.demoapplication.service;

import it.vscalcione.springboot.demoapplication.model.Airport;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AirportService {
    Iterable<Airport> getAllAirports();
    Airport getAirport(String airportCode);
    ResponseEntity<?> addAirport(Airport airport);
    Airport editAirport(Airport airport);
    String removeAirport(String airportCode);
}
