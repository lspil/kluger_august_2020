package repositories;

import model.Client;
import model.Livrare;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeliveryRepositoryImpl implements DeliveryRepository {
  private static DeliveryRepositoryImpl INSTANCE;

  private List<Livrare> livrari = new ArrayList<>();

  private DeliveryRepositoryImpl() {}

  public static DeliveryRepository getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new DeliveryRepositoryImpl();
    }
    return INSTANCE;
  }

  public void adaugaLivrare(Livrare livrare) {
    livrari.add(livrare);
  }

  public Optional<Livrare> findByCode(String cod) {
    return  livrari.stream()
            .filter(livrare -> livrare.getCod().equals(cod))
            .findFirst();
  }

  public List<Livrare> findByClient(Client client) {
    return livrari.stream()
            .filter(livrare -> livrare.getClient().equals(client))
            .collect(Collectors.toList());
  }
}
