package repositories;

import model.Client;
import model.Livrare;

import java.util.List;
import java.util.Optional;

public interface DeliveryRepository {

  void adaugaLivrare(Livrare livrare);
  Optional<Livrare> findByCode(String cod);
  List<Livrare> findByClient(Client client);
}
