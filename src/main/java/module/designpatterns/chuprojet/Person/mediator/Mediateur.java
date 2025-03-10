package module.designpatterns.chuprojet.Person.mediator;

import module.designpatterns.chuprojet.Person.modal.Personnel;

public interface Mediateur {
    void envoyerMessage(String message, Personnel expediteur);
}

