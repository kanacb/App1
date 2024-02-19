package lesson10_v2;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;


public class Panel extends JFrame  {
    private JTextField expenseField;
    private JList expensesList;
    private DefaultListModel listModel;

    @SuppressWarnings("unchecked")
    public Panel() {
        setTitle("Expense Tracker");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();

        // textField
        JPanel inputJPanel = new JPanel();
        JLabel expensLabel = new JLabel("Expense");
        expenseField = new JTextField(20);

        // button
        listModel = new DefaultListModel<>();
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new AddButtonListener());

        System.out.println("Get all");
        ExpensesService expenseService = new ExpensesService();
        Expense[] expenses = expenseService.get();
        for(int i=0; i<expenses.length; i++){
            listModel.add(i, expenses[i].getExpense());
        }
        
        inputJPanel.add(expensLabel);
        inputJPanel.add(expenseField);
        inputJPanel.add(addButton);

        // scroll list
        expensesList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(expensesList);

        // delete button
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new DeleteButtonLister());

        panel.add(inputJPanel);
        panel.add(scrollPane);
        panel.add(deleteButton);
        add(panel);
    }

    @SuppressWarnings("unchecked")
    private class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String expense_text = expenseField.getText().trim();
            if (!expense_text.isEmpty()) {
                listModel.addElement(expense_text);
                expenseField.setText("");
                String date = "2024-02-24";
                ExpensesService expensesService = new ExpensesService();
                Expense expense = new Expense(0, expense_text, Date.valueOf(date));
                expensesService.insert(expense);
            }
        }
    }

    private class DeleteButtonLister implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectIndex = expensesList.getSelectedIndex();
            if (selectIndex != -1) {
                listModel.remove(selectIndex);
            }
        }
    }


}
