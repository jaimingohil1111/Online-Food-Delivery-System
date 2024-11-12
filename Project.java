import java.util.*;
import java.io.*;
            

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login ln =new Login();
        FoodChoice f = new FoodChoice();

        while (true) {
            System.out.println("|==================================================|");
            System.out.println("|------Welcome to Online Food Delivery System------|");
            System.out.println("| [1]. Create Account                              |");
            System.out.println("| [2]. Sign In                                     |");
            System.out.println("| [3]. Exit                                        |");
            System.out.println("|==================================================|");
            System.out.print("Enter your choice:- ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a username: ");
                    String createUsername = sc.nextLine();
                    System.out.print("Enter a password: ");
                    String createPassword = sc.nextLine();
                    ln.createUser(createUsername, createPassword);
                    break;
                case 2:
                    System.out.print("Enter your username: ");
                    String signInUsername = sc.nextLine();
                    System.out.print("Enter your password: ");
                    String signInPassword = sc.nextLine();
                    ln.signIn(signInUsername, signInPassword);
                    break;
                case 3:
                System.out.println("|==================================================|");
                    System.out.println("  Exiting...");
                    System.out.println("|==================================================|");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Login      
{
    String add;
    FoodChoice f = new FoodChoice();
    Scanner sc=new Scanner(System.in);
    HashMap<String, String> users = new HashMap<String, String>();

    boolean createUser(String username, String password) {
        if(!users.containsKey(username)) {
            users.put(username, password);
            System.out.println("|-----------------------------------------|");
            System.out.println("Account created successfully.");
            System.out.println("|-----------------------------------------|");

            return true;
        } else {
            System.out.println("|---------------------------------------------------|");
            System.out.println("Username already exists. Please choose another one.");
            System.out.println("|---------------------------------------------------|");
            return false;
        }
    }
    boolean signIn(String username, String password) {
        if(users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Sign-in successful. Welcome, " + username + "!");
            System.out.println("|-----------------------------------------|");
            System.out.println("Enter food delivery address:- ");
            add=sc.nextLine();
            System.out.println("your address added successful...");
            System.out.println("|-----------------------------------------|");

            
            f.fooditems();
            f.food();
            finalstage();
            return true;
        } else {
            System.out.println("Invalid username or password. Please try again.");
            return false;
        } 
    }
    void finalstage()
    {
        System.out.println("|------------------------------------------------------------------------|");
        System.out.println("Your final food delivery address is:- "+add);
        System.out.println("|------------------------------------------------------------------------|");
        System.out.println("|--------------------------Congratulations---------------------------------|");
        System.out.println("Your online food order will be deliver soon on your location...");
        System.out.println("|------------------------------------------------------------------------|");
        System.out.println("Thank you...");
        System.out.println("|------------------------------------------------------------------------|");
        System.exit(0);
    }
    
}


class FoodChoice {

    Double amt = 0.0;
    Scanner sc = new Scanner(System.in);
    ArrayList<String> pizzamenu = new ArrayList<String>();
    ArrayList<Double> pizzaprice = new ArrayList<Double>();

    ArrayList<String> burgermenu = new ArrayList<String>();
    ArrayList<Double> burgerprice = new ArrayList<Double>();

    ArrayList<String> sandwichmenu = new ArrayList<String>();
    ArrayList<Double> sandwichprice = new ArrayList<Double>();

    ArrayList<String> thalimenu = new ArrayList<String>();
    ArrayList<Double> thaliprice = new ArrayList<Double>();

    ArrayList<String> fastfoodmenu = new ArrayList<String>();
    ArrayList<Double> fastfoodprice = new ArrayList<Double>();

    ArrayList<String> drinksmenu = new ArrayList<String>();
    ArrayList<Double> drinksprice = new ArrayList<Double>();

    ArrayList<String> shakesmenu = new ArrayList<String>();
    ArrayList<Double> shakesprice = new ArrayList<Double>();

    ArrayList<String> icecreammenu = new ArrayList<String>();
    ArrayList<Double> icecreamprice = new ArrayList<Double>();

    ArrayList<String> gujaratspecialmenu = new ArrayList<String>();
    ArrayList<Double> gujaratspecialprice = new ArrayList<Double>();


    ArrayList<String> totalitems = new ArrayList<>();
    ArrayList<Double> total = new ArrayList<Double>();

    void fooditems() {
        pizzamenu.add("Marghrita");
        pizzamenu.add("Onion");
        pizzamenu.add("Tomato");
        pizzamenu.add("Golden Corn");
        pizzamenu.add("Paneer with capcicom,onion,peprika");
        pizzamenu.add("7-chesse");
        pizzamenu.add("Maharaja");

        pizzaprice.add(100.0);
        pizzaprice.add(120.0);
        pizzaprice.add(120.0);
        pizzaprice.add(120.0);
        pizzaprice.add(120.0);
        pizzaprice.add(120.0);
        pizzaprice.add(120.0);

        burgermenu.add("Veg aloo tikki");
        burgermenu.add("Veg Paneer");
        burgermenu.add("PeriPeri");
        burgermenu.add("Tanduri");
        burgermenu.add("Chesse");
        burgermenu.add("Maharaja");

        burgerprice.add(50.0);
        burgerprice.add(60.0);
        burgerprice.add(70.0);
        burgerprice.add(80.0);
        burgerprice.add(75.0);
        burgerprice.add(85.0);

        sandwichmenu.add("Veg");
        sandwichmenu.add("Aloo Mattar");
        sandwichmenu.add("Paneer masala");
        sandwichmenu.add("Veg Grill");
        sandwichmenu.add("Chesse");
        sandwichmenu.add("Bahubali");

        sandwichprice.add(50.0);
        sandwichprice.add(60.0);
        sandwichprice.add(70.0);
        sandwichprice.add(80.0);
        sandwichprice.add(90.0);
        sandwichprice.add(100.0);

        thalimenu.add("Gujarati");
        thalimenu.add("Panjabi");
        thalimenu.add("South Indian");
        thalimenu.add("Farali");

        thaliprice.add(100.0);
        thaliprice.add(150.0);
        thaliprice.add(160.0);
        thaliprice.add(100.0);

        fastfoodmenu.add("Dabeli");
        fastfoodmenu.add("VadaPav");
        fastfoodmenu.add("Puffe");
        fastfoodmenu.add("PavBhaji");

        fastfoodprice.add(20.0);
        fastfoodprice.add(20.0);
        fastfoodprice.add(20.0);
        fastfoodprice.add(60.0);

        drinksmenu.add("Pepsi");
        drinksmenu.add("CocaCola");
        drinksmenu.add("ThumsUp");
        drinksmenu.add("Limca");
        drinksmenu.add("Fanta");
        drinksmenu.add("Frooti");
        drinksmenu.add("Mazza");

        drinksprice.add(50.0);
        drinksprice.add(50.0);
        drinksprice.add(50.0);
        drinksprice.add(50.0);
        drinksprice.add(50.0);
        drinksprice.add(50.0);
        drinksprice.add(50.0);

        shakesmenu.add("Cold COCO");
        shakesmenu.add("Cold Coffee");
        shakesmenu.add("Chocolate Shake");
        shakesmenu.add("Mango Shake");
        shakesmenu.add("Hot Tea");
        shakesmenu.add("Hot Coffee");
        shakesmenu.add("DryFruit Shake");

        shakesprice.add(50.0);
        shakesprice.add(55.0);
        shakesprice.add(60.0);
        shakesprice.add(65.0);
        shakesprice.add(75.0);
        shakesprice.add(80.0);
        shakesprice.add(45.0);

        icecreammenu.add("Chocolate");
        icecreammenu.add("Vanila");
        icecreammenu.add("Mango");
        icecreammenu.add("Rose");
        icecreammenu.add("Oreo Browne");
        icecreammenu.add("Rajbhog");
        icecreammenu.add("Kesar Pista");
        icecreammenu.add("American DryFruits");

        icecreamprice.add(40.0);
        icecreamprice.add(40.0);
        icecreamprice.add(50.0);
        icecreamprice.add(60.0);
        icecreamprice.add(45.0);
        icecreamprice.add(55.0);
        icecreamprice.add(65.0);
        icecreamprice.add(60.0);
        icecreamprice.add(90.0);

        gujaratspecialmenu.add("Khaman Dhokla");
        gujaratspecialmenu.add("Samosa");
        gujaratspecialmenu.add("Bhajiya");
        gujaratspecialmenu.add("Sev Khamani");
        gujaratspecialmenu.add("Kachori");
        gujaratspecialmenu.add("Gathiya");
        gujaratspecialmenu.add("Fafda and Jalebi");

        gujaratspecialprice.add(40.0);
        gujaratspecialprice.add(20.0);
        gujaratspecialprice.add(30.0);
        gujaratspecialprice.add(35.0);
        gujaratspecialprice.add(20.0);
        gujaratspecialprice.add(50.0);
        gujaratspecialprice.add(65.0);
    }

    void food() {
        System.out.println("|========================================|");
        System.out.println("|----------------FOOD MENU---------------|");
        System.out.println("| [1].  Pizza                            |");
        System.out.println("| [2].  Burger                           |");
        System.out.println("| [3].  Sandwich                         |");
        System.out.println("| [4].  Thali                            |");
        System.out.println("| [5].  FastFood                         |");
        System.out.println("| [6].  Drinks                           |");
        System.out.println("| [7].  Shakes                           |");
        System.out.println("| [8].  Ice-cream                        |");
        System.out.println("| [9].  Gujarat's Special                |");
        System.out.println("| [10]. Display the Total BILL...        |");
        System.out.println("| [11]. Exit...                          |");
        System.out.println("|========================================|");
        System.out.print(" Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
                case 1:
                pizza();
                break;

                case 2:
                burger();
                break;

                case 3:
                sandwich();
                break;

                case 4:
                thali();
                break;

                case 5:
                fastfood();
                break;

                case 6:
                drinks();
                break;

                case 7:
                shakes();
                break;

                case 8:
                icecream();
                break;

                case 9:
                gujaratspecial();
                break;

                case 10:
                displayBill();
                break;

                case 11:
                System.exit(0);
                break;
                

            default:
                System.out.println("Enter a valid choice: ");
                break;
        }
    }
    void pizza()
    {
        Iterator<String> iter = pizzamenu.iterator();
        Iterator<Double> iter1=pizzaprice.iterator();
        int i = 1;
        System.out.println("|============================================================|");
        System.out.println("|------------------------PIZZA MENU--------------------------|");
        while (iter.hasNext() && iter1.hasNext()) 
        {
            System.out.println(" ["+i+"]" + ".  " + iter.next()+"  :---> "+"Rs. "+iter1.next());
                i++;
        
        }
        System.out.println("|------------------------------------------------------------|");
        System.out.println(" [100]. go back...");
        System.out.println("|============================================================|");
        System.out.print(" Enter your choice:- ");
        int j = sc.nextInt();
        if (j == 100) {
            food();
        }
        else if(j>7 && j<100)
        {
            System.out.println("  Enter valid choice again...");
            pizza();
        }
        else {
            totalitems.add(pizzamenu.get(j-1));
            total.add(pizzaprice.get(j-1));
            System.out.println("|----------------------------------------|");
            System.out.println("  "+pizzamenu.get(j-1)+" pizza sucessfully added.....");
            System.out.println("|----------------------------------------|");
            pizza();
        }
    }
    void burger()
    {
        Iterator<String> iter = burgermenu.iterator();
        Iterator<Double> iter1=burgerprice.iterator();
        int i = 1; 
        System.out.println("|========================================|");
        System.out.println("|--------------BURGER MENU---------------|");
        while (iter.hasNext() && iter1.hasNext()) 
        {
            System.out.println(" ["+i+"]" + ".  " + iter.next()+"  :---> "+"Rs. "+iter1.next());
                i++;
        }
        System.out.println("|----------------------------------------|");
        System.out.println(" [100]. go back...");
        System.out.println("|========================================|");
        System.out.print(" Enter your choice:- ");
        int j = sc.nextInt();
        if (j == 100) {
            food();
        }
        else if(j>6 && j<100)
        {
            System.out.println("  Enter valid choice again...");
            burger();
        }
        else {
            totalitems.add(burgermenu.get(j-1)); 
            total.add(burgerprice.get(j-1)); 
            System.out.println("|----------------------------------------|");
            System.out.println("  "+burgermenu.get(j-1)+" burger sucessfully added.....");
            System.out.println("|----------------------------------------|");
            burger();
        }
    }
    void sandwich()
    {
        Iterator<String> iter = sandwichmenu.iterator();
        Iterator<Double> iter1=sandwichprice.iterator();
        int i = 1; 
        System.out.println("|========================================|");
        System.out.println("|-------------SANDWICH MENU--------------|");
        while (iter.hasNext() && iter1.hasNext()) 
        {
            System.out.println(" ["+i+"]" + ".  " + iter.next()+"  :---> "+"Rs. "+iter1.next());
                i++;
            
        }
        System.out.println("|----------------------------------------|");
        System.out.println(" [100]. go back...");
        System.out.println("|========================================|");
        System.out.print(" Enter your choice:- ");
        int j = sc.nextInt();
        if (j == 100) {
            food();
        }
        else if(j>6 && j<100)
        {
            System.out.println("  Enter valid choice again...");
            sandwich();
        }
        else {
            totalitems.add(sandwichmenu.get(j-1)); 
            total.add(sandwichprice.get(j-1)); 
            System.out.println("|----------------------------------------|");
            System.out.println("  "+sandwichmenu.get(j-1)+" sandwich sucessfully added.....");
            System.out.println("|----------------------------------------|");
            sandwich();
        }
    }
    void thali()
    {
        Iterator<String> iter = thalimenu.iterator();
        Iterator<Double> iter1=thaliprice.iterator();
        int i = 1; 
        System.out.println("|========================================|");
        System.out.println("|---------------THALI MENU---------------|");
        while (iter.hasNext() && iter1.hasNext()) 
        {
            System.out.println(" ["+i+"]" + ".  " + iter.next()+"  :---> "+"Rs. "+iter1.next());
                i++;
        }
        System.out.println("|----------------------------------------|");
        System.out.println(" [100]. go back...");
        System.out.println("|========================================|");
        System.out.print(" Enter your choice:- ");
        int j = sc.nextInt();
        if (j == 100) {
            food();
        }
        else if(j>4 && j<100)
        {
            System.out.println("  Enter valid choice again...");
            thali();
        }
        else {
            totalitems.add(thalimenu.get(j-1));
            total.add(thaliprice.get(j-1)); 
            System.out.println("|----------------------------------------|");
            System.out.println("  "+thalimenu.get(j-1)+" thali sucessfully added.....");
            System.out.println("|----------------------------------------|");
            thali();
        }
    }
    void fastfood()
    {
        Iterator<String> iter = fastfoodmenu.iterator();
        Iterator<Double> iter1=fastfoodprice.iterator();
        int i = 1;
        System.out.println("|========================================|");
        System.out.println("|-------------FASTFOOD MENU--------------|");
        while (iter.hasNext() && iter1.hasNext()) 
        {
            System.out.println(" ["+i+"]" + ".  " + iter.next()+"  :---> "+"Rs. "+iter1.next());
                i++;
            
        }
        System.out.println("|----------------------------------------|");
        System.out.println(" [100]. go back...");
        System.out.println("|========================================|");
        System.out.print(" Enter your choice:- ");
        int j = sc.nextInt();
        if (j == 100) {
            food();
        }
        else if(j>4 && j<100)
        {
            System.out.println("  Enter valid choice again...");
            fastfood();
        }
        else {
            totalitems.add(fastfoodmenu.get(j-1)); 
            total.add(fastfoodprice.get(j-1)); 
            System.out.println("|----------------------------------------|");
            System.out.println("  "+fastfoodmenu.get(j-1)+" fastfood sucessfully added.....");
            System.out.println("|----------------------------------------|");
            fastfood();
        }
    }
    void drinks()
    {
        Iterator<String> iter = drinksmenu.iterator();
        Iterator<Double> iter1=drinksprice.iterator();
        int i = 1; 
        System.out.println("|========================================|");
        System.out.println("|--------------DRINKS MENU---------------|");
        while (iter.hasNext() && iter1.hasNext()) 
        {
            System.out.println(" ["+i+"]" + ".  " + iter.next()+"  :---> "+"Rs. "+iter1.next());
                i++;
            
        }
        System.out.println("|----------------------------------------|");
        System.out.println(" [100]. go back...");
        System.out.println("|========================================|");
        System.out.print(" Enter your choice:- ");
        int j = sc.nextInt();
        if (j == 100) {
            food();
        }
        else if(j>7 && j<100)
        {
            System.out.println("  Enter valid choice again...");
            drinks();
        }
        else {
            totalitems.add(drinksmenu.get(j-1)); 
            total.add(drinksprice.get(j-1));
            System.out.println("|----------------------------------------|");
            System.out.println("  "+drinksmenu.get(j-1)+" drink sucessfully added.....");
            System.out.println("|----------------------------------------|"); 
            drinks();
        }
    }
    void shakes()
    {
        Iterator<String> iter = shakesmenu.iterator();
        Iterator<Double> iter1=shakesprice.iterator();
        int i = 1; 
        System.out.println("|========================================|");
        System.out.println("|--------------SHAKES MENU---------------|");
        while (iter.hasNext() && iter1.hasNext()) 
        {
            System.out.println(" ["+i+"]" + ".  " + iter.next()+"  :---> "+"Rs. "+iter1.next());
                i++;
            
        }
        System.out.println("|----------------------------------------|");
        System.out.println(" [100]. go back...");
        System.out.println("|========================================|");
        System.out.print(" Enter your choice:- ");
        int j = sc.nextInt();
        if (j == 100) {
            food();
        }
        else if(j>7 && j<100)
        {
            System.out.println("  Enter valid choice again...");
            shakes();
        }
        else {
            totalitems.add(shakesmenu.get(j-1)); 
            total.add(shakesprice.get(j-1)); 
            System.out.println("|----------------------------------------|");
            System.out.println("  "+shakesmenu.get(j-1)+" shake sucessfully added.....");
            System.out.println("|----------------------------------------|");
            shakes();
        }
    }
    void icecream()
    {
        Iterator<String> iter = icecreammenu.iterator();
        Iterator<Double> iter1=icecreamprice.iterator();
        int i = 1; 
        System.out.println("|========================================|");
        System.out.println("|-------------ICECREAM MENU--------------|");
        while (iter.hasNext() && iter1.hasNext()) 
        {
            System.out.println(" ["+i+"]" + ".  " + iter.next()+"  :---> "+"Rs. "+iter1.next());
                i++;
            
        }
        System.out.println("|----------------------------------------|");
        System.out.println(" [100]. go back...");
        System.out.println("|========================================|");
        System.out.print(" Enter your choice:- ");
        int j = sc.nextInt();
        if (j == 100) {
            food();
        }
        else if(j>8 && j<100)
        {
            System.out.println("  Enter valid choice again...");
            icecream();
        }
        else {
            totalitems.add(icecreammenu.get(j-1)); 
            total.add(icecreamprice.get(j-1)); 
            System.out.println("|----------------------------------------|");
            System.out.println("  "+icecreammenu.get(j-1)+" icecream sucessfully added.....");
            System.out.println("|----------------------------------------|");
            icecream();
        }
    }
    void gujaratspecial()
    {
        Iterator<String> iter = gujaratspecialmenu.iterator();
        Iterator<Double> iter1=gujaratspecialprice.iterator();
        int i = 1; 
        System.out.println("|========================================|");
        System.out.println("|---------GUJARAT'S SPECIAL MENU---------|");
        while (iter.hasNext() && iter1.hasNext()) {
            System.out.println(" ["+i+"]" + ".  " + iter.next()+"  :---> "+"Rs. "+iter1.next());
                i++;
            
        }
        System.out.println("|----------------------------------------|");
        System.out.println(" [100]. go back...");
        System.out.println("|========================================|");
        System.out.print(" Enter your choice:- ");
        int j = sc.nextInt();
        if (j == 100) {
            food();
        }
        else if(j>7 && j<100)
        {
            System.out.println("  Enter valid choice again...");
            gujaratspecial();
        }
        else {
            totalitems.add(gujaratspecialmenu.get(j-1)); 
            total.add(gujaratspecialprice.get(j-1));
            System.out.println("|----------------------------------------|");
            System.out.println("  "+gujaratspecialmenu.get(j-1)+" sucessfully added.....");
            System.out.println("|----------------------------------------|"); 
            gujaratspecial();
        }
    }
    void displayBill() 
    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("bill.txt"));
            
            writer.write("|============================================================================|\n");
            writer.write("|---------------------------------TOTAL BILL---------------------------------|\n");
            
            Iterator<String> itemsIter = totalitems.iterator();
            Iterator<Double> priceIter = total.iterator();
            while (itemsIter.hasNext() && priceIter.hasNext()) {
                String item = itemsIter.next();
                Double price = priceIter.next();
                writer.write("  " + item + "--> Rs. " + price + "\n");
                amt += price;
            }

            Double gst = amt * 0.18;
            Double sum=amt;
            writer.write("|----------------------------------------------------------------------------|\n");
            writer.write("|  summary:- Rs. "+sum+"                                                          |\n");
            writer.write("|----------------------------------------------------------------------------|\n");
            writer.write("  Total tax:- Rs. " + gst + "\n");
            writer.write("|----------------------------------------------------------------------------|\n");
            writer.write("  final amount=  Rs. " + (amt + gst) + "\n");
            writer.write("|============================================================================|\n");
            writer.write("|---------------------------------THANK YOU---------------------------------|");
            writer.write("|============================================================================|\n");

            writer.close();
            System.out.println("|------------------------------------------------------------------------|");
            System.out.println("  Bill generated and saved in bill.txt sucessfully...");
            System.out.println("|------------------------------------------------------------------------|");
        } 
        catch (IOException e) 
        {
            System.out.println("|------------------------------------------------------------------------|");
            System.out.println("  An error occurred while writing the bill to the file: " + e.getMessage());
            System.out.println("|------------------------------------------------------------------------|");
        }
    }
}

