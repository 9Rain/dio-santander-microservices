package dio.one.santanderfullstackbootcamp.shop.repository;

import dio.one.santanderfullstackbootcamp.shop.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Long> {
}
