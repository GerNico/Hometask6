package swets_as_goods.factory_patern;

import swets_as_goods.candy_implementations.CookiesInAPack;

import java.time.LocalDate;

public class BakingFactory {
 public CookiesInAPack makeMariaCookies(){
     CookiesInAPack cookiesInAPack=new CookiesInAPack();
     cookiesInAPack.setName("Марія");
     cookiesInAPack.setWrapper("Печиво Марія. Унікальна рецептура.");
     cookiesInAPack.setContainPieces(12);
     cookiesInAPack.setBakingTemperature(120);
     cookiesInAPack.setEnergeticValue(399.0);
     cookiesInAPack.setContentDescription("борошно пшеничне, цукор, жир рослинний, " +
             "крохмаль кукурудзяний, молоко сухе знежирене, розпушувачі, сіль, " +
             "ароматизатор ванілін, кислота молочна. ");
     cookiesInAPack.setPackageSizeGrammes(200.0);
     cookiesInAPack.setProducerRequisites("вул. Щорса, 67,\n м. Житомир,\n 10003, Україна");
     cookiesInAPack.setProductionDate(LocalDate.now());
     cookiesInAPack.setStorageTimeInDays(45);
     return cookiesInAPack;
 }
}
