package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    UserRepository repository;

    @InjectMocks
    UserService service;

    @Test
    void testGetUserById(){

        User user = new User(1L,"Ezhil");

        when(repository.findById(1L)).thenReturn(Optional.of(user));

        User result = service.getUserById(1L);

        assertEquals("Ezhil",result.getName());
    }

    @Test
    void testUserNotFound(){

        when(repository.findById(5L))
                .thenReturn(Optional.empty());

        User user = service.getUserById(5L);

        assertNull(user);

    }
}