package ru.itsjava.strings;

public class StringPractice {
    public static void main(String[] args) {
        String name = "Pavel";
        String copyName = "Pavel";
        System.out.println("(name == copyName) = " + (name == copyName));

        String constructorName = new String("Pavel");
        System.out.println("(constructorName == name) = " + (constructorName == name));
        String internConstructorName = constructorName.intern(); // перемещаем строку в пул строк
        System.out.println("(internConstructorName == name) = " + (internConstructorName == name));

        String str = "Я строка";

        System.out.println("str.length() = " + str.length()); // длина строки
        System.out.println("str.isEmpty() = " + str.isEmpty()); // проверка пустая или не пустая строка

        System.out.println("str.equals(\"Я строкА\") = " + str.equals("Я строкА")); //сравнение строк по содержимому
        System.out.println("str.equalsIgnoreCase(\"Я строкА\") = "
                + str.equalsIgnoreCase("Я строкА")); //сравнение по содержимому с игнорированием регистра
        System.out.println("str.charAt(5) = " + str.charAt(5)); //Возвращает символ по указанному индексу
        System.out.println("str.compareToIgnoreCase(\"Я строкА\") = "
                + str.compareToIgnoreCase("Я строкА")); //Сравнивает две строки лексически, игнорируя регистр букв
        System.out.println("str.concat(\", а не число\") = "
                + str.concat(", а не число")); //Объединяет указанную строку с данной строкой, путем добавления ее в конце.
        System.out.println("String.valueOf(52) = " + String.valueOf(52)); //Перевод объекта/примитива в строку

//        Методы с описанием:
//        1	char charAt(int index)
//        Возвращает символ по указанному индексу.
//        2	int compareTo(Object o)
//        Сравнивает данную строку с другим объектом.
//        3	int compareTo(String anotherString)
//        Сравнивает две строки лексически.
//        4	int compareToIgnoreCase(String str)
//        Сравнивает две строки лексически, игнорируя регистр букв.
//        5	String concat(String str)
//        Объединяет указанную строку с данной строкой, путем добавления ее в конце.
//        6	boolean contentEquals(StringBuffer sb)
//        Возвращает значение true только в том случае, если эта строка представляет собой ту же последовательность символов как указанно в буфере строки (StringBuffer).
//        7	static String copyValueOf(char[] data)
//        Возвращает строку, которая представляет собой последовательность символов, в указанный массив.
//        8	static String copyValueOf(char[] data, int offset, int count)
//        Возвращает строку, которая представляет собой последовательность символов, в указанный массив.
//        9	boolean endsWith(String suffix)
//        Проверяет заканчивается ли эта строка указанным окончанием.
//        10	boolean equals(Object anObject)
//        Сравнивает данную строку с указанным объектом.
//        11	boolean equalsIgnoreCase(String anotherString)
//        Сравнивает данную строку с другой строкой, игнорируя регистр букв.
//        12	byte getBytes()
//        Кодирует эту строку в последовательность байтов с помощью платформы charset, сохраняя результат в новый массив байтов.
//        13	byte[] getBytes(String charsetName
//        Кодирует эту строку в последовательность байтов с помощью платформы charset, сохраняя результат в новый массив байтов.
//        14	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
//        Копирует символы из этой строки в массив символов назначения.
//        15	int hashCode()
//        Возвращает хэш-код для этой строки.
//        16	int indexOf(int ch)
//        Возвращает индекс первого вхождения указанного символа в данной строке.
//        17	int indexOf(int ch, int fromIndex)
//        Возвращает индекс первого вхождения указанного символа в данной строке, начиная поиск с указанного индекса.
//        18	int indexOf(String str)
//        Возвращает индекс первого вхождения указанной подстроки в данной строке.
//        19	int indexOf(String str, int fromIndex)
//        Возвращает индекс первого вхождения указанной подстроки в данной строке, начиная с указанного индекса.
//        20	String intern()
//        Возвращает каноническое представление для строкового объекта.
//        21	int lastIndexOf(int ch)
//        Возвращает индекс последнего вхождения указанного символа в этой строке.
//        22	int lastIndexOf(int ch, int fromIndex)
//        Возвращает индекс последнего вхождения указанного символа в этой строке, начиная обратный поиск с указанного индекса.
//        23	int lastIndexOf(String str)
//        Возвращает индекс последнего вхождения указанной подстроки в данной строке.
//        24	int lastIndexOf(String str, int fromIndex)
//        Возвращает индекс последнего вхождения указанной подстроки в этой строке, начиная обратный поиск с указанного индекса.
//        25	int length()
//        Возвращает длину строки.
//        26	boolean matches(String regex)
//        Сообщает, соответствует ли или нет эта строка заданному регулярному выражению.
//        27	boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
//        Проверяет равны ли две области строки.
//        28	boolean regionMatches(int toffset, String other, int ooffset, int len)
//        Проверяет равны ли две области строки.
//        29	String replace(char oldChar, char newChar)
//        Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.
//        30	String replaceAll(String regex, String replacement)
//        Заменяет каждую подстроку строки, соответствующей заданному регулярному выражению с данной заменой.
//        31	String replaceFirst(String regex, String replacement)
//        Заменяет первые подстроки данной строки, которая соответствует заданному регулярному выражению с данной заменой.
//        32	String[] split(String regex)
//        Разделяет эту строку, окружая данным регулярным выражением.
//        33	String[] split(String regex, int limit)
//        Разделяет эту строку, окружая данным регулярным выражением.
//        34	boolean startsWith(String prefix)
//        Проверяет, начинается ли эта строка с заданного префикса.
//        35	boolean startsWith(String prefix, int toffset)
//        Проверяет, начинается ли эта строка с указанного префикса, начиная с указанного индекса.
//        36	CharSequence subSequence(int beginIndex, int endIndex)
//        Возвращает новую последовательность символов, которая является подпоследовательностью этой последовательности.
//        37	String substring(int beginIndex)
//        Возвращает новую строку, которая является подстрокой данной строки.
//        38	String substring(int beginIndex, int endIndex)
//        Возвращает новую строку, которая является подстрокой данной строки.
//        39	char[] toCharArray()
//        Преобразует эту строку в новый массив символов.
//        40	String toLowerCase()
//        Преобразует все символы в данной строке в нижний регистр, используя правила данного языкового стандарта.
//        41	String toLowerCase(Locale locale)
//        Преобразует все знаки в данной строке в нижний регистр, используя правила данного языкового стандарта.
//        42	String toString()
//        Этот объект (который уже является строкой!) возвращает себя.
//        43	String toUpperCase()
//        Преобразует все символы в строке в верхний регистр, используя правила данного языкового стандарта.
//        44	String toUpperCase(Locale locale)
//        Преобразует все символы в строке в верхний регистр, используя правила данного языкового стандарта.
//        45	String trim()
//        Возвращает копию строки с пропущенными начальными и конечными пробелами.
//        46	static String valueOf(primitive data type x)
//        Возвращает строковое представление переданного типа данных аргумента.

        StringBuilder builderStr = new StringBuilder(str);
        for (int i = 0; i < 10; i++) {
            builderStr.append('!'); //Преобразовывает переданный объект в строку и добавляет к текущей строке
        }
        System.out.println(builderStr.toString()); // переопределение строки
        System.out.println("builderStr.reverse() = " + builderStr.reverse()); //Разворачивает строку задом наперед

        builderStr.setCharAt(0, 'М'); //Изменяет символ строки, заданный индексом на переданный
        System.out.println(builderStr);

//        Методы:
//        StringBuilder append(obj)
//        Преобразовывает переданный объект в строку и добавляет к текущей строке
//        StringBuilder insert(int index, obj)
//        Преобразовывает переданный объект в строку и вставляет в текущую строку
//        StringBuilder replace(int start, int end, String str)
//        Заменяет часть строки, заданную интервалом start..end на переданную строку
//        StringBuilder deleteCharAt(int index)
//        Удаляет из строки символ под номером index
//        StringBuilder delete(int start, int end)
//        Удаляет из строки символы, заданные интервалом
//        int indexOf(String str, int index)
//        Ищет подстроку в текущей строке
//        int lastIndexOf(String str, int index)
//        Ищет подстроку в текущей строке с конца
//        char charAt(int index)
//        Возвращает символ строки по его индексу
//        String substring(int start, int end)
//        Возвращает подстроку, заданную интервалом
//        StringBuilder reverse()
//        Разворачивает строку задом наперед.
//        void setCharAt(int index, char)
//        Изменяет символ строки, заданный индексом на переданный
//        int length()
//        Возвращает длину строки в символах


    }
}
