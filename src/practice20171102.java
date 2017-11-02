public class practice20171102 {

    public static void main(String[] args){
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("請輸入體重");
    int weight = sc.nextInt();

    if (weight>=80)
    {
        System.out.println("體重過重，請減重");
    }
    else
        if (weight<50)
        {
        System.out.println("體重過輕，請增重");
        }
        else
            {
                System.out.println("體重正常，請保持");
            }

        System.out.println("多吃蔬果，有益身體健康");


}
}
