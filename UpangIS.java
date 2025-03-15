import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;


public class UpangIS extends JFrame {

    private JPanel mainPanel;
    private JPanel scholarshipPanel;
    private CardLayout cardLayout;

    public UpangIS() {
        setTitle("UpangIS: Phinma UPang Information System");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        JPanel contentPane = new JPanel(cardLayout);
        setContentPane(contentPane);

        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        mainPanel.setBorder(new LineBorder(Color.RED));

          // Add the title label to the main panel
          JLabel titleLabel = new JLabel("UpangIS: Phinma UPang Information System");
          titleLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size and style
          titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the label horizontally
          mainPanel.add(Box.createVerticalGlue()); // Add vertical glue to center vertically
          mainPanel.add(titleLabel);
          mainPanel.add(Box.createVerticalGlue());

        scholarshipPanel = new JPanel();
        scholarshipPanel.setLayout(new GridLayout(0, 1)); // 0 rows, 1 column
        scholarshipPanel.setBorder(new LineBorder(Color.BLUE));

        JLabel title = new JLabel("Scholarship Options:");
        title.setHorizontalAlignment(JLabel.LEFT); // Align the title to the left
        scholarshipPanel.add(title);
        scholarshipPanel = new JPanel();
        scholarshipPanel.setLayout(new BoxLayout(scholarshipPanel, BoxLayout.Y_AXIS)); // Use BoxLayout
        scholarshipPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Add padding

        JScrollPane scrollPane = new JScrollPane(scholarshipPanel); // Add scroll pane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // PHINMA Scholarship Button
        JButton phinmaScholarshipButton = new JButton("1. PHINMA Scholarship (formerly Presidential Scholarship)");

        phinmaScholarshipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String scholarshipDetails = "Benefits:\n" +
                        "100% discount on tuition & miscellaneous fees for 4 or 5 years\n" +
                        "₱4,000 monthly allowance for Honors or Top 10 Grade 12 students who passed the qualifying exam.\n\n" +
                        "Maintenance:\n" +
                        "Service of 2 hrs/day at assigned department\n" +
                        "No grade below 2.0\n" +
                        "Average must be 1.75 or above\n" +
                        "Applicable during summer if required in the curriculum.\n\n" +
                        "Requirements:\n" +
                        "Scholarship Acceptance letter from Office of the President\n" +
                        "Enrollment Registration";
                JOptionPane.showMessageDialog(UpangIS.this, scholarshipDetails);
            }
        });

        scholarshipPanel.add(phinmaScholarshipButton);

        // Student Assistance Scholarship Button
        JButton studentAssistanceButton = new JButton("2. Student Assistance Scholarship");

        studentAssistanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String assistanceDetails = "Benefits:\n" +
                        "100% off the tuition (21 units only)\n\n" +
                        "Eligibility:\n" +
                        "Must be in good class standing\n" +
                        "Service of 4 hours/day at the assigned department\n" +
                        "Must have passing grades\n" +
                        "Not applicable during summer.\n\n" +
                        "Requirements:\n" +
                        "Should pass the examination and interview";
                JOptionPane.showMessageDialog(UpangIS.this, assistanceDetails);
            }
        });

        scholarshipPanel.add(studentAssistanceButton);

        // Valedictorian & Salutatorian Scholarship Button
        JButton valSalButton = new JButton("3. Valedictorian & Salutatorian Scholarship");

        valSalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valSalDetails = "Benefits:\n" +
                        "100% (Valedictorian) off the tuition for semester upon entry only.\n" +
                        "50% (Salutatorian) off the tuition for semester upon entry only.\n\n" +
                        "Requirements:\n" +
                        "Certificate from Principal\n" +
                        "Birth Certificate\n" +
                        "Enrollment Registration";
                JOptionPane.showMessageDialog(UpangIS.this, valSalDetails);
            }
        });

        scholarshipPanel.add(valSalButton);

        // Dean's List Scholarship Button
        JButton deanListButton = new JButton("4. Dean's List Scholarship");

        deanListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String deanListDetails = "Benefits:\n" +
                        "100% coverage of tuition fees for the top 10 for the semester following the Dean’s List award\n" +
                        "50% off the tuition fee for the top 11-25 for the semester following the Dean’s List award\n\n" +
                        "Requirements:\n" +
                        "Grades (to be applied in the Registrar)";
                JOptionPane.showMessageDialog(UpangIS.this, deanListDetails);
            }
        });

        scholarshipPanel.add(deanListButton);

        // With Highest Honor Scholarship Button
        JButton highestHonorButton = new JButton("5. With Highest Honor");

        highestHonorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String highestHonorDetails = "Benefits:\n" +
                        "100% off the tuition for semester upon entry only.\n\n" +
                        "Requirements:\n" +
                        "Certificate from Principal\n" +
                        "Birth Certificate\n" +
                        "Enrolment Registration";
                JOptionPane.showMessageDialog(UpangIS.this, highestHonorDetails);
            }
        });

        scholarshipPanel.add(highestHonorButton);

        // PHINMA UPang Direct Dependent Scholarship Button
        JButton dependentScholarshipButton = new JButton("6. PHINMA UPang Direct Dependent Scholarship");

        dependentScholarshipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dependentDetails = "Benefits:\n" +
                        "100% (with duty) or 50% off the tuition fee\n\n" +
                        "Eligibility:\n" +
                        "Must be in good class standing\n" +
                        "No maintaining grade.\n" +
                        "Applicable during regular semester and summer.\n\n" +
                        "Requirements:\n" +
                        "Birth Certificate of the child to be presented to UPang HRD\n" +
                        "Certification of Employment from UPang HRD\n" +
                        "Enrollment Registration\n\n" +
                        "Maintenance:\n" +
                        "The student must be a part of the top 11-25 of the Dean’s List who are not Presidential, Gov. Moreno, OJH, 1 of 100, or College scholar.\n" +
                        "The student must not have a mark of Incomplete, Dropped or Failed.\n" +
                        "The student must have a full load or at least 21 units for irregular students.\n" +
                        "The student must not have any disciplinary sanction.";
                JOptionPane.showMessageDialog(UpangIS.this, dependentDetails);
            }
        });

        scholarshipPanel.add(dependentScholarshipButton);

        // Hawak Kamay Scholarship Button
        JButton hawakKamayButton = new JButton("7. Hawak Kamay Scholarship");

        hawakKamayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hawakKamayDetails = "Benefits:\n" +
                        "HK5.5 (₱5,500 per semester)\n" +
                        "HK7.5 ( as low as ₱7,500 per semester)\n" +
                        "HK10 ( as low as ₱10,000 per semester)\n" +
                        "HK12.5 (as low as ₱12,000 per semester)\n" +
                        "** Books and uniforms not included\n\n" +
                        "Requirements:\n" +
                        "Must pass exam given at the Marketing Dept.\n" +
                        "No maintaining grade";
                JOptionPane.showMessageDialog(UpangIS.this, hawakKamayDetails);
            }
        });

        scholarshipPanel.add(hawakKamayButton);

        // Victory Liner, 5-Star, and Transasia Oil Employee & Direct Dependent Scholarship Button
        JButton victoryLinerButton = new JButton("8. Victory Liner, 5-Star, and Transasia Oil Employee & Direct Dependent Scholarship");

        victoryLinerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String victoryLinerDetails = "Benefits:\n" +
                        "25% off the tuition fee\n" +
                        "Renewable as long as the parent is an employee of the above\n\n" +
                        "Eligibility:\n" +
                        "Must be in good class standing\n" +
                        "No maintaining grade\n" +
                        "Not applicable during summer.\n\n" +
                        "Requirements:\n" +
                        "Certificates of Employment of Parents\n" +
                        "Employment ID\"Birth Certificates of Child\n" +
                        "Enrollment Registration";
                JOptionPane.showMessageDialog(UpangIS.this, victoryLinerDetails);
            }
        });

        scholarshipPanel.add(victoryLinerButton);

        // The Medical City Employee & Direct Dependent Scholarship Button
        JButton medicalCityButton = new JButton("9. The Medical City Employee & Direct Dependent Scholarship");

        medicalCityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String medicalCityDetails = "Benefits:\n" +
                        "50% off the tuition fees\n" +
                        "Renewable as long as the parent is still connected in the TMC\n\n" +
                        "Eligibility:\n" +
                        "Must be in good class standing\n" +
                        "No maintaining grade\n" +
                        "Applicable during regular semester and summer\n\n" +
                        "Requirements:\n" +
                        "Certificates of Employment from TMC HR\n" +
                        "Employment ID\n" +
                        "Birth Certificates of Child\n" +
                        "Enrollment Registration";
                JOptionPane.showMessageDialog(UpangIS.this, medicalCityDetails);
            }
        });

        scholarshipPanel.add(medicalCityButton);

        // Kapamilya @ PHINMA UPang Scholarship Button
        JButton kapamilyaButton = new JButton("10. Kapamilya @ PHINMA UPang Scholarship");

        kapamilyaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kapamilyaDetails = "Benefits:\n" +
                        "10% off the tuition for 2 siblings, plus 5% to each additional sibling enrolled in the University (basic education or college)\n\n" +
                        "Eligibility:\n" +
                        "No maintaining grades\n" +
                        "Applicable during summer if required in the curriculum\n\n" +
                        "Requirements:\n" +
                        "Birth Certificates of each sibling\n" +
                        "Certificate of Matriculation";
                JOptionPane.showMessageDialog(UpangIS.this, kapamilyaDetails);
            }
        });

        scholarshipPanel.add(kapamilyaButton);

        // PHINMA UPang Alumni Scholarship Button
        JButton alumniButton = new JButton("11. PHINMA UPang Alumni Scholarship");

        alumniButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String alumniDetails = "Benefits:\n" +
                        "10% off the tuition fee for graduates of the University (including Basic Education) and their direct dependents\n\n" +
                        "Eligibility:\n" +
                        "Must be in good class standing\n" +
                        "No maintaining grade\n" +
                        "Not applicable during summer\n\n" +
                        "Requirements:\n" +
                        "Alumni card from Alumni Office / Parent’s Diploma / OTR\n" +
                        "Birth Certificate of the Child\n" +
                        "Enrollment Registration";
                JOptionPane.showMessageDialog(UpangIS.this, alumniDetails);
            }
        });

        // Inside the scholarship panel:
            JButton backButton = new JButton("Back");
            backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            cardLayout.show(contentPane, "main");
            setSize(600, 600);
            setLocationRelativeTo(null);
    }
});

        scholarshipPanel.add(phinmaScholarshipButton);
        scholarshipPanel.add(studentAssistanceButton);
        scholarshipPanel.add(valSalButton);
        scholarshipPanel.add(deanListButton);
        scholarshipPanel.add(highestHonorButton);
        scholarshipPanel.add(dependentScholarshipButton);
        scholarshipPanel.add(hawakKamayButton);
        scholarshipPanel.add(victoryLinerButton);
        scholarshipPanel.add(medicalCityButton);
        scholarshipPanel.add(kapamilyaButton);
        scholarshipPanel.add(alumniButton);
        contentPane.add(scrollPane, "scholarship"); // Add scroll pane to contentPane
        scholarshipPanel.add(backButton);

        
        JButton scholarshipButton = new JButton("Scholarship");
        JButton courseButton = new JButton("Course ");

        // Make the buttons bigger
        scholarshipButton.setFont(new Font("Arial", Font.BOLD, 18));
        courseButton.setFont(new Font("Arial", Font.BOLD, 18));
        scholarshipButton.setPreferredSize(new Dimension(200, 50)); // Set preferred size
        courseButton.setPreferredSize(new Dimension(200, 50));

        scholarshipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "scholarship");
                setSize(400, 150);
                setLocationRelativeTo(null);
            }
        });

        courseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(UpangIS.this, "Course information will be displayed here.");
            }
        });

        mainPanel.add(scholarshipButton);
        mainPanel.add(courseButton);

        contentPane.add(mainPanel, "main");
        contentPane.add(scholarshipPanel, "scholarship");

        cardLayout.show(contentPane, "main");

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UpangIS();
            }
        });
    }
}