package Session7;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
//        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }
    public static void setDemo(){
        /**
         * Set :
         * HashSet(unordered) - LinkedHashSet(insertial order) - TreeSet(sorting order)
         */
        Set<String> fruits = new HashSet();
        fruits.add("Lemon");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Lemon");
//        fruits.add(100);
        fruits.remove("Apple");
        System.out.println(fruits.size());
        System.out.println(fruits);
        //1st Loop
//        Iterator i = fruits.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
        //2nd Loop

//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
        //3rd Loop
        fruits.forEach(x -> System.out.println(x));
    }
    public static void listDemo(){
        /**
         * List :
         *
         */
        List fruits = new ArrayList();
        fruits.add("Lemon");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Lemon");
        fruits.remove(1);
        //fruits.clear();
        System.out.println(fruits.size());
        System.out.println(fruits);
        //1st Loop
//        Iterator i = fruits.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }

        //2nd Loop
        for (var fruit : fruits) {
            System.out.println(fruit);
        }

        //3rd Loop
//        fruits.forEach(x -> System.out.println(x));
    }
    public static void queueDemo(){
        /**
         * Queue :
         *
         */
        Queue<String> fruits = new LinkedList();
        fruits.add("Lemon");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Lemon");
        //fruits.clear();
        System.out.println(fruits.size());
        System.out.println(fruits.peek());
        System.out.println(fruits.remove());
        System.out.println(fruits.size());
        System.out.println(fruits);
        //1st Loop
//        Iterator i = fruits.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }

        //2nd Loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //3rd Loop
//        fruits.forEach(x -> System.out.println(x));
    }
    public static void mapDemo(){
        /**
         * Map :
         * HashMap(unordered) - LinkedHashMap(insertial order) - TreeMap(sorting order)
         */
        Map<String,Integer> fruits = new HashMap();
//      Map fruits2 = new HashMap();
        fruits.put("Apple",100);
        fruits.put("Lemon",200);
        fruits.put("Orange",300);
        fruits.put("Banana",400);
        fruits.putIfAbsent("Apple",20);
//      fruits2.put("Fruits2",500);
//      fruits2.put("Fruits3",600);
//      fruits.putAll(fruits2);
        //fruits.clear();
        System.out.println(fruits.size());
        System.out.println(fruits);
        System.out.println("The Calories of Orange is : " + fruits.get("Orange"));
//        for (var fruit : fruits.entrySet()){
//            System.out.println("The Calories of fruit " + fruit.getKey() + " is : " + fruit.getValue());
//        }
        fruits.forEach((x,y) -> System.out.println("The Calories of fruit " + x + " is : " + y));
    }
}
