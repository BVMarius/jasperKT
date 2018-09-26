package com.controller;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;

public class JasperReportCompile {

   public static void main(String[] args) {
      String sourceFileName = "D://Quirl/wsTest/ManagementReport" + 
         "/first_report.jrxml";
      
      

      System.out.println("Compiling Report Design ...");
      try {
          /**
          * Compile the report to a file name same as
          * the JRXML file name
          */
         JasperCompileManager.compileReportToFile(sourceFileName);
      } catch (JRException e) {
         e.printStackTrace();
      }
      System.out.println("Done compiling! ...");
   }
}