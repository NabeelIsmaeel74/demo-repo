package subj;

import observ.Observer;

public interface Subject {
    public  void addUser( Observer observer) ;
    public  void removeUser (Observer observer) ;
    public void notyfyUser(String message) ;
}
