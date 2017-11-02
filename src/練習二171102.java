public class 練習二171102 {

    public static void main(String[]args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入年紀");
        int age = sc.nextInt();

        if (age>=81)
        {
            System.out.println("你是個"+age+"歲的老妖怪");
        }
        else
            if (age>60)
            {
                System.out.println("你是個"+age+"歲的老年人");
            }
            else
                if (age>30)
                {
                    System.out.println("你是個"+age+"歲的壯年人");
                }
                else
                    if (age>=19)
                    {
                        System.out.println("你是個"+age+"歲的年輕人");
                    }
                    else
                        if (age==18)
                        {
                            System.out.println("恭喜你滿"+age+"歲成年囉");
                        }
                        else
                            if (age>=1)
                            {
                                System.out.println("你是個"+age+"歲的小屁孩");
                            }
                            else
                                if (age<=0)
                                {
                                    System.out.println("不符年紀");
                                }
    }

}
