@SpringBootTest
public class RepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    void testFindByName(){

        repository.save(new User(1L,"Ezhil"));

        List<User> users = repository.findByName("Ezhil");

        assertEquals(1,users.size());

    }

}