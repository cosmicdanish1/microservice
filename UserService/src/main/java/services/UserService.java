package services;

import entities.User;

import java.util.List;

public interface UserService {


    // Create
    User saveUser(User user);


    //Get All user
    List<User> getAllUser();

    // get single user of given userId

    User getUser(String userId);



    // delete
    //update
}
