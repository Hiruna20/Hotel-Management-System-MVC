/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class MReportCustomer {
    public void GetCustomerReport(){
        try{
            MDbConnection dbConnection = new MDbConnection();
            Connection report_con = dbConnection.createConnection();
            
            JasperDesign jasperdesign1 = JRXmlLoader.load("C:\\Users\\acer\\Documents\\NetBeansProjects\\EAD_1_CW\\src\\view\\VReportCustomer.jrxml");
            JRDesignQuery designquery1 = new JRDesignQuery();
            designquery1.setText("select * from checkout");
            jasperdesign1.setQuery(designquery1);
            JasperReport report1 = JasperCompileManager.compileReport(jasperdesign1);
            JasperPrint print1 = JasperFillManager.fillReport(report1,null,report_con);
            JasperViewer.viewReport(print1);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
