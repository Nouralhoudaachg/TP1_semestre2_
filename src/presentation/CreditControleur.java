package presentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import service.CreditMetier;
import service.IMetier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditControleur  implements  IControleur{

    IMetier creditMetier;
    public IMetier  setCreditMetier(IMetier service){
        return this.creditMetier=service;
    }
    public void afficher_Mensualit√©(Long idCredit) throws Exception {
        var creditAvecMensualite=creditMetier.calculer_Mensualit√©(idCredit);
        System.out.println(creditAvecMensualite);
    }

}
