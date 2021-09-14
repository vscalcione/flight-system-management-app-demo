package it.vscalcione.springboot.demoapplication.controller;

import it.vscalcione.springboot.demoapplication.exception.RecordAlreadyPresentException;
import it.vscalcione.springboot.demoapplication.exception.RecordNotFoundException;
import it.vscalcione.springboot.demoapplication.model.Airport;
import it.vscalcione.springboot.demoapplication.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/airport")
public class AirportController {

    @Autowired
    AirportService airportService;

    @GetMapping("/viewAirport/{id}")
    @ExceptionHandler(RecordNotFoundException.class)
    public Airport viewAirport(@PathVariable("id") String airportCode) {
        return airportService.getAirport(airportCode);
    }

    @GetMapping("/allAirports")
    public Iterable<Airport> viewAllAirports() {
        return airportService.getAllAirports();
    }

    @PostMapping("/addAirport")
    @ExceptionHandler(RecordAlreadyPresentException.class)
    public void addAirport(@RequestBody Airport airport) {
        airportService.addAirport(airport);
    }

    @PutMapping("/updateAirport")
    @ExceptionHandler(RecordNotFoundException.class)
    public void editAirport(@RequestBody Airport airport) {
        airportService.editAirport(airport);
    }

    @DeleteMapping("/deleteAirport/{id}")
    @ExceptionHandler(RecordNotFoundException.class)
    public void deleteAirport(@PathVariable("id") String airportCode) {
        airportService.removeAirport(airportCode);
    }
}
