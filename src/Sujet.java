package src;

public interface Sujet {
    void abonne(Observateur observateur);
    void notifie();
}