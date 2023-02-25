package com.elpandor.userproject.dao;

import com.elpandor.userproject.exception.UserNotFoundException;
import com.elpandor.userproject.models.Users;
import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface IUserDao {
    /**
     * Find all users in the
     *
     * @return All the users list
     */
    public List<Users> findAll();

    /**
     * Find the user by ID passed in param
     * @param id
     * @return the user who has this ID
     */
    public Users findById(int id) throws UserNotFoundException;

    /**
     * Save the user in the database
     *
     * @param users
     */
    public Users create(Users users);
}
