package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.beans.Person;
import com.data.BeanData;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class JasperReportFill {
   @SuppressWarnings("unchecked")
   public static void main(String[] args) {
      String sourceFileName = 
         "D://Quirl/wsTest/ManagementReport/first_report.jasper";
      BeanData DataBeanList = new BeanData();
      List<Person> dataList = DataBeanList.getEmployeeList();

      JRBeanCollectionDataSource beanColDataSource = new 
         JRBeanCollectionDataSource(dataList);
     // JRBeanCollectionDataSource()

      Map parameters = new HashMap();
      try {
         JasperFillManager.fillReportToFile( 
            sourceFileName, parameters, beanColDataSource);
      } catch (JRException e) {
         e.printStackTrace();
      }
   }
}