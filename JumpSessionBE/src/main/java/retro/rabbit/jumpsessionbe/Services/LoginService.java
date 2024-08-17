package retro.rabbit.jumpsessionbe.Services;

import org.springframework.beans.factory.annotation.Autowired;
import retro.rabbit.jumpsessionbe.Models.Admin;
import retro.rabbit.jumpsessionbe.Models.Login;
import retro.rabbit.jumpsessionbe.Models.UserBooks;
import retro.rabbit.jumpsessionbe.Respositories.AdminRepository;
import org.springframework.stereotype.Service;
import retro.rabbit.jumpsessionbe.Respositories.CheckOutRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private CheckOutRepository checkOutRepository;

    public Boolean LoginAdmin(Login login) {

        List<Admin> AdminList=adminRepository.findAll();

        for(int i=0;i<AdminList.size();i++){

            if(AdminList.get(i).getUsername().equals(login.username) && AdminList.get(i).getPassword().equals(login.password)){
                System.out.println(true);
                return true;
            }
        }

        return false;
    }

}
