package retro.rabbit.jumpsessionbe.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"Login\"")
public class Login {
    public String username;
    public String password;

}
