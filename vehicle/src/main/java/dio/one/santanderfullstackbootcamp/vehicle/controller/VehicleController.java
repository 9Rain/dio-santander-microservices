package dio.one.santanderfullstackbootcamp.vehicle.controller;

import dio.one.santanderfullstackbootcamp.vehicle.model.Vehicle;
import dio.one.santanderfullstackbootcamp.vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/vehicles")
public class VehicleController {
    @Autowired
    private VehicleRepository vehicleRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vehicle create(@RequestBody Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Vehicle> list() {
        return vehicleRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Vehicle> findById(@PathVariable("id") Long id) {
        return vehicleRepository.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Vehicle update(@PathVariable Long id, @RequestBody Vehicle vehicle) {
        vehicle.setId(id);
        return vehicleRepository.save(vehicle);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        vehicleRepository.deleteById(id);
    }
}
