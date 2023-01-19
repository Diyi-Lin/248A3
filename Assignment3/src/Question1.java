
	// -------------------------------------------------------
	// Assignment1
	// Written by: (Diyi Lin student id40086388)
	// For COMP 248 Section  – Fall 2018
	// --------------------------------------------------------


import java.util.Scanner;//input the favorite team

import java.util.Random;//random the scores

public class Question1{
//Diyi Lin 11/7/2018
//This program is about generating a road map of matches and related goal statistics in the FIFA World Cup Final
	
	
	public static void main(String[] args) {
		//declare Scanner
		Scanner key = new Scanner(System.in);
		
		//set up variables
		String team = "Anything";//initialize team
		String[] teams16 = {"uruguay", "portugal", "france", "argentina", "brazil", "mexico",
				"belgium", "japan", "spain", "russia", "croatia", "denmark", "sweden", "switzerland",
				"colombia", "england"};//team name in round 16
		
		int i,k=0,h=0;//initialize k for tournament,h for games in each tournament
		
		
		int[] score16 = new int[16];    //store scores in round 16
        int[] score8  = new int[8];     //store scores in quarter-final
        int[] score4 = new int[4];      //store scores in semi-final
        int[] score2 = new int[2];      //store scores in final
        int[][] sum = new int[20][15];       //store goals in each game
        double t = 0;                        //total goals for each tournament
        double[] ave = new double[20];       //store average goals in each tournament
        
        String[] teams8 = new String[8];       //store teams in quarter- final
        String[] teams4 = new String[4];       //store teams in semi-final
        String[] teams2 = new String[2];       //store teams in final
       
        String teamwin = "UNKONW";
       
        Random ranscore = new Random();

        int j =0;//initialize j to use as a boolean
    do
      { System.out.print("Enter your favourite team: ");//late welcome banner 
         team = key.next();
         team = team.trim();            //ignore white-spaces
         team = team.toLowerCase();     //ignore capital letters 
         System.out.println();
        for(i=0;i<16;i++)                //check if user's favorite team is in round 16 or not 
        { if(team.equals(teams16[i]))
        	j=1;}                         //use integer j as a boolean
          if(j==0)                         
        	System.out.println("Your team is not in the Round of 16");
           } 	
        while(j==0);                     
      
    
    while( !teamwin.equals(team) && k!= 20) //game end with the favorite team win or 20 tournaments are already taken
      
  { System.out.print("ROUND OF 16");
        for (i=0;i<16;i++)
        	score16[i] = ranscore.nextInt(5);   //random score for 16 teams
        for (i=0;i<score16.length/2;i++)       
         { if(score16[2*i]<score16[2*i+1])      //every two teams in pairs to compete
               teams8[i]=teams16[2*i+1];      //winner go to next round        
               
             if(score16[2*i]>score16[2*i+1])
                 teams8[i]=teams16[2*i]; 
                 
               if(score16[2*i]==score16[2*i+1])
                   {j = ranscore.nextInt(2);
            	     if(j==0)
                      {teams8[i]=teams16[2*i];   
                        score16[2*i] += 1;
                      }
            	      else 
            	        {teams8[i]=teams16[2*i+1];   
                          score16[2*i+1] += 1;
                        }
                   }
         System.out.print("["+teams16[2*i]+" "+score16[2*i]+":"+score16[2*i+1]+" "+teams16[2*1+1]+"] ");   //print the results  
         sum[k][h] = score16[2*i] + score16[2*i+1];   //add up the goals
         h+=1;
         }
               System.out.println();
         
     System.out.print("QUARTER-FINALS");
        for (i=0;i<8;i++)
        	score8[i] = ranscore.nextInt(5);    //random score for 8 teams
        for (i=0;i<score8.length/2;i++)         
         { if(score8[2*i]<score8[2*i+1])        //every two teams in pairs to compete
               teams4[i]=teams8[2*i+1];         //winner go to next round 
         
             if(score8[2*i]>score8[2*i+1])
                 teams4[i]=teams8[2*i]; 

               if(score8[2*i]==score8[2*i+1])
                   {j = ranscore.nextInt(2);
                   if(j==0)
                    {teams4[i]=teams8[2*i];   
                      score8[2*i] += 1;
                    }
            	    else 
            	     {teams4[i]=teams8[2*i+1];   
                       score8[2*i+1] += 1;
            	     }
            	   }
          System.out.print("["+teams8[2*i]+" "+score8[2*i]+":"+score8[2*i+1]+" "+teams8[2*1+1]+"] ");      //print the results
          sum[k][h] = score8[2*i]+score8[2*i+1];   //add up the goals
          h+=1;
         }	
               System.out.println();
        
      System.out.print("SMEI-FINALS");
        for (i=0;i<4;i++)
        	score4[i] = ranscore.nextInt(5);        //random score for 4 teams
        for (i=0;i<score4.length/2;i++)            
         { if(score4[2*i]<score4[2*i+1])           //every two teams in pairs to compete
               teams2[i]=teams4[2*i+1];            //winner go to next round 
              
             if(score4[2*i]>score4[2*i+1])
                 teams2[i]=teams4[2*i]; 

               if(score4[2*i]==score4[2*i+1])
                  {j = ranscore.nextInt(2);
                  if(j==0)
                   {teams2[i]=teams4[2*i];   
                     score4[2*i] += 1;
                   }
        	      else 
        	       {teams2[i]=teams4[2*i+1];   
                     score4[2*i+1] += 1;
        	       }
        	      }
          System.out.print("["+teams4[2*i]+" "+score4[2*i]+":"+score4[2*i+1]+" "+teams4[2*1+1]+"] ");      //print the results     
          sum[k][h] = score4[2*i]+score4[2*i+1];    //add up the goals
          h+=1;
         }     
               System.out.println();
          
	   System.out.println("FINAL");
	      for (i=0;i<2;i++)
	        	score2[i] = ranscore.nextInt(5);    //random score for 2 teams
	      if(score2[0]<score2[1])                   //every two teams in pairs to compete
	         teamwin=teams2[1];                     // winner is the champion
	        
	         if(score2[0]>score2[1])
	           teamwin=teams2[0];  
	          
	           if(score2[0]==score2[1])
	             {j = ranscore.nextInt(2);
	              teamwin=teams2[j];   
	              score2[j] += 1;
	             }
	       System.out.print("["+teams2[0]+" "+score2[0]+":"+score2[1]+" "+teams2[0]+"] ");                //print the results
	       sum[k][14] = score2[0]+score2[1];        //add up the goals
	      
	       //calculate and store the average of each tournament
	      for(i=0;i<15;i++)  
	    	t+=sum[k][i];
	      ave[k] = t/15;  
	     
	      
	       System.out.println();
         
           System.out.println("Tournament: "+k+" The WINNER is: "+teamwin);
           k+=1;     //the number of tournaments
           h=0;      //reset game numbers
           t=0;      //reset total goals
           System.out.println();
       }
	     System.out.println();
	  
	     //check the if the favorite team win or not 
	   if(teamwin.equals(team))    
	     System.out.println("It took "+k+" tournament(s) of the game for "+team+" to win!!!");
	   else 
         System.out.println("Sorrry, "+team+" didn't win in 20 tournaments!");
	     System.out.println();

	     
	     System.out.println("GOAL STATS");
	     System.out.println();
	  
	     //print the goal stats 
	    for(i=0;i<k;i++)
	    { System.out.print("[Tournament "+i+" ] Total goals: [");
	      for(j=0;j<14;j++)
	      System.out.print(sum[i][j]+", ");
	      String avee = String.format("%.1f", ave[i]);//simply the double number
	      System.out.println(sum[i][14]+"]"+" [Average: "+avee+"]");
	    } 
	      
	    //calculate the average goals for all  tournaments
	    double Ave=0;
	    for(i=0;i<k;i++)
	    Ave += ave[i];
	    Ave /= k;
	    String Avee = String.format("%.1f", Ave);//simply the double number
	    
	    //calculate the number of the matches in all tournaments over the average goal value
	    int over =0;
	    for(i=0;i<k;i++)
	     for(j=0;j<15;j++)
	      if (sum[i][j]>ave[i])
	    	  over += 1;
	    
	    //print the goal stats
	    System.out.println("Average goals for "+k+" tournament(s): "+ Avee);
	    System.out.println("Total matches in all tournaments over the average goal value:"+ over); 
	      
	   	      
	   //close Scanner  
	   //Good habit or not?  
	    key.close();   
            
	}
	}
	
