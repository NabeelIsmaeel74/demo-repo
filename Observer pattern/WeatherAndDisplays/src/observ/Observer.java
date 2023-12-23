package observ;

import subj.Subject;

public interface Observer {

    public  void update (double temperature , double  pressure , double humidity ) ;

    public void display() ;

    public void connect(Subject supplier) ;
    public void disconnect() ;
}
