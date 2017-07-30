//package swets_as_goods.JSON;
//
//import com.google.gson.Gson;
//import swets_as_goods.factory_patern.SweetsFactory;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class DescriptionGetter {
//    public static void main(String[] args) throws IOException {
//        Gson gson = new Gson();
//        SweetsFactory factory = new SweetsFactory();
//
////        gson.toJson(factory.makeMooMoo(), new FileWriter("/home/matsishin/Desktop/test.json"));
//
//        JSONObject jObj = new JSONObject(request.getParameter("mydata")); // this parses the json
//        Iterator it = jObj.keys(); //gets all the keys
//
//        while(it.hasNext())
//        {
//            String key = it.next(); // get key
//            Object o = jObj.get(key); // get value
//            session.putValue(key, o); // store in session
//        }
//    }
//}
