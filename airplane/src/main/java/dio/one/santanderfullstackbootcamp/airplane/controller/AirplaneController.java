package dio.one.santanderfullstackbootcamp.airplane.controller;

import dio.one.santanderfullstackbootcamp.airplane.controller.model.Airplane;
import dio.one.santanderfullstackbootcamp.airplane.repository.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/airplanes")
public class AirplaneController {
    @Autowired
    private AirplaneRepository airplaneRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Airplane create(@RequestBody Airplane airplane) {
        return airplaneRepository.save(airplane);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Airplane> list() {
        return airplaneRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Airplane> findById(@PathVariable("id") Long id) {
        return airplaneRepository.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Airplane update(@PathVariable Long id, @RequestBody Airplane airplane) {
        airplane.setId(id);
        return airplaneRepository.save(airplane);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        airplaneRepository.deleteById(id);
    }
}
