package com.zen.blend.Service;

import com.zen.blend.Model.User;

public interface UserService {

    public void createUser(User user);
    public User getUser(Long id);
    public void deleteUser(Long id);

}
