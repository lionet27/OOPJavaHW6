package homework.model.impl;
import homework.model.Command;
// import homework.model.Persister;


public class User implements Command{

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


    @Override
    public void save() {

        System.out.println("Save user: " + getName());
        
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + getName());
    }

   
}
