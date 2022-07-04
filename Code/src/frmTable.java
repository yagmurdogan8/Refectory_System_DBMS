//@author Yağmur Doğan

import java.util.ArrayList;
import java.sql.*;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class frmTable extends javax.swing.JFrame {

    DefaultTableModel modelClient, modelEmployee, modelCompany,
            modelMeal, modelPayment, modelReservation;
    Connection connection = null;
    DbHelper dbHelper = new DbHelper();
    Statement statement = null;
    ResultSet resultSet;
    ArrayList<Client> clients = null;
    ArrayList<Employee> employees = null;
    ArrayList<Company> companies = null;
    ArrayList<Meal> meals = null;
    ArrayList<Payment> payments = null;
    ArrayList<Reservation> reservations = null;

    public frmTable() {
        initComponents();

        modelClient = (DefaultTableModel)tblClient.getModel();
        modelEmployee = (DefaultTableModel)tblEmployee.getModel();
        modelCompany = (DefaultTableModel)tblCompany.getModel();
        modelMeal = (DefaultTableModel)tblMeal.getModel();
        modelPayment = (DefaultTableModel)tblPayment.getModel();
        modelReservation = (DefaultTableModel)tblReservation.getModel();

        try {
            ArrayList<Client> clients = getClients();
            ArrayList<Employee> employees = getEmployees();
            ArrayList<Company> companies = getCompanies();
            ArrayList<Meal> meals = getMeals();
            ArrayList<Payment> payments = getPayments();
            ArrayList<Reservation> reservations = getReservations();

            for(Reservation reservation : reservations){
                Object [] data = {reservation.getRdate(),
                        reservation.getRes_meth(),
                        reservation.getRid(),
                        reservation.getMeal_type()
                };
                modelReservation.addRow(data);
            }

            for(Payment payment : payments){
                Object[] data = {payment.getPdate(),
                        payment.getPay_meth(),
                        payment.getPid(),
                        payment.getMeal_type()
                };
                modelPayment.addRow(data);
            }

            for(Meal meal : meals){
                Object[] data = {meal.getMeal_type(),
                        meal.getPrice(),
                        meal.getCid()
                };
                modelMeal.addRow(data);
            }

            for(Company company : companies){
                Object[] data = {company.getCid(),
                        company.getCname()
                };
                modelCompany.addRow(data);
            }

            for(Employee employee : employees){
                Object [] data = {employee.getEid(),
                        employee.getEname(),
                        employee.getEaddress(),
                        employee.getEgender(),
                        employee.getSdate(),
                        employee.getCid()
                };
                modelEmployee.addRow(data);
            }

            for(Client client : clients){
                Object [] data = {client.getClient_id(),
                        client.getClient_name(),
                        client.getClient_address(),
                        client.getClient_gender(),
                        client.getClient_fac(),
                        client.getClient_type(),
                        client.getEdate(),
                        client.getPid(),
                        client.getRid(),
                        client.getCid()
                };
                modelClient.addRow(data);
            }
        }
        catch (NullPointerException | SQLException exception) {

        }



    }

    public ArrayList<Client> getClients()throws SQLException{


        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from client");
            clients = new ArrayList<Client>();

            while(resultSet.next()){
                clients.add(new Client(
                        resultSet.getInt("client_id"),
                        resultSet.getString("client_name"),
                        resultSet.getString("client_address"),
                        resultSet.getString("client_gender"),
                        resultSet.getString("client_fac"),
                        resultSet.getString("client_type"),
                        resultSet.getString("Edate"),
                        resultSet.getInt("pid"),
                        resultSet.getInt("rid"),
                        resultSet.getInt("cid"))
                );
            }

        }
        catch(SQLException exception){
            dbHelper.showError(exception);

        }
        finally{
            statement.close();
            connection.close();

        }
        return clients;
    }

    public ArrayList<Employee> getEmployees() throws SQLException{

        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from employee");
            employees = new ArrayList<Employee>();

            while(resultSet.next()){
                employees.add(new Employee(
                        resultSet.getInt("Eid"),
                        resultSet.getString("Ename"),
                        resultSet.getString("Eaddress"),
                        resultSet.getString("Egender"),
                        resultSet.getString("Sdate"),
                        resultSet.getInt("cid"))
                );
            }

        }
        catch(SQLException exception){
            dbHelper.showError(exception);

        }
        finally{
            statement.close();
            connection.close();

        }
        return employees;
    }

    public ArrayList<Company> getCompanies() throws SQLException{

        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from company");
            companies = new ArrayList<Company>();

            while(resultSet.next()){
                companies.add(new Company(
                        resultSet.getInt("cid"),
                        resultSet.getString("cname"))
                );
            }

        }
        catch(SQLException exception){
            dbHelper.showError(exception);

        }
        finally{
            statement.close();
            connection.close();

        }
        return companies;
    }

    public ArrayList<Meal> getMeals() throws SQLException{

        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from meal");
            meals = new ArrayList<Meal>();

            while(resultSet.next()){
                meals.add(new Meal(
                        resultSet.getString("meal_type"),
                        resultSet.getInt("price"),
                        resultSet.getInt("cid"))

                );
            }

        }
        catch(SQLException exception){
            dbHelper.showError(exception);

        }
        finally{
            statement.close();
            connection.close();

        }
        return meals;
    }

    public ArrayList<Payment> getPayments() throws SQLException{

        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from paysfor");
            payments = new ArrayList<Payment>();

            while(resultSet.next()){
                payments.add(new Payment(
                        resultSet.getString("Pdate"),
                        resultSet.getString("pay_meth"),
                        resultSet.getInt("pid"),
                        resultSet.getString("meal_type"))
                );
            }

        }
        catch(SQLException exception){
            dbHelper.showError(exception);

        }
        finally{
            statement.close();
            connection.close();

        }
        return payments;
    }

    public ArrayList<Reservation> getReservations() throws SQLException{

        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from reservatesfor");
            reservations = new ArrayList<Reservation>();

            while(resultSet.next()){
                reservations.add(new Reservation(
                        resultSet.getString("Rdate"),
                        resultSet.getString("res_meth"),
                        resultSet.getInt("rid"),
                        resultSet.getString("meal_type"))
                );
            }

        }
        catch(SQLException exception){
            dbHelper.showError(exception);

        }
        finally{
            statement.close();
            connection.close();

        }
        return reservations;
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblClient = new javax.swing.JTable();
        lblIntro2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblReservation = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCompany = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblMeal = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblPayment = new javax.swing.JTable();
        txtPrmClient = new javax.swing.JTextField();
        txtPrmPayment = new javax.swing.JTextField();
        txtPrmCompany = new javax.swing.JTextField();
        txtPrmMeal = new javax.swing.JTextField();
        txtPrmEmployee = new javax.swing.JTextField();
        txtPrmReservation = new javax.swing.JTextField();
        btnTablesHomePage = new javax.swing.JButton();
        btnDeleteTable = new javax.swing.JButton();
        btnAddTable = new javax.swing.JButton();
        btnUpdateTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblClient.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Name", "City", "Gender", "Faculty", "Type", "EatDate", "PID", "RID", "CID"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClient);

        lblIntro2.setFont(new java.awt.Font("Baskerville Old Face", 3, 18)); // NOI18N
        lblIntro2.setForeground(new java.awt.Color(102, 0, 0));
        lblIntro2.setText("Here, in order to see table contents easily search for an item below or scroll manually.");
        lblIntro2.setToolTipText("");
        lblIntro2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Name", "City", "Gender", "Starting Date", "CID"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblEmployee);
        if (tblEmployee.getColumnModel().getColumnCount() > 0) {
            tblEmployee.getColumnModel().getColumn(0).setResizable(false);
            tblEmployee.getColumnModel().getColumn(1).setResizable(false);
            tblEmployee.getColumnModel().getColumn(2).setResizable(false);
            tblEmployee.getColumnModel().getColumn(3).setResizable(false);
            tblEmployee.getColumnModel().getColumn(4).setResizable(false);
            tblEmployee.getColumnModel().getColumn(5).setResizable(false);
        }

        tblReservation.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Date", "Method", "ID", "Meal Type"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblReservation);
        if (tblReservation.getColumnModel().getColumnCount() > 0) {
            tblReservation.getColumnModel().getColumn(0).setResizable(false);
            tblReservation.getColumnModel().getColumn(1).setResizable(false);
            tblReservation.getColumnModel().getColumn(2).setResizable(false);
            tblReservation.getColumnModel().getColumn(3).setResizable(false);
        }

        tblCompany.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Name"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblCompany);
        if (tblCompany.getColumnModel().getColumnCount() > 0) {
            tblCompany.getColumnModel().getColumn(0).setResizable(false);
            tblCompany.getColumnModel().getColumn(1).setResizable(false);
        }

        tblMeal.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Meal Type", "Price", "CID"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblMeal);
        if (tblMeal.getColumnModel().getColumnCount() > 0) {
            tblMeal.getColumnModel().getColumn(0).setResizable(false);
            tblMeal.getColumnModel().getColumn(1).setResizable(false);
            tblMeal.getColumnModel().getColumn(2).setResizable(false);
        }

        tblPayment.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Date", "Method", "ID", "Meal Type"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblPayment);
        if (tblPayment.getColumnModel().getColumnCount() > 0) {
            tblPayment.getColumnModel().getColumn(0).setResizable(false);
            tblPayment.getColumnModel().getColumn(1).setResizable(false);
            tblPayment.getColumnModel().getColumn(2).setResizable(false);
            tblPayment.getColumnModel().getColumn(3).setResizable(false);
        }

        txtPrmClient.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        txtPrmClient.setForeground(new java.awt.Color(0, 0, 102));
        txtPrmClient.setText("Parameter");
        txtPrmClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrmClientMouseClicked(evt);
            }
        });
        txtPrmClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrmClientActionPerformed(evt);
            }
        });
        txtPrmClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrmClientKeyReleased(evt);
            }
        });

        txtPrmPayment.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        txtPrmPayment.setForeground(new java.awt.Color(0, 0, 102));
        txtPrmPayment.setText("Parameter");
        txtPrmPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrmPaymentMouseClicked(evt);
            }
        });
        txtPrmPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrmPaymentActionPerformed(evt);
            }
        });
        txtPrmPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrmPaymentKeyReleased(evt);
            }
        });

        txtPrmCompany.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        txtPrmCompany.setForeground(new java.awt.Color(0, 0, 102));
        txtPrmCompany.setText("Parameter");
        txtPrmCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrmCompanyMouseClicked(evt);
            }
        });
        txtPrmCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrmCompanyActionPerformed(evt);
            }
        });
        txtPrmCompany.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrmCompanyKeyReleased(evt);
            }
        });

        txtPrmMeal.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        txtPrmMeal.setForeground(new java.awt.Color(0, 0, 102));
        txtPrmMeal.setText("Parameter");
        txtPrmMeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrmMealMouseClicked(evt);
            }
        });
        txtPrmMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrmMealActionPerformed(evt);
            }
        });
        txtPrmMeal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrmMealKeyReleased(evt);
            }
        });

        txtPrmEmployee.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        txtPrmEmployee.setForeground(new java.awt.Color(0, 0, 102));
        txtPrmEmployee.setText("Parameter");
        txtPrmEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrmEmployeeMouseClicked(evt);
            }
        });
        txtPrmEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrmEmployeeActionPerformed(evt);
            }
        });
        txtPrmEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrmEmployeeKeyReleased(evt);
            }
        });

        txtPrmReservation.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        txtPrmReservation.setForeground(new java.awt.Color(0, 0, 102));
        txtPrmReservation.setText("Parameter");
        txtPrmReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrmReservationMouseClicked(evt);
            }
        });
        txtPrmReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrmReservationActionPerformed(evt);
            }
        });
        txtPrmReservation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrmReservationKeyReleased(evt);
            }
        });

        btnTablesHomePage.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnTablesHomePage.setForeground(new java.awt.Color(0, 0, 102));
        btnTablesHomePage.setText("Log Out");
        btnTablesHomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablesHomePageActionPerformed(evt);
            }
        });

        btnDeleteTable.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnDeleteTable.setForeground(new java.awt.Color(0, 0, 102));
        btnDeleteTable.setText("Delete Data");
        btnDeleteTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTableActionPerformed(evt);
            }
        });

        btnAddTable.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnAddTable.setForeground(new java.awt.Color(0, 0, 102));
        btnAddTable.setText("Add Data");
        btnAddTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTableActionPerformed(evt);
            }
        });

        btnUpdateTable.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnUpdateTable.setForeground(new java.awt.Color(0, 0, 102));
        btnUpdateTable.setText("Update Data");
        btnUpdateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(lblIntro2, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(txtPrmClient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(txtPrmCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtPrmEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtPrmReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtPrmMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtPrmPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 38, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(btnTablesHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddTable, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateTable)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteTable, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddTable, btnDeleteTable, btnUpdateTable});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblIntro2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtPrmClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrmPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPrmCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrmMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtPrmEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrmReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnTablesHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAddTable, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUpdateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDeleteTable, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddTable, btnDeleteTable, btnTablesHomePage, btnUpdateTable});

        pack();
    }// </editor-fold>

    private void btnTablesHomePageActionPerformed(java.awt.event.ActionEvent evt) {

        new frmIntro().show();
        this.hide();
    }

    private void txtPrmClientActionPerformed(java.awt.event.ActionEvent evt) {
        txtPrmClient.setText("");
    }

    private void txtPrmPaymentActionPerformed(java.awt.event.ActionEvent evt) {
        txtPrmPayment.setText("");
    }

    private void txtPrmCompanyActionPerformed(java.awt.event.ActionEvent evt) {
        txtPrmCompany.setText("");
    }

    private void txtPrmMealActionPerformed(java.awt.event.ActionEvent evt) {
        txtPrmMeal.setText("");
    }

    private void txtPrmEmployeeActionPerformed(java.awt.event.ActionEvent evt) {
        txtPrmEmployee.setText("");
    }

    private void txtPrmReservationActionPerformed(java.awt.event.ActionEvent evt) {
        txtPrmReservation.setText("");
    }

    private void txtPrmClientKeyReleased(java.awt.event.KeyEvent evt) {
        String searchKey = txtPrmClient.getText();
        TableRowSorter <DefaultTableModel> tableRowSorter = new TableRowSorter <DefaultTableModel> (modelClient);

        tblClient.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }

    private void txtPrmClientMouseClicked(java.awt.event.MouseEvent evt) {
        txtPrmClient.setText("");
    }

    private void txtPrmPaymentMouseClicked(java.awt.event.MouseEvent evt) {
        txtPrmPayment.setText("");
    }

    private void txtPrmCompanyMouseClicked(java.awt.event.MouseEvent evt) {
        txtPrmCompany.setText("");
    }

    private void txtPrmMealMouseClicked(java.awt.event.MouseEvent evt) {
        txtPrmMeal.setText("");
    }

    private void txtPrmEmployeeMouseClicked(java.awt.event.MouseEvent evt) {
        txtPrmEmployee.setText("");
    }

    private void txtPrmReservationMouseClicked(java.awt.event.MouseEvent evt) {
        txtPrmReservation.setText("");
    }

    private void txtPrmPaymentKeyReleased(java.awt.event.KeyEvent evt) {
        String searchKey = txtPrmPayment.getText();
        TableRowSorter <DefaultTableModel> tableRowSorter = new TableRowSorter <DefaultTableModel> (modelPayment);

        tblPayment.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }

    private void txtPrmCompanyKeyReleased(java.awt.event.KeyEvent evt) {
        String searchKey = txtPrmCompany.getText();
        TableRowSorter <DefaultTableModel> tableRowSorter = new TableRowSorter <DefaultTableModel> (modelCompany);

        tblCompany.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }

    private void txtPrmMealKeyReleased(java.awt.event.KeyEvent evt) {
        String searchKey = txtPrmMeal.getText();
        TableRowSorter <DefaultTableModel> tableRowSorter = new TableRowSorter <DefaultTableModel> (modelMeal);

        tblMeal.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }

    private void txtPrmEmployeeKeyReleased(java.awt.event.KeyEvent evt) {
        String searchKey = txtPrmEmployee.getText();
        TableRowSorter <DefaultTableModel> tableRowSorter = new TableRowSorter <DefaultTableModel> (modelEmployee);

        tblEmployee.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }

    private void txtPrmReservationKeyReleased(java.awt.event.KeyEvent evt) {
        String searchKey = txtPrmReservation.getText();
        TableRowSorter <DefaultTableModel> tableRowSorter = new TableRowSorter <DefaultTableModel> (modelReservation);

        tblReservation.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }

    private void btnDeleteTableActionPerformed(java.awt.event.ActionEvent evt) {
        new frmDelete().show();
        this.hide();
    }

    private void btnAddTableActionPerformed(java.awt.event.ActionEvent evt) {
        new frmAdd().show();
        this.hide();
    }

    private void btnUpdateTableActionPerformed(java.awt.event.ActionEvent evt) {
        new frmUpdate().show();
        this.hide();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAddTable;
    private javax.swing.JButton btnDeleteTable;
    private javax.swing.JButton btnTablesHomePage;
    private javax.swing.JButton btnUpdateTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblIntro2;
    private javax.swing.JTable tblClient;
    private javax.swing.JTable tblCompany;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTable tblMeal;
    private javax.swing.JTable tblPayment;
    private javax.swing.JTable tblReservation;
    private javax.swing.JTextField txtPrmClient;
    private javax.swing.JTextField txtPrmCompany;
    private javax.swing.JTextField txtPrmEmployee;
    private javax.swing.JTextField txtPrmMeal;
    private javax.swing.JTextField txtPrmPayment;
    private javax.swing.JTextField txtPrmReservation;
    // End of variables declaration
}
