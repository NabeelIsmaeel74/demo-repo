package subj;

import observ.Observer;

import java.util.ArrayList;
import java.util.List;

public class Group implements Subject{

    private int ID  ;
    private List<Observer> users ;

    public Group (int id ) {
        this.ID = id ;
        users= new ArrayList<>() ;
    }

    @Override
    public  void addUser( Observer observer){
        users.add(observer) ;

    }
    @Override
    public  void removeUser (Observer observer) {
        int idx = users.indexOf(observer);
        if (idx >=0 ) {
            users.get(idx).clearGroup(this.ID);
            users.remove(idx);
        }
    }

    @Override
    public void notyfyUser(String message) {
        int n = users.size() ;

        for (int i = 0 ; i < n ;i++) {
            users.get(i).update(this.ID , message);
        }
    }

    public void sendMessage(int userID , String message) {
        String newMessage = "user " + userID + " :\n  " + message ;
        notyfyUser(newMessage);
    }



}
