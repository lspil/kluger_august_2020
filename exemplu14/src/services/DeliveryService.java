package services;

import model.Client;
import model.Livrare;
import model.enums.StatusLivrare;
import repositories.ClientRepository;
import repositories.ClientRepositoryImpl;
import repositories.DeliveryRepository;
import repositories.DeliveryRepositoryImpl;

import java.util.List;
import java.util.Optional;

public class DeliveryService {

  private ClientRepository clientRepository = ClientRepositoryImpl.getInstance();
  private DeliveryRepository deliveryRepository = DeliveryRepositoryImpl.getInstance();

  public void adaugaLivrare(Livrare livrare) {
    Client client = livrare.getClient();

    livrare.setStatus(StatusLivrare.NEW);
    deliveryRepository.adaugaLivrare(livrare);
    clientRepository.incrementDeliveryNo(client);
  }

  public void preluareLivrare(String cod) {
    Optional<Livrare> livrare = deliveryRepository.findByCode(cod);
    livrare.ifPresent(liv -> liv.setStatus(StatusLivrare.IN_PROGRESS));
  }

  public void confirmareLivrare(String cod) {
    Optional<Livrare> livrare = deliveryRepository.findByCode(cod);
    Livrare liv = livrare.orElseThrow(() -> new RuntimeException());
    liv.setStatus(StatusLivrare.FINISHED);
  }

  public List<Livrare> findForClient(Client client) {
    return deliveryRepository.findByClient(client);
  }
}
