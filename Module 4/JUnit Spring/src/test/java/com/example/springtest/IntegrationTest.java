

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class IntegrationTest {

    @Autowired
    UserRepository repository;

    @Test
    void testDatabase(){

        User user = new User(1L,"John");

        repository.save(user);

        User result = repository.findById(1L).orElse(null);

        assertNotNull(result);

        assertEquals("John",result.getName());
    }

}