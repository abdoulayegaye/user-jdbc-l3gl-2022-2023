package sn.exo.controller;

import sn.exo.entities.User;

import java.util.List;

public interface IUser {
    public int add(User u);
    public int update(User u);
    public int delete(int id);
    public List<User> list();
    public User get(int id);
}
