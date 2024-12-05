import javax.swing.JOptionPane;
public class Application {
    public static void main(String[] args) {
        while(true){
            try{
                String initial, arithmetic;
                int choice, choose1;
               
                JOptionPane.showMessageDialog(null, "Welcome to MyApplication");
                // Screen with Options Showing
                initial = JOptionPane.showInputDialog(null, "1. Arithmetic Operation\n2. Even or Odd Number\n3. Shopping Discount\n4. Student Grading\n5. Exit");
                // Taking the Input and Storing the
                // Choice Taken
                choice = Integer.parseInt(initial);
                switch (choice) {
                    case 1:
                        //  Arithmetic operations section
                        arithmetic = JOptionPane.showInputDialog(null, "1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
                        choose1 = Integer.parseInt(arithmetic);
                        switch (choose1) {
                           
                            case 1:
                                String addA = JOptionPane.showInputDialog(null, "Input first number");
                                int add1 = Integer.parseInt(addA);
                                String addB = JOptionPane.showInputDialog(null, "Input second number");
                                int add2 = Integer.parseInt(addB);
                                String addC = JOptionPane.showInputDialog(null, "Input third number");
                                int add3 = Integer.parseInt(addC);
                                int addResult = add1 + add2 +add3;
                                JOptionPane.showMessageDialog(null, "The answer is " + addResult);
                                break;
                         
                            case 2:
                                String subA = JOptionPane.showInputDialog(null, "Input first number");
                                int sub1 = Integer.parseInt(subA);
                                String subB = JOptionPane.showInputDialog(null, "Input second number");
                                int sub2 = Integer.parseInt(subB);
                                int subResult = sub1 - sub2;
                                JOptionPane.showMessageDialog(null, "The answer is " + subResult);
                                break;
                           
                            case 3:
                                String mulA = JOptionPane.showInputDialog(null, "Input first number");
                                int mul1 = Integer.parseInt(mulA);
                                String mulB = JOptionPane.showInputDialog(null, "Input second number");
                                int mul2 = Integer.parseInt(mulB);
                                int mulResult = mul1 * mul2;
                                JOptionPane.showMessageDialog(null, "The answer is " + mulResult);
                                break;
                           
                            case 4:
                                String divA = JOptionPane.showInputDialog(null, "Input first number");
                                int div1 = Integer.parseInt(divA);
                                String divB = JOptionPane.showInputDialog(null, "Input second number");
                                int div2 = Integer.parseInt(divB);
                                int divResult = div1 / div2;
                                JOptionPane.showMessageDialog(null, "The answer is " + divResult);
                                break;
                        }
                        break;
                    
                    case 2:
                    String eo=JOptionPane.showInputDialog(null,"Input the number to check");
                    int check=Integer.parseInt(eo);
                    if (check % 2 ==0) {
                        JOptionPane.showMessageDialog(null,"The number "+check+"is even");

                    }
                    else{
                        JOptionPane.showMessageDialog(null,"The number"+check+"is odd");
                    }
                   break;
                  case 3:
                  String shopping=JOptionPane.showInputDialog(null,"Enter your Total shopping amount");
                  int discount=Integer.parseInt(shopping);
                  if (discount>=50000 && discount<=100000) {
                    int finalAmount=discount *5/100;
                    int price=discount - finalAmount;
                    JOptionPane.showMessageDialog(null, "You get 5% discount ");
                    JOptionPane.showMessageDialog(null,"Your total amount is "+price);
                  }
                  else if (discount > 100000 && discount <= 1000000) {
                    int finalAmount=discount *10/100;
                    int price = discount-finalAmount;
                     JOptionPane.showMessageDialog(null,"You get a 10% discount");
                     JOptionPane.showMessageDialog(null,"Your total shopping amount is "+price);
                  }
                  else if(discount > 1000000 && discount <2000000){
                    int finalAmount=discount *20/100;
                    int price = discount-finalAmount;
                    JOptionPane.showMessageDialog(null,"You get a 20% discount ");
                    JOptionPane.showMessageDialog(null,"Your total shopping amount is "+price);
                  }
               else if(discount>=2000000)  {
                int finalAmount = discount*40/100;
                int price = discount - finalAmount;
                JOptionPane.showMessageDialog(null,"You get a 40% discount ");
                JOptionPane.showMessageDialog(null,"Your total shopping amount is "+price);

               }  
               else if (discount >=0) {
                JOptionPane.showMessageDialog(null,"Your total shopping amount is"+discount);
               }
               else{
                JOptionPane.showMessageDialog(null,"Value cannot be negative");
               }
               break;
               case 4:
               String name=JOptionPane.showInputDialog(null,"Enter Student's Name");
               String age=JOptionPane.showInputDialog(null,"Enter age");
               int studentAge = Integer.parseInt(age);
               if (studentAge>=0) {
                JOptionPane.showMessageDialog(null,"Student name is "+name+"and is"+studentAge+"years old");
               }
               else{
                JOptionPane.showMessageDialog(null,"Age cannot be negative");
               }
               break;
               case 5:
               JOptionPane.showMessageDialog(null, "Program will exit");
               System.exit(0);
               break;
            } 
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Input error occured","Error",JOptionPane.ERROR_MESSAGE);
        }
}
    }
}
