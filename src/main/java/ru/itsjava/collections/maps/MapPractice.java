package ru.itsjava.collections.maps;


import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Man, Fruit> men = new HashMap<>();

        Man ivanov = new Man("Иванов");
        Man sidorov = new Man("Сидоров");
        Man javov = new Man("Джавов");
        Man petrov = new Man("Петров");
        Man durov = new Man("Дуров");

        Fruit tangerines = new Fruit("Мандарины", 9.56);
        Fruit oranges = new Fruit("Апельсины", 5.18);
        Fruit grapefruits = new Fruit("Грейпфрут", 13.24);
        Fruit lemons = new Fruit("Лемоны", 2.11);
        Fruit bergamot = new Fruit("Бергамот", 2.11);

        men.put(ivanov, tangerines);
        men.put(sidorov, oranges);
        men.put(javov, grapefruits);
        men.put(petrov, lemons);
        men.put(durov, bergamot);

        for (Map.Entry<Man, Fruit> pair : men.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println("--------------------------");
        System.out.println("В новый экземпляр HashMap добавим старую карту");

        Map<Man, Fruit> client = new HashMap<>();
        client.putAll(men);

        for (Map.Entry<Man, Fruit> pair : client.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println("--------------------------");
        System.out.println("Получение элемента по ключу (Получить любой фрукт по покупателю)");
        System.out.println("client.get(ivanov) = " + client.get(ivanov));
        System.out.println("--------------------------");
        System.out.println("Удаление элемента (Удалить любой фрукт)");
        System.out.println("client.remove(durov) = " + client.remove(durov));
        for (Man keyMan : client.keySet()) {
            System.out.println(keyMan + ":" + client.get(keyMan));
        }
        System.out.println("--------------------------");
        System.out.println("Проверка на наличие ключ и значение (Есть ли покупатель с таким фруктом)");
        System.out.println("client.containsKey(ivanov) = " + client.containsKey(ivanov));
        System.out.println("client.containsValue(oranges) = " + client.containsValue(oranges));
        System.out.println("--------------------------");
        System.out.println("Вывод Map на экран:\n" +
                "a) Вывести все ключи (всех покупателей)\n" +
                "б) Вывести все значения (все фрукты)\n" +
                "в) Вывести все ключи и значения с помощью entrySet (всех покупателей и фрукты)");
        System.out.println("client.keySet() = " + client.keySet());
        System.out.println("client.values() = " + client.values());
        System.out.println("client.entrySet() = " + client.entrySet());


//        men.put(ivanov, "футболка");
//        men.put(sidorov, "свитшот");
//        men.put(javov, "свитер");
//
//        for (Map.Entry<Man, String> pair : men.entrySet()) {
//            System.out.println(pair.getKey() + ": " + pair.getValue());
//        }
//
//        System.out.println("------------");
//        for (Man keyMan : men.keySet()) {
//            System.out.println(keyMan + ":" + men.get(keyMan));
//        }
//
//        System.out.println("men.remove(ivanov) = " + men.remove(ivanov));
//
//        System.out.println("After delete Ivanov");
//        for (Man keyMan : men.keySet()) {
//            System.out.println(keyMan + ":" + men.get(keyMan));
//        }
//
//        System.out.println("men.size() = " + men.size());
//        System.out.println("men.isEmpty() = " + men.isEmpty());
//
//        System.out.println("men.replace(javov, \"свитер\", \"перчатки\") = " + men.replace(javov, "свитер", "перчатки"));
//        System.out.println(men.get(javov));
//
//        men.clear();
//
//        System.out.println("men.size() = " + men.size());


    }
}
