package com.wellbiing.wellbiinghealthcare;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;

import java.sql.*;

public class DoctorJDBC {
    void EnterAllergies(String patientId, String allergyCode, String allergyName, String description, Date date) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String query = "INSERT INTO allergy VALUES(?, ?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, patientId);
        ps.setString(2, allergyCode);
        ps.setString(3, allergyName);
        ps.setString(4, description);
        ps.setDate(5, date);

        ps.execute();

        System.out.println("Success");
    }

    void EnterOperation(String patientId, String opCode, String opCost, String opDescription, String opType, Date opDate) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String query = "INSERT INTO operation VALUES(?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, patientId);
        ps.setString(2, opCode);
        ps.setString(3, opCost);
        ps.setString(4, opDescription);
        ps.setString(5, opType);
        ps.setDate(6, opDate);

        ps.execute();

        System.out.println("Success");
    }

    void EnterTreatments(String patientId, String trCode, String trCost, String trDescription, String trType, Date sDate, Date eDate) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String query = "INSERT INTO treatments VALUES(?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, patientId);
        ps.setString(2, trCode);
        ps.setString(3, trCost);
        ps.setString(4, trDescription);
        ps.setString(5, trType);
        ps.setDate(6, sDate);
        ps.setDate(7, eDate);

        ps.execute();

        System.out.println("Success");
    }

    void EnterMedication(String patientId, String medCode, String medCost, String medDesc, String medType, Date sDate, Date eDate) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String query = "INSERT INTO medication VALUES(?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, patientId);
        ps.setString(2, medCode);
        ps.setString(3, medCost);
        ps.setString(4, medDesc);
        ps.setString(5, medType);
        ps.setDate(6, sDate);
        ps.setDate(7, eDate);

        ps.execute();

        System.out.println("Success");
    }

    void EnterTest(String patientId, String testCode, String testCost, String testDesc, String testType, Date testDate) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String query = "INSERT INTO lab VALUES(?, ?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, patientId);
        ps.setString(2, testCode);
        ps.setString(3, testCost);
        ps.setString(4, testDesc);
        ps.setString(5, testType);
        ps.setDate(6, testDate);

        ps.execute();

        System.out.println("Success");
    }

    void EnterVitals(String patientId, String temp, String spO2, String bloodPressure, String heartRate, String breathingRate, Date testDate) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String query = "INSERT INTO vitals VALUES(?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, Integer.parseInt(patientId));
        ps.setString(2, temp);
        ps.setString(3, bloodPressure);
        ps.setString(4, heartRate);
        ps.setString(5, breathingRate);
        ps.setDate(6, testDate);
        ps.setString(7, spO2);

        ps.execute();

        System.out.println("Success");


    }

    public void EnterNewPatient(String patientId, String name, Date dob, String gender, String height, String weight, String bloodGroup, String contact,
                                String state, String city, String street, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");
        Credentials credentials = new Credentials();
        String hashedPassword = credentials.createHash(password);

        System.out.println(hashedPassword);

        String piQuery = "INSERT INTO personal_information VALUES(?, ?, ?, ?, ?, ?, ?)";
        String contactQuery = "INSERT INTO contact_info VALUES(?, ?)";
        String addressQuery = "INSERT INTO address VALUES(?, ?, ?, ?)";
        String authenticationQuery = "INSERT INTO authentication (username, password) VALUES(?, ?)";

        PreparedStatement piPs = con.prepareStatement(piQuery);
        PreparedStatement contactPs = con.prepareStatement(contactQuery);
        PreparedStatement addressPs = con.prepareStatement(addressQuery);
        PreparedStatement authenticationPs = con.prepareStatement(authenticationQuery);

        piPs.setInt(1, Integer.parseInt(patientId));
        piPs.setString(2, name);
        piPs.setDate(3, dob);
        piPs.setString(4, gender);
        piPs.setString(5, height);
        piPs.setString(6, weight);
        piPs.setString(7, bloodGroup);

        contactPs.setString(1, patientId);
        contactPs.setString(2, contact);

        addressPs.setString(1, patientId);
        addressPs.setString(2, street);
        addressPs.setString(3, city);
        addressPs.setString(4, state);


        authenticationPs.setString(1, name);
        authenticationPs.setString(2, hashedPassword);

        piPs.execute();
        contactPs.execute();
        addressPs.execute();
        authenticationPs.execute();

    }


    public void GetPatients(TableView curPatientTable) throws ClassNotFoundException, SQLException {
        //System.out.println("TeSTING waow");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String selectAllInfo = "SELECT * FROM personal_information;";

        PreparedStatement selectAllInfoPS = con.prepareStatement(selectAllInfo);

        ResultSet resultSetInfo = selectAllInfoPS.executeQuery();

        String selectAllContact = "SELECT * FROM contact_info WHERE patient_ID = ?;";

        PreparedStatement selectAllContactPS = con.prepareStatement(selectAllContact);

        String selectAllVitals = "SELECT * FROM vitals WHERE patient_ID = ?;";

        PreparedStatement selectAllVitalsPS = con.prepareStatement(selectAllVitals);

        int patientId;
        String patientName;
        String patientContact = "";
        Date patientLastVisit = null;

        while (resultSetInfo.next()) {
            patientId = resultSetInfo.getInt(1);
            patientName = resultSetInfo.getString(2);

            System.out.println(selectAllContactPS);

            selectAllContactPS.setInt(1, patientId);
            ResultSet resultSetContact = selectAllContactPS.executeQuery();

            while (resultSetContact.next()){
                patientContact = resultSetContact.getString(2);
            }

            selectAllVitalsPS.setInt(1, patientId);

            ResultSet resultSetVitals = selectAllVitalsPS.executeQuery();

            while (resultSetVitals.next()){
                patientLastVisit = resultSetVitals.getDate(6);
            }

            curPatientTable.getItems().add(new PatientInfo(patientId, patientName, patientContact, patientLastVisit));
            System.out.println("wow");
        }
    }



    public int GetPatientCount() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String query = "SELECT COUNT(patient_ID) FROM personal_information;";

        PreparedStatement ps = con.prepareStatement(query);

        ResultSet countResultSet = ps.executeQuery();

        int patientCount = 0;
        
        while (countResultSet.next()) {
            patientCount = countResultSet.getInt("COUNT(patient_ID)");
        }

        return patientCount;
    }

    public void AddVitals(TableView searchTable) {

    }

    public ResultSet GetVitals(int patientId) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String query = "SELECT * FROM vitals WHERE patient_ID = ?;";

        PreparedStatement preparedStatement = con.prepareStatement(query);

        preparedStatement.setInt(1, patientId);

        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet;
    }

    public String GetName(int patientId) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String query = "SELECT patient_name FROM personal_information WHERE patient_ID = ?;";

        PreparedStatement preparedStatement = con.prepareStatement(query);

        preparedStatement.setInt(1, patientId);

        ResultSet resultSet = preparedStatement.executeQuery();

        String patientName = null;
        
        while (resultSet.next()){
            patientName = resultSet.getString(1);
        }

        return patientName;
    }

    public ResultSet GetMedication(int patientId) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String query = "SELECT * FROM medication WHERE patient_ID = ?;";

        PreparedStatement preparedStatement = con.prepareStatement(query);

        preparedStatement.setInt(1, patientId);

        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet;
    }

    public ResultSet GetTreatment(int patientId) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String query = "SELECT * FROM treatments WHERE patient_ID = ?;";

        PreparedStatement preparedStatement = con.prepareStatement(query);

        preparedStatement.setInt(1, patientId);

        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet;
    }

    public ResultSet GetAllergy(int patientId) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String query = "SELECT * FROM allergy WHERE patient_ID = ?;";

        PreparedStatement preparedStatement = con.prepareStatement(query);

        preparedStatement.setInt(1, patientId);

        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet;
    }

    public ResultSet GetOperation(int patientId) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String query = "SELECT * FROM operation WHERE patient_ID = ?;";

        PreparedStatement preparedStatement = con.prepareStatement(query);

        preparedStatement.setInt(1, patientId);

        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet;
    }

    public ResultSet GetTest(int patientId) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        String query = "SELECT * FROM lab WHERE patient_ID = ?;";

        System.out.println(patientId);;

        PreparedStatement preparedStatement = con.prepareStatement(query);

        preparedStatement.setInt(1, patientId);

        ResultSet resultSet = preparedStatement.executeQuery();


        return resultSet;
    }

    public void UpdateVitals(TablePosition position, TableView<?> updateTable, float newValue, int patientId) throws ClassNotFoundException, SQLException {
        int column = position.getColumn();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        int row = position.getRow();
        TableColumn col = updateTable.getColumns().get(6);
        Date testDate = (Date) col.getCellData(row);

        System.out.println(newValue);
        String query;
        PreparedStatement ps = null;
        System.out.println(column);

        switch (column) {
            case (1):
                query = "UPDATE vitals SET Temperature = ? WHERE Test_date = ? AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setFloat(1, newValue);
                ps.setDate(2, testDate);
                ps.setInt(3, patientId);
                break;
            case (2):
                query = "UPDATE vitals SET Blood_Pressure = ? WHERE Test_date = ? AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setFloat(1, newValue);
                ps.setDate(2, testDate);
                ps.setInt(3, patientId);
                break;
            case (3):
                query = "UPDATE vitals SET Heart_Rate = ? WHERE Test_date = ? AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setFloat(1, newValue);
                ps.setDate(2, testDate);
                ps.setInt(3, patientId);
                break;
            case (4):
                query = "UPDATE vitals SET Breathing_Rate = ? WHERE Test_date = ? AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setFloat(1, newValue);
                ps.setDate(2, testDate);
                ps.setInt(3, patientId);
                break;
            case (5):
                query = "UPDATE vitals SET SpO2 = ? WHERE Test_date = ? AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setFloat(1, newValue);
                ps.setDate(2, testDate);
                ps.setInt(3, patientId);
                System.out.println("wow");

                break;
            }

        ps.executeUpdate();
        System.out.println("wowie");

    }

    public void UpdateMedication(TablePosition position, TableView<?> updateTable, String newValue, int patientId) throws SQLException, ClassNotFoundException {
        int column = position.getColumn();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        int row = position.getRow();
        TableColumn col = updateTable.getColumns().get(1);
        int medCode = (Integer) col.getCellData(row);

        System.out.println(newValue);
        String query;
        PreparedStatement ps = null;
        System.out.println(column);

        switch (column) {
            case(2):
                query = "UPDATE medication SET Medication_cost = ? WHERE Medication_code = ? AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setInt(1, Integer.parseInt(newValue));
                ps.setInt(2, medCode);
                ps.setInt(3, patientId);
                break;
            case(3):
                query = "UPDATE medication SET Medication_description = ? WHERE Medication_code = ? AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, String.valueOf(Integer.parseInt(newValue)));
                ps.setInt(2, medCode);
                ps.setInt(3, patientId);
                break;

            case(4):
                query = "UPDATE medication SET Medication_type = ? WHERE Medication_code = ?  AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, newValue);
                ps.setInt(2, medCode);
                ps.setInt(3, patientId);
                break;
        }

        ps.executeUpdate();
        System.out.println("wowie");
    }

    public void UpdateTreatment(TablePosition position, TableView<?> updateTable, String newValue, int patientId) throws ClassNotFoundException, SQLException {
        int column = position.getColumn();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        int row = position.getRow();
        TableColumn col = updateTable.getColumns().get(1);
        int treatmentCode = (Integer) col.getCellData(row);

        System.out.println(newValue);
        String query;
        PreparedStatement ps = null;
        System.out.println(column);

        switch (column) {
            case (2):
                query = "UPDATE treatments SET Treatment_cost = ? WHERE Treatment_code = ?  AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, newValue);
                ps.setInt(2, treatmentCode);
                ps.setInt(3, patientId);
                break;
            case (3):
                query = "UPDATE treatments SET Treatment_description = ? WHERE Treatment_code = ?  AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, newValue);
                ps.setInt(2, treatmentCode);
                ps.setInt(3, patientId);
                break;
            case (4):
                query = "UPDATE treatments SET Treatment_type = ? WHERE Treatment_code = ?  AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, newValue);
                ps.setInt(2, treatmentCode);
                ps.setInt(3, patientId);
                break;

        }

        ps.executeUpdate();
        System.out.println("wowie");
    }

    public void UpdateAllergies(TablePosition position, TableView<?> updateTable, String newValue, int patientId) throws ClassNotFoundException, SQLException {
        int column = position.getColumn();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        int row = position.getRow();
        TableColumn col = updateTable.getColumns().get(1);
        int allergyCode = (Integer) col.getCellData(row);

        System.out.println(newValue);
        String query;
        PreparedStatement ps = null;
        System.out.println(column);

        switch (column) {
            case (2):
                query = "UPDATE allergy SET Allergy_Name = ? WHERE Allergy_code = ?  AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, newValue);
                ps.setInt(2, allergyCode);
                ps.setInt(3, patientId);
                break;
            case (3):
                query = "UPDATE allergy SET Allergy_description = ? WHERE Allergy_code = ?  AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, newValue);
                ps.setInt(2, allergyCode);
                ps.setInt(3, patientId);
                break;

        }

        ps.executeUpdate();
        System.out.println("wowie");
    }

    public void UpdateOperations(TablePosition position, TableView<?> updateTable, String newValue, int patientId) throws ClassNotFoundException, SQLException {
        int column = position.getColumn();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        int row = position.getRow();
        TableColumn col = updateTable.getColumns().get(1);
        int treatmentCode = (Integer) col.getCellData(row);

        System.out.println(newValue);
        String query;
        PreparedStatement ps = null;
        System.out.println(column);

        switch (column) {
            case (2):
                query = "UPDATE operation SET operation_cost = ? WHERE Operation_code = ? AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, newValue);
                ps.setInt(2, treatmentCode);
                ps.setInt(3, patientId);
                break;
            case (3):
                query = "UPDATE operation SET operation_description = ? WHERE Operation_code = ? AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, newValue);
                ps.setInt(2, treatmentCode);
                ps.setInt(3, patientId);
                break;
            case (4):
                query = "UPDATE operation SET operation_type = ? WHERE Operation_code = ? AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, newValue);
                ps.setInt(2, treatmentCode);
                ps.setInt(3, patientId);
                break;

        }

        ps.executeUpdate();
        System.out.println("wowie");
    }

    public void UpdateTests(TablePosition position, TableView<?> updateTable, String newValue, int patientId) throws SQLException, ClassNotFoundException {
        int column = position.getColumn();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whc", "pass123");

        int row = position.getRow();
        TableColumn col = updateTable.getColumns().get(1);
        int treatmentCode = (Integer) col.getCellData(row);

        System.out.println(newValue);
        String query;
        PreparedStatement ps = null;
        System.out.println(column);

        switch (column) {
            case (2):
                query = "UPDATE lab SET LabTest_cost = ? WHERE LabTest_code = ? AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, newValue);
                ps.setInt(2, treatmentCode);
                ps.setInt(3, patientId);
                break;
            case (3):
                query = "UPDATE lab SET LabTest_description = ? WHERE LabTest_code = ? AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, newValue);
                ps.setInt(2, treatmentCode);
                ps.setInt(3, patientId);
                break;
            case (4):
                query = "UPDATE lab SET LabTest_type = ? WHERE LabTest_code = ? AND patient_ID = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, newValue);
                ps.setInt(2, treatmentCode);
                ps.setInt(3, patientId);
                break;

        }

        ps.executeUpdate();
        System.out.println("wowie");

    }

    public void DeleteVitals(VitalsInfo row, int patientId) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whcd", "pass123");

        Date testDate = (Date) row.getTestDate();

        String query = "DELETE FROM vitals WHERE patient_ID = ? And Test_date = ?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, patientId);
        ps.setDate(2, testDate);

        ps.execute();
        System.out.println("wowie");

    }

    public void DeleteMedication(MedicationInfo row, int patientId) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whcd", "pass123");

        int medicationCode = row.getMedicationCode();

        String query = "DELETE FROM medication WHERE patient_ID = ? And Medication_code = ?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, patientId);
        ps.setInt(2, medicationCode);

        ps.execute();
        System.out.println("wowie");
    }

    public void DeleteTreatments(TreatmentInfo row, int patientId) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whcd", "pass123");

        int treatmentCode = row.getTreatmentCode();

        String query = "DELETE FROM treatments WHERE patient_ID = ? And Treatment_code = ?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, patientId);
        ps.setInt(2, treatmentCode);

        ps.execute();
        System.out.println("wowie");
    }
    public void DeleteAllergies(AllergyInfo row, int patientId) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whcd", "pass123");

        int allergyCode = row.getAllergyCode();

        String query = "DELETE FROM allergy WHERE patient_ID = ? And Allergy_code = ?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, patientId);
        ps.setInt(2, allergyCode);

        ps.execute();
        System.out.println("wowie");
    }

    public void DeleteOperations(OperationInfo row, int patientId) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whcd", "pass123");

        int opCode = row.getOpCode();

        String query = "DELETE FROM operation WHERE patient_ID = ? And Operation_code = ?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, patientId);
        ps.setInt(2, opCode);

        ps.execute();
        System.out.println("wowie");
    }

    public void DeleteTests(LabInfo row, int patientId) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://172.19.19.197:3306/wellbiinghealthcare", "whcd", "pass123");

        int labCode = row.getLabCode();

        String query = "DELETE FROM lab WHERE patient_ID = ? And LabTest_code = ?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, patientId);
        ps.setInt(2, labCode);

        ps.execute();
        System.out.println("wowie");
    }



}

