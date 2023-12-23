package observ;

import subj.Subject;

import java.util.HashMap;

public class user implements  Observer{
    private int ID  ;
    private HashMap<Integer , String> groups ;

    public user(int id) {
        this.ID = id ;
        groups= new HashMap<>() ;
    }

    @Override
    public void update(int groupID, String message) {
        groups.put(groupID , message) ;
    }

    @Override
    public void clearGroup(int groupID) {
        groups.remove(groupID) ;
    }

    public void openGroup(int groupID) {
        if (groups.containsKey(groupID))
            System.out.println(groups.get(groupID)) ;
        else
            System.out.println("The user with ID : " + this.ID + " is not exist in the group " + groupID  );
        System.out.println("\n");
    }

    public boolean userIngGroup(int groupID) {
        if (groups.containsKey(groupID))
            return  true ;
        return  false ;
    }

    public void joinGroup(int groupID) {
        groups.put(groupID  , new String()) ;
    }



}
