package com.kinoafisha.siteKino.service;

import com.kinoafisha.siteKino.model.UsersModel;
import com.kinoafisha.siteKino.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersService {


    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UsersModel registerUser(String login, String password)
    {
        UsersModel usersModelInDb = usersRepository.findByLogin(login);
        if(usersModelInDb != null)
        {
            String loginInDb = usersModelInDb.getLogin();
            System.out.println(loginInDb);
            return null;
        } else
        {
            UsersModel usersModel = new UsersModel();
            usersModel.setLogin(login);
            usersModel.setPassword(password);
            return usersRepository.save(usersModel);
        }
    }

    public UsersModel authenticate(String login, String password){
        return usersRepository.findByLoginAndPassword(login,password).orElse(null);
    }
}
