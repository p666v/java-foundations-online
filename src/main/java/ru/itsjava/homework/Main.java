package ru.itsjava.homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // arraylist: создать список и добавить 2 мужчин
        System.out.println("Задача №1");

        List<Men> menList = new ArrayList<>();
        menList.add(new Men("Pavel", 41));
        menList.add(new Men("Sasha", 26));

        System.out.println(menList);
        System.out.println("___________________________________________________________");

        // arraysaslist: Создать список из элементов One, Two, Three
        // Добавить элемент Four
        // Заменить один из элементов на Four и вывести на экран
        System.out.println("Задача №2");

        List<String> stringList = Arrays.asList("One", "Two", "Three");
//        stringList.add("Four");
        stringList.set(0, "Four");

        System.out.println(stringList);
        System.out.println("___________________________________________________________");

        // immutablelists: Создать пустой список с помощью метода emptyList()
        // Проверить можно ли добавить туда элемент?
        // Создать список с помощью метода singletonList()
        // Проверить можно ли добавить туда элемент?
        // Создать копию списка с помощью метода copyOf()
        // Проверить можно ли добавить туда элемент?
        // Создать копию списка с помощью метода unmodifiableList()
        // Проверить можно ли добавить туда элемент?
        // Проверить можно ли добавить в исходный список элемент?
        // Создать копию списка с помощью метода nCopies()
        // Проверить можно ли добавить туда элемент?
        System.out.println("Задача №3");

        List<String> listEmpty = Collections.emptyList();
//        stringList1.add("Pavel");

        List<String> listSingleton = Collections.singletonList("OnlyOneElement");
//        stringList2.add("Element");

        List<Men> menList1 = List.copyOf(menList);
//        menList1.add(new Men("Viva", 39));

        List<String> stringList1 = new ArrayList<>();
        Collections.addAll(stringList1, "Hi", "By");
        List<String> listUnmodifiable = Collections.unmodifiableList(stringList1);
//        listUnmodifiable.add("New");
        stringList1.add("New");
        System.out.println(listUnmodifiable);

        List<String> nCopiesList = Collections.nCopies(4, "Hi");
//        nCopiesList.add("New");
        System.out.println(nCopiesList);
        System.out.println("___________________________________________________________");

        // enummap: создать EnumMap ключ -- день значение активность
        // положить по ключу несколько активностей и проверить, что они есть
        System.out.println("Задача №4");

        EnumMap<Weekday, String> activityMap = new EnumMap<>(Weekday.class);
        activityMap.put(Weekday.FRIDAY, "Basketball");
        activityMap.put(Weekday.SUNDAY, "Hiking");
        activityMap.put(Weekday.SATURDAY, "Karate");

        System.out.println(activityMap.containsKey(Weekday.FRIDAY));
        System.out.println(activityMap.containsValue("Basketball"));

        System.out.println(activityMap.containsKey(Weekday.SUNDAY));
        System.out.println(activityMap.containsValue("Hiking"));
        System.out.println("___________________________________________________________");

        // identityhashmap: Создать IdentityHashMap (тип строка-строка)
        // и добавить 2 разных элемента и одинаковые по значению (new String() и "")
        // вывести размер map
        System.out.println("Задача №5");

        IdentityHashMap<String, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put("language", "English");
        System.out.println(identityHashMap.size());
        identityHashMap.put(new String("language"), "English");
        System.out.println(identityHashMap.size());
        System.out.println("___________________________________________________________");

        // immutablemaps: Создать пустой список с помощью метода emptyMap()
        // Проверить можно ли добавить туда элемент?
        // Создать список с помощью метода singletonMap()
        // Проверить можно ли добавить туда элемент?
        // Создать копию списка с помощью метода Map.ofEntries()
        // Проверить можно ли добавить туда элемент?
        // Создать копию списка с помощью метода unmodifiableMap()
        // Проверить можно ли добавить туда элемент?
        // Проверить можно ли добавить в исходный список элемент?
        System.out.println("Задача №6");

        Map<String, String> mapEmpty = Collections.emptyMap();
//        mapEmpty.put("Pavel", "Hi");

        Map<String, String> mapSingleton = Collections.singletonMap("Key", "Value");
//        mapSingleton.put("Element", "One");

        Map<Long, String> longUserMap = Map.ofEntries(Map.entry(1L, "User A"), Map.entry(2L, "User B"));
//        longUserMap.put(3L, "User C");

        Map<Long, String> map = new HashMap<>();
        Map<Long, String> mapUnmodifiable = Collections.unmodifiableMap(map);
//        mapUnmodifiable.put(2L, "User B");
        map.put(1L, "User A");
        System.out.println(mapUnmodifiable);
        System.out.println("___________________________________________________________");

        // Создать LinkedHashMap (String Integer).
        // Добавить 5 элементов и взять entrySet.
        // Пробежаться итератором по множеству и вывести на экран элемент и ключ
        System.out.println("Задача №7");

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("User A", 1);
        linkedHashMap.put("User B", 2);
        linkedHashMap.put("User C", 3);
        linkedHashMap.put("User D", 4);
        linkedHashMap.put("User E", 5);

        Set<Map.Entry<String, Integer>> set = linkedHashMap.entrySet();
        System.out.println(set);
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key = " + entry.getKey() + ", " + "Value = " + entry.getValue());
        }
        System.out.println("___________________________________________________________");

        System.out.println("Задача №8");

        Map<Integer, String> map1 = new WeakHashMap<>();
        map1.put(41, "Pavel");

        Thread thread = new Thread(
                () -> {
                    while (map1.containsKey(30)) {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Thread is waiting...");
                        System.gc();
                    }
                });
        thread.start();
        System.out.println("Application is waiting...");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("___________________________________________________________");

        //Создать stack и queue с помощью ArrayDeque
        //Воспользоваться методами push pop и add remove
        // для добавления и удаления элементов
        System.out.println("Задача №9");

        Deque<String> stack = new ArrayDeque<>();
        Deque<String> queue = new ArrayDeque<>();

        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
        System.out.println("___________________________________________________________");

        // Создать очередь с именами с помощью PriorityQueue
        // Удалять и вывести имена с помощью метода remove ;)
        // Создать очередь с именами с помощью PriorityQueue в обратном порядке, используя Comparator
        // Удалять и вывести имена с помощью метода remove ;)
        System.out.println("Задача №10");

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Павел");
        priorityQueue.add("Сергей");
        priorityQueue.add("Иван");
        priorityQueue.add("Яна");
        priorityQueue.add("Анна");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
        System.out.println();

        PriorityQueue<String> reverseQueue = new PriorityQueue<>(Collections.reverseOrder());
        reverseQueue.add("Павел");
        reverseQueue.add("Сергей");
        reverseQueue.add("Иван");
        reverseQueue.add("Яна");
        reverseQueue.add("Анна");
        while (!reverseQueue.isEmpty()) {
            System.out.println(reverseQueue.remove());
        }
        System.out.println("___________________________________________________________");

        //Создать множества из enum day с помощью методов allOf noneOf и of
        System.out.println("Задача №11");

        EnumSet<Weekday> setAllOf = EnumSet.allOf(Weekday.class);
        System.out.println(setAllOf);

        EnumSet<Weekday> setNoneOf = EnumSet.noneOf(Weekday.class);
        System.out.println(setNoneOf);

        EnumSet<Weekday> setOf = EnumSet.of(Weekday.MONDAY);
        System.out.println(setOf);
        System.out.println("___________________________________________________________");

        // Создать 2 множества от Man, добавить несколько Man и сравнить множества через equals
        System.out.println("Задача №12");

        Set<Men> men1 = new HashSet<>();
        Collections.addAll(men1, new Men("Pavel", 41), new Men("Vova", 39));

        Set<Men> men2 = new HashSet<>();
        Collections.addAll(men2, new Men("Pavel", 41), new Men("Vova", 39));

        System.out.println(men1.equals(men2));
        System.out.println("___________________________________________________________");


        // Создать HashSet с типо Object, добавить несколько элементов с типом String
        // Создать обертку над ним с помощью checkedSet с типом String.class добавить элемент 10
        System.out.println("Задача №13");

        Set set1 = new HashSet<>();
        Collections.addAll(set1, "A", "B", "C");
        System.out.println(set1);

        Set checkedSet = Collections.checkedSet(set1, String.class);
//        checkedSet.add(10);
        System.out.println(checkedSet);
        System.out.println("___________________________________________________________");

        //Создать пустой список с помощью метода emptySet()
        //Проверить можно ли добавить туда элемент?
        //Создать список с помощью метода singleton()
        //Проверить можно ли добавить туда элемент?
        //Создать копию списка с помощью метода copyOf()
        //Проверить можно ли добавить туда элемент?
        //Создать копию списка с помощью метода unmodifiableSet()
        //Проверить можно ли добавить туда элемент?
        //Проверить можно ли добавить в исходный список элемент?
        System.out.println("Задача №14");

        Set<String> setEmpty = Collections.emptySet();
//        setEmpty.add("Pavel");

        Set<String> setSingleton = Collections.singleton("One");
//        setSingleton.add("Element");

        Set<String> setCopyOf = Set.copyOf(setSingleton);
//        setCopyOf.add("Two");

        Set<String> set3 =new HashSet<>();
        Set<String> setUnmodifiable = Collections.unmodifiableSet(set3);
//        setUnmodifiable.add("User B");
        set3.add("User A");
        System.out.println(setUnmodifiable);
        System.out.println("___________________________________________________________");

        // Создать LinkedHashSet и добавить разные элементы
        // и вывести на экран проверить, что все элементы
        // вывелись в порядке добавления
        System.out.println("Задача №15");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("10");
        linkedHashSet.add("20");
        linkedHashSet.add("30");
        linkedHashSet.add("40");
        linkedHashSet.add("50");
        System.out.println(linkedHashSet);
        System.out.println("___________________________________________________________");

        //Создать TreeSet
        //Добавить элементы  "1" , "4", "5", "7", "9", "3"
        //Вывести множество на экран
        //Вывести элемент больше 3 на экран
        //Вывести элемент меньше 3 на экран
        //создать множество в обратном порядке
        //возвращаем множество в котором все элементы больше или равны текущего
        System.out.println("Задача №15");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("4");
        treeSet.add("5");
        treeSet.add("7");
        treeSet.add("9");
        treeSet.add("3");
        System.out.println(treeSet);
        System.out.println(treeSet.higher("3"));
        System.out.println(treeSet.lower("3"));
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.tailSet("3"));
        System.out.println(treeSet.headSet("5"));


    }
}
