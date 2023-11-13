package Client;

import proxy.BanqueService;
import proxy.BanqueServiceService;
import proxy.Compte;

import java.util.List;

public class clientWS
{
    public static void main(String[] args)
    {
        BanqueService banqueService =new BanqueServiceService().getBanqueServicePort();
        System.out.println(banqueService.conversion(14));
        Compte compte=banqueService.getCompte(7);
        compte.setSode(500);
        System.out.println(compte.getCode()+" "+ compte.getSode());
        List<Compte>comptes = banqueService.getComptes();
        comptes.forEach(
                cp->
                {
                    System.out.println(cp.getCode()+" "+cp.getSode());
                }
        );
    }
}
