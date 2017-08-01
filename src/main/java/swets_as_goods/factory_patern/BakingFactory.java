package swets_as_goods.factory_patern;

import com.google.gson.Gson;
import swets_as_goods.JSON.BakingDTO;
import swets_as_goods.JSON.DescriptionNotFound;
import swets_as_goods.candy_implementations.CookiesInAPack;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;

abstract class BakingFactory {
    private static Gson gson = new Gson();
    static CookiesInAPack makeMariaCookies(){
     try {
         BakingDTO parsed = gson.fromJson(new FileReader("src/main/resources/Maria.json"), BakingDTO.class);

         CookiesInAPack cookiesInAPack=new CookiesInAPack();
     cookiesInAPack.setName(parsed.getName());
     cookiesInAPack.setWrapper(parsed.getContentDescription());
     cookiesInAPack.setContainPieces(parsed.getContainPieces());
     cookiesInAPack.setBakingTemperature(parsed.getBakingTemperature());
     cookiesInAPack.setEnergeticValue(parsed.getEnergeticValue());
     cookiesInAPack.setContentDescription(parsed.getContentDescription());
     cookiesInAPack.setPackageSizeGrammes(parsed.getPackageSizeGrammes());
     cookiesInAPack.setProducerRequisites(parsed.getProducerRequisites());
     cookiesInAPack.setProductionDate(LocalDate.now());
     cookiesInAPack.setStorageTimeInDays(parsed.getStorageTimeInDays());
     return cookiesInAPack;
     } catch (FileNotFoundException e) {
         throw new DescriptionNotFound("There no Maria cookies descriptions");
     }
 }
}
