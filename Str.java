import java.util.Locale;

public class Str {
    public static void main(String[] args) {
        //Написать метод для поиска самой длинной строки.
        String str = "ddddddddddd qqqqqq ffff";
        String e = "hjklkkррррррррррррррррррррррррр";
        String s = "s";
        if (str.length() > e.length() && e.length()>=s.length()) {
            System.out.print(str);
        }
        else if (e.length() > str.length() && str.length()>=s.length()) {
            System.out.print(e);
        }
        else if (s.length() > e.length() && e.length()>=str.length()) {
            System.out.print(s);
        }
        else if (s.length() == e.length() && e.length()==str.length()) {
            System.out.print("Все строки равны");
        }

        //Написать метод, который проверяет является ли слово палиндромом.
        System.out.println(Palindrom(""));
        System.out.println(Palindrom("abba"));
        System.out.println(Palindrom("abbaаа"));//выводим метод палидром, передая ему слово
        System.out.println(Palindrom("cdffdc"));

        //Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
        String str2 = "ddddddddddd qqqqqq ffff бяка полрпало вылоаыл бяка опл".replace("бяка", "[вырезано цензурой]");
        System.out.println(str2);

        //Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.

        System.out.println(howmuch("asf fog ji for fog", "fog"));
/// Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.

        String str7 = "This is a test string";
        String[] words = new StringBuilder(str7).reverse().toString().split(" "); //разделяем на слова и каждое переворачиваем
        StringBuilder newStr = new StringBuilder(); //создаем новый массив
        for (int i = words.length - 1; i >= 0; i--)
            newStr.append(words[i]).append(" "); //добавляем новые слова в новую строку
        System.out.println(newStr); //выводим перевернутую строку
    }
    
    public static boolean Palindrom(String text){
String text1 = text;
        StringBuffer text2 = new StringBuffer(text1).reverse(); //переворачиваем строку
        boolean result = true; //результат равен правде
        for(int i = 0; i<text1.length(); i++) {
            if (text1.charAt(i)!=text2.charAt(i)) //если буква 1 слова не равна букве в другом слове
                result = false; //выдаем ложь и прерываем
            break;
        }
        return result; //в противном случае выводим результат
    }
    public static int howmuch(String str4, String str5){
        int i = 0;
        int first = 0;
        while (first < str4.indexOf(str5, first)){ //пока вхождение подстроки будет больше 0, выполняем условие
            first = str4.indexOf(str5, first) +1;
            i++;
        }
        return i;
    }


}


