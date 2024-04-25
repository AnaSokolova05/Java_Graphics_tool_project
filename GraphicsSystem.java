import java.awt.Color;

import javax.swing.JFrame;

import uk.ac.leedsbeckett.oop.LBUGraphics;

import java.awt.image.BufferedImage;

import java.io.File;

import javax.imageio.ImageIO;



public class GraphicsSystem extends LBUGraphics

{
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) 
    {
        new GraphicsSystem(); //create instance of class that extends LBUGraphics
    }


	public GraphicsSystem()
   	{
		JFrame MainFrame = new JFrame(); // Create a new JFrame 
   		MainFrame.add(this); // add the LBUGraphics to JFrame
   		MainFrame.pack(); // set the size
   		this.setBackground(Color.black); // set the background colour
   		this.setPenColour(Color.white);// set the pen colour
   		this.clear(); // clear the MainFrame
   		this.penDown();
   		MainFrame.setVisible(true); // make MainFrame visible
   	    MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the close operation of the JFrame to exit the program when closed
    }
 

	public void processCommand(String command) 
	{	
	  String[] parts = command.split(" "); //split a string command 
	  
		    if (parts[0].equals("forward")) 
		    {
			  if (parts.length == 2) 
			         {
			           try 
			         {
			              int distance = Integer.parseInt(parts[1]);
			              if (distance >= 10 && distance <= 150) 
			              {
			              this.forward(distance);
			              }
			              else 
			              {
			                 System.out.println("Invalid parameter. Distance must be between 10 and 150.");
			              }
			         }
			         
			        catch (NumberFormatException exception) 
			        {
			            System.out.println("Invalid parameter. Distance must be a number.");
			        }
			        	   
			        }
			         else if
			               (parts.length != 2)
			           {
			               System.out.println("Missing parameter. Please enter a valid command.");
			           }
			         else 
			         {
			             System.out.println("Invalid command. Please enter a valid command.");
			         }
			         
			      }
		         
		   else if (parts[0].equals("backward")) 
		    {
		      if (parts.length == 2) 
		      {
		           try 
		         {
		              int distance = Integer.parseInt(parts[1]);
		              if (distance >= 10 && distance <= 150) 
		              {
		              this.forward(-distance);
		              }
		              else 
		              {
		                 System.out.println("Invalid parameter. Distance must be between 10 and 150.");
		              }
		         } 
		        catch (NumberFormatException exception) 
		        {
		            System.out.println("Invalid parameter. Distance must be a number.");
		        }
		           
		        }
		         else if
		               (parts.length != 2)
		           {
		               System.out.println("Missing parameter. Please enter a valid command.");
		           }
		         else 
		         {
		             System.out.println("Invalid command. Please enter a valid command.");
		         }
		        	  
	    }
		         
	             
		   
		    else if (parts[0].equals("turnleft"))
		    {
		    	if (parts.length == 2)
		    	{
		    		try
		    	{
		    			int distance = Integer.parseInt(parts[1]);
		    			if (distance >= 5 && distance <= 180) 
		    			{
		    			this.turnLeft(distance);
		    			}
		    			else 
			              {
			                 System.out.println("Invalid parameter. Distance must be between 5 and 180.");
			              }
		    	}
		    			
		    		catch (NumberFormatException exception)
		    		{
		    			System.out.println("Invalid parameter. Distance must be a number.");
		    		}
		    	}
		    	   else if
		    	       (parts.length != 2)
		    	   
		    	   {
		    		   System.out.println("Missing parameter. Please enter a valid command.");
		    	   }
		    	   else 
			         {
			             System.out.println("Invalid command. Please enter a valid command.");
			         }
		    }
		    

		    else if (parts[0].equals("turnright"))
		    {
		    	if (parts.length == 2)
		    	{
		    		try
		    	{
		    			int distance = Integer.parseInt(parts[1]);
		    			if (distance >= 5 && distance <= 180) 
		    			{
		    			this.turnRight(distance);
		    	        }
		    			else 
			              {
			                 System.out.println("Invalid parameter. Distance must be between 5 and 180.");
			              }
		    	}
		    		catch (NumberFormatException exception)
		    		{
		    			System.out.println("Invalid parameter. Distance must be a number.");
		    		}
		    	}
		    	   else if
		    	       (parts.length != 2)
		    	   {
		    		   System.out.println("Missing parameter. Please enter a valid command.");
		    	   }
		    	   else 
			         {
			             System.out.println("Invalid command. Please enter a valid command.");
			         }
		    	   
		        }      
		else if (command.equals("about")) 
		{
	       about();
		} 	

		else if (command.equals("penup")) 
		{
			this.penDown =false;
        } 
		
		else if (command.equals("pendown")) 
        {
			this.penDown = true;
		}
		
		else if (command.equals("clear"))
		{
			this.clear();
		}
		
		else if (command.equals("red"))
		{
			this.setPenColour(Color.red);
		}
		
		else if (command.equals("white"))
		{
			this.setPenColour(Color.white);
		}
		
		else if (command.equals("green"))
		{
			this.setPenColour(Color.green);
		}
		
		else if (command.equals("black"))
		{
			this.setPenColour(Color.black);
		}
		else if (command.equals("reset"))
		{
			this.reset();
		}
		else if  (command.equals("save"))  
		{
			this.saveImage(command);
		}
		    
		else 
			System.out.println("Invalid command. Please enter a valid command.");
   }

	public void saveImage(String GraphicsSystem) 
	{
	    try 
	    {
	        BufferedImage image = new BufferedImage(getWidth(),getHeight(), BufferedImage.TYPE_INT_RGB);
	        paint(image.getGraphics());
	        File file = new File(GraphicsSystem + ".png");
	        ImageIO.write(image, "png", file);
	        System.out.println("Image saved as " + GraphicsSystem + ".png");
	    } 
	    catch (Exception exception) 
	    {
	        System.out.println("Error saving image: " + exception.getMessage());
	    }
	}

	@Override
	public void about() 
	    {
	        super.about();
	        System.out.println("Anastasiia");
	    }
}




