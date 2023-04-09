package it.revo.restaranserver.repository;

import it.revo.restaranserver.entity.Zakaz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.UUID;

// @CrossOrigin("https://restaurant-web-client.vercel.app")
public interface ZakazRepository extends JpaRepository<Zakaz, UUID> {
}
