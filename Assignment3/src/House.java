

	// -------------------------------------------------------
	// Assignment3
	// Written by: (Diyi Lin student id40086388)
	// For COMP 248 Section  – Fall 2018
	// --------------------------------------------------------

public class House {
//Diyi Lin 11/2/2018
//define a class named House that store information about a house
		
//private instance variables
private int age;
private String type;
private double cost;
double price;
//4 constructors 
   public House(){ 
   age =50;
   type = "attached";
   cost = 100000;
   }
   public House(double cost) {
   this.cost=cost;
   age = 50;
   type = "attached";
   }
   public House(int age,double cost) {
   this.age=age;
   this.cost=cost;
   type = "attached";
   }
   public House(int age,double cost,String type) {  
   this.age=age;
   this.cost= cost;
   this.type=type;
   }
//3 accessor methods
   public int getAge()
   {
	   return age;
   }
   public double getCost()
   {
	   return cost;
   }
   public String getType() 
   {
	   return type;
   }
//5 mutator methods
   public void setAge(int age)
   {
	   this.age = age;
   }
   public void setCost(double cost)
   {
	   this.cost =cost;
   }
   public void setType(String type)
   {
	   this.type = type;
   }
   public void setAll(int age,double cost,String type)
   {
	   this.age=age;
	   this.cost=cost;
	   type = "attched"; 
   }
   public void setAgeandCost(int age,double cost)
   {
	   this.age=age;
	   this.cost=cost;
   }
//estimatePrice()   
   public double estimatePrice() 
   {
	 if (type.equals("attached"))          //type
	 {
		 price = 100000;  
	     if (age <= 5)                   //age
	     { for(int i=0; i< age;i++)
			 price = 1.1*price;}
	     else { 
	    	 for(int i=0;i<=5;i++)
	          price *= 1.1;  
	        for(int i=0;i<age-5;i++)   
	          price *= 1.2;
	          }
	  }
	 else if (type.equals("semi-detached")) //type
	  {
			 price = 150000;  
		 if (age <= 5)                   //age
			for(int i=0; i< age;i++)
				 price *= 1.2;
		   else {
			   for(int i=0;i<5;i++)
		          price *= 1.2;  
		       for(int i=0;i<age-5;i++)   
		          price *= 1.3;
		        }	   
		}
	 else if (type.equals("detached"))     //type
	   {
			 price = 200000;  
		   for(int i=0; i< age;i++)
			price *= 1.2;
	   }
	  return price;
   }
//toString()
   public String toString()
   {
	  return ("This House is type "+type+". Its age is "+age+" and costs $"+cost); 
   }
//equals()
   public boolean equals(House a)
   {
	   return(this.cost==(a.cost) && this.type.equals(a.type));
   }
//isLessThan() 
   public boolean isLessThan(House a)
   {
	   return(this.price<(a.price));
   }
//isGreaterThan()
   public boolean isGreaterThan(House a)
   {
	   return(this.price>(a.price));
   }
//test code   
   public static void main(String[] args) {
	   //constructors test
	   House H1 = new House();
	   System.out.print("House H1: " + H1.toString()+"\n");
      
       House H2 = new House(100000);
       System.out.print("House H2: "+H2.toString()+"\n");
       
       House H3 = new House(4,120000);
       System.out.print("House H3: "+H3.toString()+"\n");
       
       House H4 = new House(2,220000,"detached");
       System.out.print("House H4: "+H4.toString()+"\n");
      
       //accessor test 
       System.out.println();
       System.out.println("Accessor Method: The housetype for H4 is " + H4.getType() + ", its age is " + H4.getAge() + ", and it costs $" + H4.getCost()+"\n");
       
       //estimate price test
       System.out.println("The estimated price of house H3 is $" + H3.estimatePrice());
       System.out.println("The estimated price of house H4 is $" + H4.estimatePrice());
       
       //mutator test
       System.out.println();
       H3.setAge(5);
       System.out.println("Mutator Method: The new age for house H3 is "+ H3.getAge());
       H3.setType("semi-detached");
       System.out.println("Mutator Method: The new housetype for house H3 is "+H3.getType());
       H3.setCost(240000);
       System.out.println("Mutator Method: The new cost for house H3 is "+H3.getCost());
       H3.setAgeandCost(6, 245000);
       System.out.println("Mutator Method: The new house H3 age is "+ H3.getAge()+"and its new cost is "+ H3.getCost());
       H3.setAll(14, 260000, "semi-detached");
       System.out.println("Mutator Method: The new housetype for H3 is "+ H3.getType()+", its new age is "+ H3.getAge()+" and its "); 
       System.out.println("cost is "+ H3.getCost());
   
       //toString test
       System.out.println();
       System.out.println("toString: "+ H3.toString());
   
       //equals test
       System.out.println();
       System.out.println("Houses H1 and H2 are equal is "+ H1.equals(H2));
       System.out.println("Houses H1 and H2 are equal is "+ H3.equals(H4));
      
       //less , greater test
       System.out.println();
       System.out.println("House H4 is less than H3 is "+ H4.isLessThan(H3));
       System.out.println();
       System.out.println("House H1 is greater than H3 is "+ H1.isGreaterThan(H3));
   }

}


