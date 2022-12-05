import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);
        int balance = 1500;
        int right =3;
        int select;

        while(right > 0){
            System.out.print("Kullanıcı adınızı giriniz:");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz:");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba,x bankasına hoş geldiniz!");

                do {
                    System.out.println("1-)Para yatırma\n  " +
                            "2-)Para çekme\n " +
                            "3-)Bakiye sorgulama\n" +
                            "4-) Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçin:");
                    select = input.nextInt();

                    switch (select) {

                        case 1: {
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        }
                        case 2: {
                            System.out.print("Para miktarı :");
                            int price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz");
                            } else {
                                balance -= price;
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("Bakiyeniz :" + balance);
                            break;
                        }

                    }

                }while(select != 4);
                System.out.println("Tekrar görüşmek üzere...");
                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre tekrar deneyiniz");
                if(right == 0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz");
                }
                else{
                    System.out.println("Kalan hakkınız:" +right);
                }
            }
        }
    }
}
