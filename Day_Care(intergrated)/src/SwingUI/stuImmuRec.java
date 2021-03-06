package SwingUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import version_without_rules.Daycare_rule;
import version_without_rules.ImmunizationRec;
import version_without_rules.Person;
import version_without_rules.Student;
import version_without_rules.StudentFactory;
import version_without_rules.Teacher;
import version_without_rules.TeacherFactory;
import version_without_rules.getImmuRec;
import javax.swing.ImageIcon;

public class stuImmuRec extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stuImmuRec f = new stuImmuRec("kai","5","4","sdf","Ad", "123235");
					f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public stuImmuRec() {
		
	}
*/
	/**
	 * Create the frame.
	 */
	public stuImmuRec(String Name, String age, String Gpa, String PName, String Address, String PhoneNum,Daycare_rule d) {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 725, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 710, 470);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStrudentImmunizationRecord = new JLabel("Strudent Immunization Record Form");
		lblStrudentImmunizationRecord.setBounds(19, 21, 512, 60);
		lblStrudentImmunizationRecord.setFont(new Font("Sitka Banner", Font.BOLD, 24));
		contentPane.add(lblStrudentImmunizationRecord);
		
		JLabel lblNewLabel = new JLabel("Hib :");
		lblNewLabel.setBounds(19, 84, 164, 32);
		lblNewLabel.setFont(new Font("Sitka Banner", Font.PLAIN, 22));
		contentPane.add(lblNewLabel);
		
		JComboBox Hib = new JComboBox();
		Hib.setBounds(149, 92, 119, 20);
		Hib.setMaximumRowCount(10);
		Hib.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		Hib.setSelectedIndex(0);
		contentPane.add(Hib);
		
		JLabel lblDtap = new JLabel("DTap :");
		lblDtap.setBounds(19, 127, 164, 32);
		lblDtap.setFont(new Font("Sitka Banner", Font.PLAIN, 22));
		contentPane.add(lblDtap);
		
		JLabel IbPolio = new JLabel("Polio :");
		IbPolio.setBounds(19, 170, 164, 32);
		IbPolio.setFont(new Font("Sitka Banner", Font.PLAIN, 22));
		contentPane.add(IbPolio);
		
		JLabel lblHepatitisB = new JLabel("Hepatitis B :");
		lblHepatitisB.setBounds(19, 213, 164, 32);
		lblHepatitisB.setFont(new Font("Sitka Banner", Font.PLAIN, 22));
		contentPane.add(lblHepatitisB);
		
		JLabel lblVaricella = new JLabel("Varicella :");
		lblVaricella.setBounds(19, 303, 164, 32);
		lblVaricella.setFont(new Font("Sitka Banner", Font.PLAIN, 22));
		contentPane.add(lblVaricella);
		
		JLabel lblNewLabel_1 = new JLabel("MMR :");
		lblNewLabel_1.setBounds(19, 256, 164, 32);
		lblNewLabel_1.setFont(new Font("Sitka Banner", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_1);
		
		JComboBox DTap = new JComboBox();
		DTap.setBounds(149, 133, 119, 20);
		DTap.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		DTap.setSelectedIndex(0);
		contentPane.add(DTap);
		
		JComboBox Polio = new JComboBox();
		Polio.setBounds(149, 176, 119, 20);
		Polio.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		Polio.setSelectedIndex(0);
		contentPane.add(Polio);
		
		JComboBox Hep = new JComboBox();
		Hep.setBounds(149, 219, 119, 20);
		Hep.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		Hep.setSelectedIndex(0);
		contentPane.add(Hep);
		
		JComboBox MMR = new JComboBox();
		MMR.setBounds(149, 262, 119, 20);
		MMR.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		MMR.setSelectedIndex(0);
		contentPane.add(MMR);
		
		JComboBox Vari = new JComboBox();
		Vari.setBounds(149, 309, 119, 20);
		Vari.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		Vari.setSelectedIndex(0);
		contentPane.add(Vari);
		
		JComboBox Tdap = new JComboBox();
		Tdap.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		Tdap.setSelectedIndex(0);
		Tdap.setMaximumRowCount(10);
		Tdap.setBounds(514, 91, 119, 20);
		contentPane.add(Tdap);
		
		JComboBox Meningococcal = new JComboBox();
		Meningococcal.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		Meningococcal.setSelectedIndex(0);
		Meningococcal.setMaximumRowCount(10);
		Meningococcal.setBounds(514, 134, 119, 20);
		contentPane.add(Meningococcal);
		//setup student immurec
		String csv = Name+","+age+","+Gpa+","+PName+","+Address+","+PhoneNum;
		StudentFactory  st = new StudentFactory();
		version_without_rules.Student stu = st.createPerson(csv);
		d.getSizeRatio(stu);
		d.addStudent(stu);
		
		if(d.getClassNum() == 0 || d.getGroupStuNum() == 0 ) {
			JOptionPane.showMessageDialog(null, "No enough Teacher for This Student!");
		}

		getImmuRec rec = new getImmuRec();
		int temp = Integer.parseInt(age);
		ImmunizationRec Im = new ImmunizationRec(temp);
		JButton btnNewButton = new JButton("Check if missing Immu Shots");
		btnNewButton.setBounds(363, 305, 278, 32);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				

				
				rec.updateImmuRec("Hib" + "," + Hib.getSelectedItem().toString());
				rec.updateImmuRec("DTap" + "," + DTap.getSelectedItem().toString());
				rec.updateImmuRec("Polio" + "," + Polio.getSelectedItem().toString());
				rec.updateImmuRec("Hepatitis B" + "," + Hep.getSelectedItem().toString());
				rec.updateImmuRec("MMR" + "," + MMR.getSelectedItem().toString());
				rec.updateImmuRec("Varicella" + "," + Vari.getSelectedItem().toString());
				rec.updateImmuRec("Tdap" + "," + Tdap.getSelectedItem().toString());
				rec.updateImmuRec("Meningococcal" + "," + Meningococcal.getSelectedItem().toString());
				
				
				if(Im.NeedVaccin(temp, rec.getImmurec())) {
					JOptionPane.showMessageDialog(null, "This Student needs to take new Immunization shots : "+ Im.getVaccine().toString());
				}else {
					JOptionPane.showMessageDialog(null, "This Student's Immunization record is perfect!!");
				}
				
				
				

//				helper(Name, age, Gpa, PName, Address, PhoneNum, x , d);
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnShowUpdatedTable = new JButton("Complete Adding Student");
		btnShowUpdatedTable.setBounds(363, 256, 278, 32);
		btnShowUpdatedTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// MAKE another Jframe
				String x = String.valueOf(Im.NeedVaccin(temp, rec.getImmurec()));
				addStudent(Name, age, Gpa, PName, Address, PhoneNum, x, d.getClassNum(), d.getGroupStuNum(), d.getTeacherName(),Hib.getSelectedItem().toString(),DTap.getSelectedItem().toString(),Polio.getSelectedItem().toString(),Hep.getSelectedItem().toString(),MMR.getSelectedItem().toString(),Vari.getSelectedItem().toString(),Tdap.getSelectedItem().toString(),Meningococcal.getSelectedItem().toString());

				dispose();
			}
		});
		contentPane.add(btnShowUpdatedTable);
		
		JLabel lblTdap = new JLabel("Tdap :");
		lblTdap.setFont(new Font("Sitka Banner", Font.PLAIN, 22));
		lblTdap.setBounds(365, 83, 164, 32);
		contentPane.add(lblTdap);
		
		
		
		JLabel lblMeningococcal = new JLabel("Meningococcal :");
		lblMeningococcal.setFont(new Font("Sitka Banner", Font.PLAIN, 22));
		lblMeningococcal.setBounds(365, 126, 164, 32);
		contentPane.add(lblMeningococcal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 710, 410);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(stuImmuRec.class.getResource("/images/a19N0q.jpg")));
		lblNewLabel_2.setBounds(0, 0, 710, 410);
		panel_1.add(lblNewLabel_2);
	}
	
	private void addStudent(String Name, String age, String Gpa, String PName, String Address, String PhoneNum, String NeedVaccine, int ClassNum,int GroupNum, String TeaName,String Hib ,String Dtap , String Polio ,String Hepatitis_B , String MMR , String Varicella , String Tdap, String Meningococcal) {
		String csv = Name+","+ age + "," + Gpa+","+ PName + "," + Address+","+PhoneNum;
		StudentFactory  st = new StudentFactory();
//		Person stu = st.createPerson(csv);

			try{
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con =DriverManager.getConnection(  
						"jdbc:mysql://localhost:3306/mydatabase","root","mySQL");  
				Statement st1 = con.createStatement();
				st1.executeUpdate("insert into stu(StudentName,Age,Gpa,ParentName,Address,PhoneNumber,Vaccine, ClassNum, GroupNum, TeaName, Hib ,Dtap , Polio ,Hepatitis_B , MMR , Varicella , Tdap, Meningococcal) values('"+Name+"','"+age+"','"+Gpa+"','"+PName+"','"+Address+"','"+PhoneNum+"','"+NeedVaccine+"','"+ClassNum+"','"+GroupNum+"','"+TeaName+"','"+Hib+"','"+Dtap+"','"+Polio+"','"+Hepatitis_B+"','"+MMR+"','"+Varicella+"','"+Tdap+"','"+Meningococcal +"')");
			}
			catch(Exception ex)
				{
				System.out.print(ex);
				ex.printStackTrace();
			}
	}
	
}
