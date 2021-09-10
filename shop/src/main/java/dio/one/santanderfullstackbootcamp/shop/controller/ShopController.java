package dio.one.santanderfullstackbootcamp.shop.controller;

import dio.one.santanderfullstackbootcamp.shop.model.Shop;
import dio.one.santanderfullstackbootcamp.shop.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/shops")
public class ShopController {
    @Autowired
    private ShopRepository shopRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Shop create(@RequestBody Shop shop) {
        return shopRepository.save(shop);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Shop> list() {
        return shopRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Shop> findById(@PathVariable("id") Long id) {
        return shopRepository.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Shop update(@PathVariable Long id, @RequestBody Shop shop) {
        shop.setId(id);
        return shopRepository.save(shop);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        shopRepository.deleteById(id);
    }
}
