package com.wellbiing.wellbiinghealthcare;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Objects;
import java.util.ResourceBundle;

public class DoctorController implements Initializable {


    @FXML
    private AnchorPane allergiesEntryPane;

    @FXML
    private DatePicker patientDOB;

    @FXML
    private DatePicker treatmentEndDate;

    @FXML
    private TextField treatmentCodeField;

    @FXML
    private TextField treatmentTypeField;

    @FXML
    private TextField treatmentDescField;

    @FXML
    private TextField treatmentCostField;

    @FXML
    private TextField patientHeightField;

    @FXML
    private TextField testCodeField;

    @FXML
    private TextField allergyDescriptionField;

    @FXML
    private TextField patientWeightField;

    @FXML
    private TextField patientBloodGroupField;

    @FXML
    private RadioButton allergiesRadio;

    @FXML
    private TextField allergyCodeFIeld;

    @FXML
    private TextField allergyNameField;

    @FXML
    private Button delPatientButton;

    @FXML
    private RadioButton deleteAllergiesRadio;

    @FXML
    private RadioButton deleteLabTestRadio;

    @FXML
    private RadioButton deleteMedicationRadio;

    @FXML
    private RadioButton deleteOperationRadio;

    @FXML
    private TextField deletePatientId;

    @FXML
    private Button deletePatientConfirmButton1;

    @FXML
    private DatePicker deletePatientDate;

    @FXML
    private ToggleGroup deletePatientGroup;

    @FXML
    private AnchorPane deletePatientPane;

    @FXML
    private Button deleteRowConfirm;

    @FXML
    private TableView<?> deleteTable;

    @FXML
    private RadioButton deleteTreatmentRadio;

    @FXML
    private RadioButton deleteVitalsRadio;

    @FXML
    private Button entrySelectButton;

    @FXML
    private Button homeButton;

    @FXML
    private ImageView homeIcon;

    @FXML
    private AnchorPane homePane;

    @FXML
    private AnchorPane labTestEntryPane;

    @FXML
    private RadioButton labTestRadio;

    @FXML
    private Button logOutButton;

    @FXML
    private TextField medicationCodeField;

    @FXML
    private TextField medicationCost;

    @FXML
    private TextField medicationDescription;

    @FXML
    private DatePicker medicationEndDate;

    @FXML
    private AnchorPane medicationEntryPane;

    @FXML
    private RadioButton medicationRadio;

    @FXML
    private TextField medicationTypeField;

    @FXML
    private Button newPatientButton;

    @FXML
    private Button newPatientConfirmButton;

    @FXML
    private AnchorPane newPatientPane;

    @FXML
    private TextField operationCodeField;

    @FXML
    private TextField operationCostField;

    @FXML
    private TextField operationDescriptionField;

    @FXML
    private AnchorPane operationEntryPane;

    @FXML
    private RadioButton operationRadio;

    @FXML
    private TextField operationTypeField;

    @FXML
    private TextField patientContactField;

    @FXML
    private Button patientEntryButton;

    @FXML
    private Button patientEntryConfirm;

    @FXML
    private ToggleGroup patientEntryGroup;

    @FXML
    private TextField patientEntryIdField;

    @FXML
    private AnchorPane patientEntryPane;

    @FXML
    private ToggleGroup patientGenderGroup;

    @FXML
    private TextField patientIdField;

    @FXML
    private TextField patientNameField;

    @FXML
    private TextField patientPasswordField;

    @FXML
    private RadioButton searchAllergiesRadio;

    @FXML
    private Button searchConfirmButton;

    @FXML
    private RadioButton searchLabTestRadio;

    @FXML
    private RadioButton searchMedicationRadio;

    @FXML
    private RadioButton searchOperationRadio;

    @FXML
    private ToggleGroup searchPatientGroup;

    @FXML
    private TextField searchPatientId;

    @FXML
    private AnchorPane searchPatientPane;

    @FXML
    private RadioButton searchTreatmentRadio;

    @FXML
    private RadioButton searchVitalsRadio;

    @FXML
    private TextField testCost;

    @FXML
    private TextField testDescription;

    @FXML
    private ComboBox<?> testSelect;

    @FXML
    private TextField testTypeField;

    @FXML
    private AnchorPane treatmentEntryPane;

    @FXML
    private RadioButton treatmentRadio;

    @FXML
    private Button updPatientButton;

    @FXML
    private Button updPatientButton1;

    @FXML
    private RadioButton updateAllergiesRadio;

    @FXML
    private RadioButton updateLabTestRadio;

    @FXML
    private RadioButton updateMedicationRadio;

    @FXML
    private RadioButton updateOperationRadio;

    @FXML
    private Button updatePatientConfirmButton;

    @FXML
    private DatePicker updatePatientDate;

    @FXML
    private ToggleGroup updatePatientGroup;

    @FXML
    private TextField updatePatientId;

    @FXML
    private AnchorPane updatePatientPane;

    @FXML
    private TableView<?> updateTable;

    @FXML
    private RadioButton updateTreatmentRadio;

    @FXML
    private RadioButton updateVitalsRadio;

    @FXML
    private TextField vitalsBpField;

    @FXML
    private TextField vitalsBrField;

    @FXML
    private AnchorPane vitalsEntryPane;

    @FXML
    private TextField vitalsHrField;

    @FXML
    private RadioButton vitalsRadio;

    @FXML
    private TextField vitalsSpo2FIeld;

    @FXML
    private TextField vitalsTempFIeld;

    @FXML
    private TableView curPatientTable;

    @FXML
    private TableView searchTable;

    @FXML
    private TextField patientStateField;

    @FXML
    private TextField patientCityField;

    @FXML
    private TextField patientStreetField;

    @FXML
    private RadioButton patientGenderMale;

    @FXML
    private RadioButton patientGenderFemale;

    @FXML
    private Label patientCountLabel;


    @FXML
    void ButtonHoverEnd(MouseEvent event) {
        Button b = (Button) event.getSource();
        b.setStyle("-fx-background-color: #ffffff");
    }

    @FXML
    void ButtonHoverStart(MouseEvent event) {
        Button b = (Button) event.getSource();
        b.setStyle("-fx-font-size: 30");
        b.setStyle("-fx-background-color: #a4adb7");

//        b.setStyle("fx-background-image: url('assets\\home.png')");
    }

    public void closeAndDisablePanes() {
        homePane.setOpacity(0);
        homePane.setDisable(true);
        newPatientPane.setOpacity(0);
        newPatientPane.setDisable(true);
        patientEntryPane.setOpacity(0);
        patientEntryPane.setDisable(true);
        updatePatientPane.setOpacity(0);
        updatePatientPane.setDisable(true);
        searchPatientPane.setOpacity(0);
        searchPatientPane.setDisable(true);
        deletePatientPane.setOpacity(0);
        deletePatientPane.setDisable(true);
    }

    public void HomeOpen(ActionEvent actionEvent) {
        closeAndDisablePanes();
        homePane.setDisable(false);
        homePane.setOpacity(1);
    }

    public void NewPatientOpen(ActionEvent actionEvent) {
        closeAndDisablePanes();
        newPatientPane.setDisable(false);
        newPatientPane.setOpacity(1);
    }

    public void PatientEntryOpen(ActionEvent actionEvent) {
        closeAndDisablePanes();
        patientEntryPane.setDisable(false);
        patientEntryPane.setOpacity(1);
    }

    public void SearchPatientOpen(ActionEvent actionEvent) {
        closeAndDisablePanes();
        searchPatientPane.setDisable(false);
        searchPatientPane.setOpacity(1);
    }

    public void UpdatePatientOpen(ActionEvent actionEvent) {
        closeAndDisablePanes();
        updatePatientPane.setDisable(false);
        updatePatientPane.setOpacity(1);
    }

    public void DeletePatientOpen(ActionEvent actionEvent) {
        closeAndDisablePanes();
        deletePatientPane.setDisable(false);
        deletePatientPane.setOpacity(1);
    }

    public void LogOut(ActionEvent actionEvent) throws IOException {
        WellBiingApplication wa = new WellBiingApplication();
        wa.changeScene("login.fxml");
    }

    public void closeEntryPanes() {
        vitalsEntryPane.setOpacity(0);
        vitalsEntryPane.setDisable(true);
        labTestEntryPane.setOpacity(0);
        labTestEntryPane.setDisable(true);
        allergiesEntryPane.setOpacity(0);
        allergiesEntryPane.setDisable(true);
        medicationEntryPane.setOpacity(0);
        medicationEntryPane.setDisable(true);
        treatmentEntryPane.setOpacity(0);
        treatmentEntryPane.setDisable(true);
        operationEntryPane.setOpacity(0);
        operationEntryPane.setDisable(true);
    }

    public void SelectEntry(ActionEvent actionEvent) {
        Toggle selectedToggle = patientEntryGroup.getSelectedToggle();
        if (selectedToggle == vitalsRadio) {
            closeEntryPanes();
            vitalsEntryPane.setDisable(false);
            vitalsEntryPane.setOpacity(1);
        }
        if (selectedToggle == labTestRadio) {
            closeEntryPanes();
            labTestEntryPane.setDisable(false);
            labTestEntryPane.setOpacity(1);
        }
        if (selectedToggle == medicationRadio) {
            closeEntryPanes();
            medicationEntryPane.setDisable(false);
            medicationEntryPane.setOpacity(1);
        }
        if (selectedToggle == treatmentRadio) {
            closeEntryPanes();
            treatmentEntryPane.setDisable(false);
            treatmentEntryPane.setOpacity(1);
        }
        if (selectedToggle == operationRadio) {
            closeEntryPanes();
            operationEntryPane.setDisable(false);
            operationEntryPane.setOpacity(1);
        }
        if (selectedToggle == allergiesRadio) {
            closeEntryPanes();
            allergiesEntryPane.setDisable(false);
            allergiesEntryPane.setOpacity(1);
        }

    }

    public void PatientEntryConfirm(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        Toggle selectedToggle = patientEntryGroup.getSelectedToggle();
        DoctorJDBC jdbc = new DoctorJDBC();
        String patientId = patientEntryIdField.getText();

        Date curDate = Date.valueOf(LocalDate.now());


        if (selectedToggle == vitalsRadio) {
            jdbc.EnterVitals(patientId, vitalsTempFIeld.getText(), vitalsSpo2FIeld.getText(), vitalsBpField.getText(),
                    vitalsHrField.getText(), vitalsBrField.getText(), curDate);
        }
        if (selectedToggle == labTestRadio) {
            jdbc.EnterTest(patientId, testCodeField.getText(), testCost.getText(), testDescription.getText(),
                    testTypeField.getText(), curDate);
        }

        if (selectedToggle == medicationRadio) {
            jdbc.EnterMedication(patientId, medicationCodeField.getText(), medicationCost.getText(), medicationDescription.getText(),
                    medicationTypeField.getText(), curDate, Date.valueOf(medicationEndDate.getValue()));
        }
        if (selectedToggle == treatmentRadio) {
            jdbc.EnterTreatments(patientId, treatmentCodeField.getText(), treatmentCostField.getText(), treatmentDescField.getText(),
                    treatmentTypeField.getText(), curDate, Date.valueOf(treatmentEndDate.getValue()));
        }
        if (selectedToggle == operationRadio) {
            jdbc.EnterOperation(patientId, operationCodeField.getText(), operationCostField.getText(), operationDescriptionField.getText(),
                    operationTypeField.getText(), curDate);
        }
        if (selectedToggle == allergiesRadio) {
            jdbc.EnterAllergies(patientId, allergyCodeFIeld.getText(), allergyNameField.getText(), allergyDescriptionField.getText(),
                    curDate);
        }
    }

    public void NewPatientConfirm(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        Toggle selectedToggle = patientGenderGroup.getSelectedToggle();
        String patientId = patientIdField.getText();
        DoctorJDBC jdbc = new DoctorJDBC();

        String gender;
        if (selectedToggle == patientGenderMale) {
            gender = "M";
        } else {
            gender = "F";
        }
        Date dob = Date.valueOf(patientDOB.getValue());
        String password = patientPasswordField.getText();

        jdbc.EnterNewPatient(patientId, patientNameField.getText(), dob, gender, patientHeightField.getText(), patientWeightField.getText(),
                patientBloodGroupField.getText(), patientContactField.getText(), patientStateField.getText(), patientCityField.getText(),
                patientStreetField.getText(), password);

    }

    public void CurrentPatientTable() {
        TableColumn<PatientInfo, Integer> patientIdCol = new TableColumn<>("Patient ID");
        TableColumn<PatientInfo, String> patientNameCol = new TableColumn<>("Name");
        TableColumn<PatientInfo, String> patientContactCol = new TableColumn<>("Contact No.");
        TableColumn<PatientInfo, Date> patientDateCol = new TableColumn<>("Last Visit");

        patientIdCol.setCellValueFactory(new PropertyValueFactory<>("patientId"));
        patientNameCol.setCellValueFactory(new PropertyValueFactory<>("patientName"));
        patientContactCol.setCellValueFactory(new PropertyValueFactory<>("patientContact"));
        patientDateCol.setCellValueFactory(new PropertyValueFactory<>("patientLastVisit"));

        patientIdCol.setMinWidth(50);
        patientNameCol.setMinWidth(250);
        patientContactCol.setMinWidth(150);

        try {
            InsertCurPatientRows(curPatientTable);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        curPatientTable.getColumns().add(patientIdCol);
        curPatientTable.getColumns().add(patientNameCol);
        curPatientTable.getColumns().add(patientContactCol);
        curPatientTable.getColumns().add(patientDateCol);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CurrentPatientTable();
    }

    private void InsertCurPatientRows(TableView curPatientTable) throws SQLException, ClassNotFoundException {
        DoctorJDBC jdbc = new DoctorJDBC();
        int patientCount = jdbc.GetPatientCount();

        patientCountLabel.setText(String.valueOf(patientCount));

        jdbc.GetPatients(curPatientTable);

    }

    public void SearchPatient(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        searchTable.getItems().clear();
        searchTable.getColumns().clear();
        Toggle selectedToggle = searchPatientGroup.getSelectedToggle();
        CreateTables createTables = new CreateTables();
        TableView table = searchTable;

        if (selectedToggle == searchVitalsRadio) {
            createTables.VitalsTable(table);
            createTables.AddVitals(table, searchPatientId);
        }

        if (selectedToggle == searchMedicationRadio) {
            createTables.MedicationTable(table);
            createTables.AddMedication(table, searchPatientId);
        }

        if (selectedToggle == searchTreatmentRadio) {
            createTables.TreatmentTable(table);
            createTables.AddTreatment(table, searchPatientId);
        }

        if (selectedToggle == searchAllergiesRadio) {
            createTables.AllergyTable(table);
            createTables.AddAllergy(table, searchPatientId);
        }

        if (selectedToggle == searchOperationRadio) {
            createTables.OperationTable(table);
            createTables.AddOperation(table, searchPatientId);
        }

        if (selectedToggle == searchLabTestRadio) {
            createTables.TestTable(table);
            createTables.AddTest(table, searchPatientId);
        }

    }

    public void UpdatePatient(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        updateTable.getColumns().clear();
        updateTable.getItems().clear();
        for (TableColumn<?, ?> column : updateTable.getColumns()) {
            column.setReorderable(false);
        }

        int patientId = Integer.parseInt(updatePatientId.getText());

        Toggle selectedToggle = updatePatientGroup.getSelectedToggle();
        CreateTables createTables = new CreateTables();
        DoctorJDBC jdbc = new DoctorJDBC();
        TableView table = updateTable;

        if (selectedToggle == updateVitalsRadio) {
            createTables.VitalsTable(table);
            createTables.AddVitals(table, updatePatientId);
            System.out.println(updateTable.isEditable());
            for (TableColumn<?, ?> column : updateTable.getColumns()) {
                column.setReorderable(false);
                System.out.println(column.isEditable());
                column.setOnEditCommit(event -> {
                    float newValue = (float) event.getNewValue();
                    TablePosition position = updateTable.getEditingCell();

                    System.out.println(position.getTableColumn());
                    try {
                        jdbc.UpdateVitals(position, updateTable, newValue, patientId);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        }

        if (selectedToggle == updateMedicationRadio) {
            createTables.MedicationTable(table);
            createTables.AddMedication(table, updatePatientId);
            for (TableColumn<?, ?> column : updateTable.getColumns()) {
                column.setReorderable(false);
                System.out.println(column.isEditable());
                column.setOnEditCommit(event -> {

                    String newValue = String.valueOf(event.getNewValue());

                    TablePosition position = updateTable.getEditingCell();

                    System.out.println(position.getTableColumn());
                    try {
                        jdbc.UpdateMedication(position, updateTable, newValue, patientId);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        }

        if (selectedToggle == updateTreatmentRadio) {
            createTables.TreatmentTable(table);
            createTables.AddTreatment(table, updatePatientId);

            for (TableColumn<?, ?> column : updateTable.getColumns()) {
                column.setReorderable(false);
                System.out.println(column.isEditable());
                column.setOnEditCommit(event -> {

                    String newValue = String.valueOf(event.getNewValue());
                    TablePosition position = updateTable.getEditingCell();

                    System.out.println(position.getTableColumn());
                    try {
                        jdbc.UpdateTreatment(position, updateTable, newValue, patientId);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        }

        if (selectedToggle == updateAllergiesRadio) {
            createTables.AllergyTable(table);
            createTables.AddAllergy(table, updatePatientId);
            for (TableColumn<?, ?> column : updateTable.getColumns()) {
                column.setReorderable(false);
                System.out.println(column.isEditable());
                column.setOnEditCommit(event -> {

                    String newValue = (String) event.getNewValue();
                    TablePosition position = updateTable.getEditingCell();

                    System.out.println(position.getTableColumn());
                    try {
                        jdbc.UpdateAllergies(position, updateTable, newValue, patientId);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        }

        if (selectedToggle == updateOperationRadio) {
            createTables.OperationTable(table);
            createTables.AddOperation(table, updatePatientId);
            for (TableColumn<?, ?> column : updateTable.getColumns()) {
                column.setReorderable(false);
                System.out.println(column.isEditable());
                column.setOnEditCommit(event -> {

                    String newValue = (String) event.getNewValue();
                    TablePosition position = updateTable.getEditingCell();

                    System.out.println(position.getTableColumn());
                    try {
                        jdbc.UpdateOperations(position, updateTable, newValue, patientId);
                    } catch (ClassNotFoundException | SQLException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        }

        if (selectedToggle == updateLabTestRadio) {
            createTables.TestTable(table);
            createTables.AddTest(table, updatePatientId);
            for (TableColumn<?, ?> column : updateTable.getColumns()) {
                column.setReorderable(false);
                System.out.println(column.isEditable());
                column.setOnEditCommit(event -> {
                    String newValue =  String.valueOf(event.getNewValue());
                    TablePosition position = updateTable.getEditingCell();

                    System.out.println(position.getTableColumn());
                    try {
                        jdbc.UpdateTests(position, updateTable, newValue, patientId);
                    } catch (ClassNotFoundException | SQLException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        }
    }


    public void DeletePatient(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        deleteTable.getColumns().clear();
        deleteTable.getItems().clear();
        Utility utility = new Utility();

        if (Objects.equals(deletePatientId.getText(), "") || !utility.CheckInteger(deletePatientId.getText())) {
            utility.ErrorAlert("PatientId Error", "Please Enter a valid Patient ID");
        }
        else {
            Toggle selectedToggle = deletePatientGroup.getSelectedToggle();
            CreateTables createTables = new CreateTables();
            DoctorJDBC jdbc = new DoctorJDBC();
            TableView table = deleteTable;

            if (selectedToggle == deleteVitalsRadio) {
                createTables.VitalsTable(table);
                createTables.AddVitals(table, deletePatientId);
            }

            if (selectedToggle == deleteMedicationRadio) {
                createTables.MedicationTable(table);
                createTables.AddMedication(table, deletePatientId);
            }

            if (selectedToggle == deleteTreatmentRadio) {
                createTables.TreatmentTable(table);
                createTables.AddTreatment(table, deletePatientId);
            }

            if (selectedToggle == deleteAllergiesRadio) {
                createTables.AllergyTable(table);
                createTables.AddAllergy(table, deletePatientId);
            }

            if (selectedToggle == deleteOperationRadio) {
                createTables.OperationTable(table);
                createTables.AddOperation(table, deletePatientId);
            }

            if (selectedToggle == deleteLabTestRadio) {
                createTables.TestTable(table);
                createTables.AddTest(table, deletePatientId);
            }
        }
    }

    public void DeleteRow(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        Toggle selectedToggle = deletePatientGroup.getSelectedToggle();
        DoctorJDBC jdbc = new DoctorJDBC();

        Utility utility = new Utility();

        if (Objects.equals(deletePatientId.getText(), "")) {
            deletePatientId.setStyle("-fx-border-color: #FF0000");
            utility.ErrorAlert("Empty Patient ID", "Please Enter a valid Patient ID");
        } else if (deleteTable.getSelectionModel().getSelectedItem() == null) {
            deletePatientId.setStyle("-fx-border-color: default");
            utility.ErrorAlert("No Selection", "Please Select a Row to Delete");
        } else {
            deletePatientId.setStyle("-fx-border-color: default");
            if (utility.ConfirmAlert("Confirmation", "Are you sure you want to delete the Row?")) {
                int patientId = Integer.parseInt(deletePatientId.getText());

                if (selectedToggle == deleteVitalsRadio) {
                    VitalsInfo row = (VitalsInfo) deleteTable.getSelectionModel().getSelectedItem();
                    System.out.println(row.getPatientName());
                    jdbc.DeleteVitals(row, patientId);
                    deleteTable.getItems().remove(row);
                }

                if (selectedToggle == deleteMedicationRadio) {
                    MedicationInfo row = (MedicationInfo) deleteTable.getSelectionModel().getSelectedItem();
                    System.out.println(row.getPatientName());
                    jdbc.DeleteMedication(row, patientId);
                    deleteTable.getItems().remove(row);
                }

                if (selectedToggle == deleteTreatmentRadio) {
                    TreatmentInfo row = (TreatmentInfo) deleteTable.getSelectionModel().getSelectedItem();
                    System.out.println(row.getPatientName());
                    jdbc.DeleteTreatments(row, patientId);
                    deleteTable.getItems().remove(row);

                }

                if (selectedToggle == deleteAllergiesRadio) {
                    AllergyInfo row = (AllergyInfo) deleteTable.getSelectionModel().getSelectedItem();
                    System.out.println(row.getPatientName());
                    jdbc.DeleteAllergies(row, patientId);
                    deleteTable.getItems().remove(row);

                }

                if (selectedToggle == deleteOperationRadio) {
                    OperationInfo row = (OperationInfo) deleteTable.getSelectionModel().getSelectedItem();
                    System.out.println(row.getPatientName());
                    jdbc.DeleteOperations(row, patientId);
                    deleteTable.getItems().remove(row);
                }

                if (selectedToggle == deleteLabTestRadio) {
                    LabInfo row = (LabInfo) deleteTable.getSelectionModel().getSelectedItem();
                    System.out.println(row.getPatientName());
                    jdbc.DeleteTests(row, patientId);
                    deleteTable.getItems().remove(row);
                }
                utility.SuccessAlert("Success", "Deletion Success");

            }
            else{
                deletePatientId.setStyle("-fx-border-color: default");
            }
        }
    }
}



