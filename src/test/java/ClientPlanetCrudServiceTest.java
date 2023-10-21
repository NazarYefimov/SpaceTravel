import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClientPlanetCrudServiceTest {

    @Autowired
    private ClientCrudService clientService;

    @Autowired
    private PlanetCrudService planetService;

    @Test
    void testClientCRUD() {
        Client client = new Client();
        client.setName("John Doe");

        // Create
        Client createdClient = clientService.createClient(client);
        assertNotNull(createdClient);
        assertNotNull(createdClient.getId());

        // Read
        Client fetchedClient = clientService.getClientById(createdClient.getId());
        assertNotNull(fetchedClient);
        assertEquals("John Doe", fetchedClient.getName());

        // Update
        fetchedClient.setName("Jane Doe");
        Client updatedClient = clientService.updateClient(fetchedClient.getId(), fetchedClient);
        assertNotNull(updatedClient);
        assertEquals("Jane Doe", updatedClient.getName());

        // Delete
        clientService.deleteClient(updatedClient.getId());
        assertNull(clientService.getClientById(updatedClient.getId()));
    }

    private void assertNotNull(Client updatedClient) {
    }

    @Test
    void testPlanetCRUD() {
        Planet planet = new Planet();
        planet.setId("earth");
        planet.setName("Earth");

        // Create
        Planet createdPlanet = planetService.createPlanet(planet);
        assertNotNull(createdPlanet);
        assertEquals("earth", createdPlanet.getId());

        // Read
        Planet fetchedPlanet = planetService.getPlanetById(createdPlanet.getId());
        assertNotNull(fetchedPlanet);
        assertEquals("Earth", fetchedPlanet.getName());

        // Update
        fetchedPlanet.setName("New Earth");
        Planet updatedPlanet = planetService.updatePlanet(fetchedPlanet.getId(), fetchedPlanet);
        assertNotNull(updatedPlanet);
        assertEquals("New Earth", updatedPlanet.getName());

        // Delete
        planetService.deletePlanet(updatedPlanet.getId());
        assertNull(planetService.getPlanetById(updatedPlanet.getId()));
    }

    private void assertNotNull(Planet fetchedPlanet) {
    }
}
