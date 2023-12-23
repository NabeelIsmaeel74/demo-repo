package observ;

public interface Observer {
    public  void update (int groupID , String message) ;
    public void  clearGroup(int groupID) ;
}
