import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //обучение
        int[] weights = new int[12];
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[1]);
        int january = 0;
        System.out.println(weights[january]);
        System.out.println();

        int[] bigBox = {5, 6, 12};
        for (int i : bigBox) {
            System.out.println(i);
        }
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));

        //эксперименты
        //Программа выясняет, какая циферка обозначает какой месяц.
        int[] month = new int[12];
        var monthName = "вообще не известно какой месяц";
        int monthInput = 7;
        int count = 0;
        while (count < month.length) {
            month[count] = count;
            count++;
        }
        switch (monthInput - 1) {
            case 0:
                monthName = "Январь";
                System.out.println("Месяц: " + month[monthInput - 1] + ". Это " + monthName + " мои чюваки...");
                break;
            case 1:
                monthName = "Февраль";
                break;
            case 2:
                monthName = "Март";
                break;
            case 3:
                monthName = "Апрель";
                break;
            case 4:
                monthName = "Май";
                break;
            case 5:
                monthName = "Июнь";
                break;
            case 6:
                monthName = "Июль";
                break;
            case 7:
                monthName = "Август";
                break;
            case 8:
                monthName = "Сентябрь";
                break;
            case 9:
                monthName = "Октябрь";
                break;
            case 10:
                monthName = "Ноябрь";
                break;
            case 11:
                monthName = "Декабрь";
                break;
            default:
                System.out.println("!!! Не верный ввод !!!");
        }
        System.out.println("Месяц: " + monthInput + ". Это " + monthName);
    }
}