package service;

import Modele.Credit;

public interface IMetier {
    public Credit calculer_Mensualit√©(Long idCredit) throws Exception;
}
