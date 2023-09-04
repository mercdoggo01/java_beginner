package com.merc01.java;

public class Client 
{
      private Checker checker;
      
      public Client(Checker checker)
      {
    	  this.checker = checker;
      }
      
      void sendMessage(String message)
      {
    	  checker.checkMessage(message);
      }
      
}
