package com.dataflair.switchcase;
import java.sql.*;
import java.sql.DriverManager;
import java.time.Month;
import java.time.Year;
import java.util.*;

public class Main{

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try{
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //creating a connection
            String url="jdbc:mysql://localhost:3306/edproject";
            String username="root";
            String password="Harshit$1602";

            Connection con = DriverManager.getConnection(url,username,password);

            if(con.isClosed()){
                System.out.println("Connection is closed");
            }
            else{
                System.out.println("Connection Created...");
            }



        }catch (Exception e){
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);

        int certificate,bdate,ddate,mdate,year,year1;
        String name,month,gname,bname,month1,fname,mname,hospital,address;
        System.out.println("FOR BIRTH CERTIFICATE PRESS 1:-");
        System.out.println("FOR DEATH CERTIFICATE PRESS 2:-");
        System.out.println("FOR MARRIAGE CERTIFICATE PRESS 3:-");
        System.out.println("Please enter which certificate you wanted:-");

        certificate=sc.nextInt();





        switch(certificate) {


            case 1:

                Connection con = null;
                try {
                    //load the driver
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    //creating a connection
                    String url = "jdbc:mysql://localhost:3306/edproject";
                    String username = "root";
                    String password = "Harshit$1602";

                    con = DriverManager.getConnection(url, username, password);


                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Enter Name-");
                name = sc.next();
                System.out.println("Enter Father's Name-");
                fname = sc.next();
                System.out.println("Enter Mother's Name-");
                mname = sc.next();
                System.out.println("Enter Hospital name-");
                hospital = sc.next();
                System.out.println("Enter Birthdate-");
                bdate = sc.nextInt();
                System.out.println("Enter Month(In words)-");
                month = sc.next();
                System.out.println("Enter Year-");
                year = sc.nextInt();
                System.out.println("Enter Birthplace-");
                address = sc.next();

                String q = "Insert into BirthCertificate values(?,?,?,?,?,?,?,?)";
                java.sql.PreparedStatement pstmt = con.prepareStatement(q);
                pstmt.setString(1, name);
                pstmt.setString(2, fname);
                pstmt.setString(3, mname);
                pstmt.setString(4, hospital);
                pstmt.setInt(5, bdate);
                pstmt.setString(6, month);
                pstmt.setInt(7, year);
                pstmt.setString(8, address);

                pstmt.executeUpdate();

                System.out.println(" ");
                System.out.println("BIRTH CERTIFICATE");
                System.out.println(" ___________________________________________");
                System.out.println("| Name-" + name);
                System.out.println("| Father's Name-" + fname);
                System.out.println("| Mother's Name-" + mname);
                System.out.println("| Birthdate-" + bdate + "" + month + "" + year);
                System.out.println("| Hospital Name-" + hospital);
                System.out.println("| Birthplace-" + address);
                System.out.println(" ______________________________________________");

                break;
            case 2:
                System.out.println("Enter Name-");
                name = sc.next();
                System.out.println("Enter Father's Name-");
                fname = sc.next();
                System.out.println("Enter Mother's Name-");
                mname = sc.next();
                System.out.println("Enter Hospital name-");
                hospital = sc.next();
                System.out.println("Enter Birthdate-");
                bdate = sc.nextInt();
                System.out.println("Enter Month(In words)-");
                month = sc.next();
                System.out.println("Enter Year-");
                year = sc.nextInt();
                System.out.println("Enter Deathdate-");
                ddate = sc.nextInt();
                System.out.println("Enter Month-");
                month1 = sc.next();
                System.out.println("Enter Year-");
                year1 = sc.nextInt();
                Class.forName("com.mysql.cj.jdbc.Driver");
                //creating a connection
                String url="jdbc:mysql://localhost:3306/edproject";
                String username="root";
                String password="Harshit$1602";

                Connection con3 = DriverManager.getConnection(url,username,password);

                String q1 = "Insert into DeathCertificate values(?,?,?,?,?,?,?,?,?,?)";
                java.sql.PreparedStatement pstmt1 = con3.prepareStatement(q1);
                pstmt1.setString(1, name);
                pstmt1.setString(2, fname);
                pstmt1.setString(3, mname);
                pstmt1.setString(4, hospital);
                pstmt1.setInt(5, bdate);
                pstmt1.setString(6, month);
                pstmt1.setInt(7, year);
                pstmt1.setInt(8, ddate);
                pstmt1.setString(9, month1);
                pstmt1.setInt(10, year1);

                pstmt1.executeUpdate();


                System.out.println(" ");
                System.out.println("DEATH CERTIFICATE");
                System.out.println(" ___________________________________________");
                System.out.println("| Name-" + name);
                System.out.println("| Father's Name-" + fname);
                System.out.println("| Mother's Name-" + mname);
                System.out.println("| Day of Birth-" + bdate + "" + month + "" + year);
                System.out.println("| Day of Death-" + ddate + "" + month1 + "" + year1);
                System.out.println("| Hospital Name-" + hospital);
                System.out.println(" ______________________________________________");

                break;
            case 3:
                System.out.println("Enter Groom's name-");
                gname = sc.next();
                System.out.println("Enter Bride's name-");
                bname = sc.next();
                System.out.println("Enter Month(In words)-");
                month = sc.next();
                System.out.println("Enter Year-");
                year = sc.nextInt();
                System.out.println("Enter Marriage Date-");
                mdate = sc.nextInt();
                Class.forName("com.mysql.cj.jdbc.Driver");
                //creating a connection
                String url1="jdbc:mysql://localhost:3306/edproject";
                String username1="root";
                String password1="Harshit$1602";

                Connection con1 = DriverManager.getConnection(url1,username1,password1);

                String q2 = "Insert into MarriageCertificate values(?,?,?,?,?)";
                java.sql.PreparedStatement pstmt2 = con1.prepareStatement(q2);
                pstmt2.setString(1,  gname);
                pstmt2.setString(2, bname);
                pstmt2.setString(3, month);
                pstmt2.setInt(4, year);
                pstmt2.setInt(5, mdate);

                pstmt2.executeUpdate();


                System.out.println("MARRIAGE CERTIFICATE");
                System.out.println(" ___________________________________________");
                System.out.println("| Groom's Name-" + gname);
                System.out.println("| Bride's Name-" + bname);

                System.out.println("| Marriage Date-" + mdate + "" + month + "" + year);

                System.out.println(" ______________________________________________");
                break;
            default:
                System.out.println("The value of the variable is neither 1 nor 2 nor 3");
        }

    }
}






















































//