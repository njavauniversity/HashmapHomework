package trymyself;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Test {


    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();
        map.put(18,"tehran");
        map.put(811,"mashhad");
        map.put(71,"esfahan");
        map.put(1024,"tabriz");
        map.putIfAbsent(51,"yazd");


        System.out.println("value e 811 ra midahad: "+map.get(811));
        System.out.println("hameye key ha va value hara midahad: "+map.clone());
        System.out.println(map.compute(18,(key,val)->val +"tehran"));//taghir dadane meghdare value or key

        System.out.println(map.computeIfAbsent(17,k->"munikh"));
        System.out.println("bool chek mikone key i k dadim has ya na: "+map.containsKey(17));
        System.out.println("bool chek mikone value i k dadim has ya na: "+map.containsValue("tehran"));

        System.out.println("neshan dahandeye (key=value)"+map.entrySet());
        //?????System.out.println(map.computeIfPresent(811,);????
        System.out.println(map.getOrDefault(211,"shiraz"));
        System.out.println("bool neshun mide k hashmap emptye ya na (empty=true else false): "+map.isEmpty());

        System.out.println("namayeshe key ha: "+map.keySet());
        //???System.out.println(map.merge());
        System.out.println("hazfe yek onsor bar hasbe key: "+map.remove(1024));
        System.out.println(map.get(1024));

        System.out.println("ba bool moshakhas mikone ke ba un key un valuee va hazf mikone: "+map.remove(811,"mashhad"));
        System.out.println(map.get(811));
        System.out.println(map.replace(18,"tehran","avnik"));
        System.out.println("neshun mide chand ta onsore hashmap darim:"+map.size());
        System.out.println("tamame value haro neshun mide"+map.values());


    }
}
