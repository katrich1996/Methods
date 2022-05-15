public class Main {
    public static void main(String[] args) {
        int year = 2017;
        int clientOS = 0;
        int clientDeviceYear = 2008;
        int deliveryDistance = 95;
        String str = "asdwwd";
        task1(year);
        task2(clientOS, clientDeviceYear);
        task3(deliveryDistance);
        task4(str);
    }
    public static void task1(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year. ");
        } else
            System.out.println(year + " isn't a leap year. ");
    }
    public static void task2(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Install an android version app using the link");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Install a lite version for IOS using the link");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Install an app for IOS using the link");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Install a lite version for android using the link");
        }
    }
    public static void task3(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("It will take 1 day");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("It will take 2 days");
        } else if (deliveryDistance >= 60 && deliveryDistance <=100) {
            System.out.println("It will take 3 days");
        }
    }
    public static void task4(String str) {
        for(int i = 0;i<str.length()-1;i++){
            if (str.charAt(i)==str.charAt(i+1)) {
                System.out.println("doubled symbol " +str.charAt(i));
                break;
            }
            if (i == str.length()-2){
                System.out.println("no doubles");
            }
        }
    }
}

