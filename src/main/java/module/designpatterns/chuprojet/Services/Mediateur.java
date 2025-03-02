package module.designpatterns.chuprojet.Services;

import module.designpatterns.chuprojet.Person.Personnel;

public interface Mediateur {
    void envoyerMessage(String message, Personnel expediteur);
}

