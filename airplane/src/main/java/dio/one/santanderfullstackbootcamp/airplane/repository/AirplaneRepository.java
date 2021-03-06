package dio.one.santanderfullstackbootcamp.airplane.repository;

import dio.one.santanderfullstackbootcamp.airplane.model.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneRepository extends JpaRepository<Airplane, Long> {
}
