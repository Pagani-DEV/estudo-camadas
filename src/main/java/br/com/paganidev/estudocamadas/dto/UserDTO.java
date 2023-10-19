package br.com.paganidev.estudocamadas.dto;

import br.com.paganidev.estudocamadas.entities.User;
import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String name;

    public UserDTO(User user){
        id = user.getId();
        name = user.getName();
    }

}
