package homework.model.impl;

import homework.model.Command;
// import homework.model.User;

public class Persister implements Command{

    private final User user;

    public Persister(User user){
        this.user = user;
    }

    @Override
    public void save() {
        System.out.println("Save persister user: " + user.getName());
    }

    @Override
    public void report() {
        System.out.println("Report for persister user: " + user.getName());
    }
}
