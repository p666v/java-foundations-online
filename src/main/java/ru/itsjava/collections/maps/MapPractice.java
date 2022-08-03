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
        Man konovalov = new Man("Коновалов");
        Man zubov = new Man("Зубов");
        Man gil = new Man("Гиль");
        Man sergeev = new Man("Сергеев");
        Man kraev = new Man("Краев");
        Man kirilov = new Man("Кирилов");
        Man kravchenko = new Man("Кравченко");

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

        System.out.println("--------------------------");
        System.out.println("Отфильтровать Map вернуть записи по некоторому условию:\n" +
                "а) Условие на ключ: вернуть количество ключей длина которых больше 5 (покупателей, чье имя больше 5)\n" +
                "б) Условие на значение: Вернуть количество элементов, которые равны \"***\" (фруктов, которые равны мандарину)");
        client.put(durov, tangerines);
        client.put(konovalov, grapefruits);
        client.put(zubov, tangerines);
        client.put(gil, tangerines);
        client.put(sergeev, tangerines);
        client.put(kraev, oranges);
        client.put(kirilov, lemons);
        client.put(kravchenko, tangerines);

        int count = 0;
        for (Map.Entry<Man, Fruit> pair : client.entrySet()) {
            if (pair.getKey().getName().length() > 5) {
                count++;
                System.out.println(pair.getKey().getName());
            }
        }
        System.out.println("Покупателей, чье имя больше 5 = " + count);
        System.out.println();

        count = 0;
        for (Map.Entry<Man, Fruit> pair : client.entrySet()) {
            if (pair.getValue().getName().equals("Мандарины")) {
                count++;
                System.out.println(pair.getKey().getName() + ": " + pair.getValue().getName());
            }
        }
        System.out.println("Покупателей мандарин = " + count);

        System.out.println("--------------------------");
        System.out.println("Пропустить несколько элементов:\n" +
                "а) Пропустить 2 элемента, значения которых Мандарины, все остальные вывести\n" +
                "б) Вывести все кроме 2 элементов, ключи которых начинаются на К");
        count = 0;
        for (Map.Entry<Man, Fruit> pair : client.entrySet()) {
            if (pair.getValue().getName().equals("Мандарины")) {
                count++;
                if (count > 2) {
                    System.out.println(pair.getKey().getName() + ": " + pair.getValue().getName());
                }
            }
        }
        System.out.println();

        count = 0;
        for (Map.Entry<Man, Fruit> pair : client.entrySet()) {
            if (pair.getKey().getName().charAt(0) == 'К') {
                count++;
                if (count > 2) {
                    System.out.println(pair.getKey().getName() + ": " + pair.getValue().getName());
                }

            }
        }

        System.out.println("--------------------------");
        System.out.println("Вернуть первый подходящий элемент:\n" +
                "а) Возвращаем элемент значение которого арбуз или Мандарины или МАНдарины");
        for (Map.Entry<Man, Fruit> pair : client.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("МАНдарины")) {
                System.out.println(pair.getKey().getName() + ": " + pair.getValue().getName());
                break;
            }
        }

        System.out.println("--------------------------");
        System.out.println("Возвращаем все элементы удовлетворяющие условию:\n" +
                "а) Возвращаем все элементы в другую карту, которые являются апельсины");
        for (Map.Entry<Man, Fruit> pair : client.entrySet()) {
            System.out.println(pair.getKey().getName() + ": " + pair.getValue().getName());
        }
        System.out.println();

        Map<Man, Fruit> orange = new HashMap<>();
        for (Map.Entry<Man, Fruit> pair : client.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("апельсины")) {
                orange.put(pair.getKey(), pair.getValue());
            }
        }
        for (Map.Entry<Man, Fruit> pair : orange.entrySet()) {
            System.out.println(pair.getKey().getName() + ": " + pair.getValue().getName());
        }

        System.out.println("--------------------------");
        System.out.println("Найти средний вес всех фруктов.");
        double sum = 0;
        for (Map.Entry<Man, Fruit> pair : client.entrySet()) {
            sum += pair.getValue().getMass();
        }
        System.out.println("Средний вес фруктов: " + sum / client.size());




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
