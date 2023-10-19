package br.com.paganidev.estudocamadas.services;

import br.com.paganidev.estudocamadas.dto.UserDTO;
import br.com.paganidev.estudocamadas.entities.User;
import br.com.paganidev.estudocamadas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    //readOnly true somente se for leitura
    @Transactional(readOnly = true)
    public UserDTO findById(Long id){
         User entity = repository.findById(id).get();
         UserDTO dto = new UserDTO(entity);
         return dto;
    }
}
