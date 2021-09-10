package dio.one.santanderfullstackbootcamp.vehicle.repository;

import dio.one.santanderfullstackbootcamp.vehicle.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
