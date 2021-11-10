import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("Выберите действие");
        System.out.println("0 - выйти из программы");
        System.out.println("1 - добавить дом");
        System.out.println("2 - описать квартиру");
        System.out.println("3 - сравнить дома");
        System.out.println("4 - сравнить квартиры");
        System.out.println("5 - информация о квартире");
        System.out.println("6 - информация о доме");
        boolean work = true;
        Accounting account = new Accounting();
        Scanner input = new Scanner(System.in);
        while (work) {
            System.out.println("Выберите действие");
            int action = input.nextInt();
            switch (action) {
                case 0 -> {
                    work = false;
                }
                case 1 -> {
                    System.out.println("Введите номер дома, кол-во этажей и квартир");
                    int hnum = input.nextInt();
                    int fnum = input.nextInt();
                    int anum = input.nextInt();
                    account.createHome(hnum,fnum, anum);
                }
                case 2 -> {
                    System.out.println("Введите номер дома, этажа и квартиры");
                    int nh = input.nextInt();
                    int nf = input.nextInt();
                    int na = input.nextInt();
                    if (account.homes.containsValue(nh)) {
                        System.out.println("Введите площадь квартиры, кол-во жильцов и комнат");
                        int s = input.nextInt();
                        int p = input.nextInt();
                        int r = input.nextInt();
                        account.createApart(nh, nf, na, s, p, r);
                    }
                    else System.out.println("Нет дома с таким номером.");
                }
                    case 3 -> {
                    System.out.println("Введите номер дома");
                    int n1 = input.nextInt();
                    if (account.homes.containsValue(n1)) {
                        System.out.println("Введите номер дома");
                        int n2 = input.nextInt();
                        if (account.homes.containsValue(n2))
                            account.compareHome(n1, n2);
                        else System.out.println("Нет дома с таким номером.");
                    }
                    else System.out.println("Нет дома с таким номером.");

                    }
                case 4 -> {
                    System.out.println("Введите номер дома, этажа и квартиры");
                    int n1 = input.nextInt();
                    int nf1 = input.nextInt();
                    int na1 = input.nextInt();
                    if (account.homes.containsValue(n1)) {
                        System.out.println("Введите номер дома, этажа и квартиры");
                        int n2 = input.nextInt();
                        int nf2 = input.nextInt();
                        int na2 = input.nextInt();
                        if (account.homes.containsValue(n2))
                            account.compareApart(n1, nf1, na1, n2, nf2, na2);
                        else System.out.println("Нет дома с таким номером.");
                    }
                        else System.out.println("Нет дома с таким номером.");
                    }
                case 5 -> {
                    System.out.println("Введите номер дома, этажа и квартиры");
                    int nh = input.nextInt();
                    int nf = input.nextInt();
                    int na = input.nextInt();
                    if (account.homes.containsValue(nh))
                        account.homes.get(nh).floors.get(nf).aparts.get(na).Info();
                    else System.out.println("Нет дома с таким номером.");
                }
                case 6 -> {
                    System.out.println("Введите номер дома");
                    int n = input.nextInt();
                    if (account.homes.containsValue(n))
                        account.homes.get(n).Info();
                    else System.out.println("Нет дома с таким номером.");
                }
            }
        }
    }
}
