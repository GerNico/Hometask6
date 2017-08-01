//package swets_as_goods.JSON;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import swets_as_goods.Baking;
//import swets_as_goods.factory_patern.SweetsFactory;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.Writer;
//import java.util.Iterator;
//
//public class DescriptionGetter {
//    public static void main(String[] args) throws IOException {
////        Gson gson = new Gson();
//        CandyDTO recept1=new CandyDTO();
////        System.out.println(gson.toJson(recept1));
//
////        gson.toJson(factory.makeMooMoo(), new FileWriter("/home/matsishin/Desktop/test.json"));
//        try (Writer writer = new FileWriter("Zebra.json")) {
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
//            gson.toJson(recept1, writer);
//        }
//
////        Gson gson = new Gson();
//
//// 1. JSON to Java object, read it from a file.
////        BakingDTO parsed = gson.fromJson(new FileReader("MooMoo.json"), BakingDTO.class);
////        System.out.println(parsed.equals(recept1));
//
//    }
//}
